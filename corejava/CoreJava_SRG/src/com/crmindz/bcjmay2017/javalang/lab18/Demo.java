package com.crmindz.bcjmay2017.javalang.lab18;

public class Demo {
	public static void main(String[] args) {
		Student studentOne = new Student();
		studentOne.setStudentId(1001);
		studentOne.setStudentName("Jackson");
		studentOne.setQualifyingExamMarks(95.0f);
		studentOne.setResidentialStatus('D');
		studentOne.setYearOfEngg(2);
		studentOne.setBranchName("CSE");
		
		if(studentOne.validateBranchName() && studentOne.validateExamMarks()){
			System.out.printf("StudentId: %d\nStudent Name: %s\nQualiying Marks: %.2f\nResidential Status: %c\nCurrent year of Engineering: %d\nBranch Name: %s"
								,studentOne.getStudentId(),studentOne.getStudentName(),studentOne.getQualifyingExamMarks()
								,studentOne.getResidentialStatus(),studentOne.getYearOfEngg(),studentOne.getBranchName());
		}
		
		Student studentTwo = new Student();
		studentTwo.setStudentId(1002);
		studentTwo.setStudentName("Jen");
		studentTwo.setQualifyingExamMarks(68.0f);
		studentTwo.setResidentialStatus('H');
		studentTwo.setYearOfEngg(3);
		studentTwo.setBranchName("ABC");
		
		if(studentTwo.validateBranchName() && studentTwo.validateExamMarks()){
			System.out.printf("StudentId: %d\nStudent Name: %s\nQualiying Marks: %.2f\nResidential Status: %c\nCurrent year of Engineering: %d\nBranch Name: %s"
					,studentTwo.getStudentId(),studentTwo.getStudentName(),studentTwo.getQualifyingExamMarks()
					,studentTwo.getResidentialStatus(),studentTwo.getYearOfEngg(),studentTwo.getBranchName());
		}
	}
}
