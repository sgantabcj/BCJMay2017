package com.crmindz.bcjmay2017.oop.classes.medium.lab2;

public class EmployeeDemo {
	public static void main(String[] args) {
		Employee emp1 = new Employee("sravan","ganta",5500);
		Employee emp2 = new Employee("tharun","madadi",8500);
		
		System.out.printf("Initial yearly salary for %s is: %.2f and for %s is: %.2f\n"
							,emp1.getFirstName(),emp1.getMonthlySalary()*12
							,emp2.getFirstName(),emp2.getMonthlySalary()*12);
		
		emp1.setPercentageRaise(10);
		
		System.out.printf("Yearly salary after %.2f%% raise for %s is: %.2f and for %s is: %.2f"
				,emp1.getPercentageRaise(),emp1.getFirstName(),emp1.getMonthlySalary()*12+(emp1.getMonthlySalary()*12*10/100)
				,emp2.getFirstName(),emp2.getMonthlySalary()*12+(emp2.getMonthlySalary()*12*10/100));
	}
}
