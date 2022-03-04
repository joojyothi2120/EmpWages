package com.bridgelabz;

public class EmployeeWages {
	
		public static final int IS_FULL_TIME = 1;
		  public static final int Wage_Per_Hr = 20;
	          public static final int IS_PART_TIME = 2;
		  public static void main(String args[]){

			int empCheck=(int) Math.floor(Math.random() * 10) % 3;
			int salary = 0;
			switch (empCheck) {
				case IS_FULL_TIME:
				     empCheck=0;
				     int empHrs=0;
				     break;
				case IS_PART_TIME:
				     empHrs=4;
				     break;
				default:
				     empHrs=0;
	}
			salary = empCheck * Wage_Per_Hr;
			System.out.println("Employee Salary is="+salary+ "Rupees");
	}

}
