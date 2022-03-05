package com.bridgelabz;

import java.util.Scanner;

public class Linecomparison {
	public static void main(String args[]){
		System.out.println("Wellcome to Line Comparison Program");
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter x1 Co-ordinate Number ::");
		int x1=sc.nextInt();

		System.out.println("Enter y1 Co-ordinate Number ::");
	        int y1=sc.nextInt();

		System.out.println("Enter x2 Co-ordinate Number ::");
	        int x2=sc.nextInt();

		System.out.println("Enter y2 Co-ordinate Number ::");
	        int y2=sc.nextInt();

		System.out.println("Enter p1 Co-ordinate Number ::");
	        int p1=sc.nextInt();

		System.out.println("Enter q1 Co-ordinate Number ::");
	        int q1=sc.nextInt();

		System.out.println("Enter p2 Co-ordinate Number ::");
	        int p2=sc.nextInt();

		System.out.println("Enter q2 Co-ordinate Number ::");
	        int q2=sc.nextInt();
		sc.close();

		double Length_of_Line1=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		double Length_of_Line2=Math.sqrt((p2-p1)*(p2-p1)+(q2-q1)*(q2-q1));

		System.out.println("Length of 1st End Point are ::"+Length_of_Line1);
		System.out.println("Length of 2nd End Point are ::"+Length_of_Line2);


		if(Length_of_Line1==Length_of_Line2) {
		System.out.println("Both Line are Equal");
		}
		else
		{
		System.out.println("Both Line are not Equal");
		}
	}
}
