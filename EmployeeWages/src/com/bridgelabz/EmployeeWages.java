package com.bridgelabz;

public class EmployeeWages {

	public static void main(String[] args) {


		int isPartTimeHrs=8;
		int empWage=0;
		int empHrs=0;
		int wagePerHr=20;
		int isPartTime=1;
		double empcheck=(int)Math.floor(Math.random() * 10 % 2);
		if(empcheck == isPartTime)
		 {
			empHrs=8;
		 }
		else
		 {
			empHrs=0;
		 }
		empWage=(empHrs * wagePerHr);
		System.out.println("empWage:"+empWage);

	}

}
