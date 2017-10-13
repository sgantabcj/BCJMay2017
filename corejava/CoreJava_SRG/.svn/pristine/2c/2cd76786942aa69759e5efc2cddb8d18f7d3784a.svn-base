package com.crmindz.bcjmay2017.classes.simple.lab4;

public class StudentDemo {
	public static void main(String[] args) {
		Student studentOne = new Student(1001,'F');
		studentOne.setStudentName("Jackson");
		studentOne.setQualifyingExamMarks(95.0f);
		studentOne.setResidentialStatus('D');
		studentOne.setYearOfEngg(4);
		studentOne.setBranchName("CSE");
		
		if(studentOne.validateBranchName() && studentOne.validateExamMarks() && studentOne.validateStudentName()){
			System.out.printf("Student one details are:\nStudent Id - %d\nStudent Name - %s"
					+"\nQualifying marks - %.2f\nResidential status - %c\nCurrent year of engineering - %d\nBranch name - %s\n"
					,studentOne.getStudentId(),studentOne.getStudentName(),studentOne.getQualifyingExamMarks()
					,studentOne.getResidentialStatus(),studentOne.getYearOfEngg(),studentOne.getBranchName());
		}
		
		Student studentTwo = new Student(1002,'F');
		studentTwo.setStudentName("Jackson");
		studentTwo.setQualifyingExamMarks(68.0f);
		studentTwo.setResidentialStatus('H');
		studentTwo.setYearOfEngg(3);
		studentTwo.setBranchName("ABC");
		
		if(studentTwo.validateBranchName() && studentTwo.validateExamMarks() && studentTwo.validateStudentName()){
			System.out.printf("Student one details are:\nStudent Id - %d\nStudent Name - %s"
					+"\nQualifying marks - %.2f\nResidential status - %c\nCurrent year of engineering - %d\nBranch name - %s\n"
					,studentTwo.getStudentId(),studentTwo.getStudentName(),studentTwo.getQualifyingExamMarks()
					,studentTwo.getResidentialStatus(),studentTwo.getYearOfEngg(),studentTwo.getBranchName());
		}
		
	}
}
