package com.bridgelabz;

import java.util.Scanner;

public class Linecomparison {
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter  the Co-ordinates of 1st line1");
			System.out.println("Enter the Co-ordinates of x1 and y1:");
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			System.out.println("Enter the Co-ordinates of x2 and y2:");
			int x2 = sc.nextInt();
		        int y2 = sc.nextInt();
			double len1 = Math.sqrt((x2-x1)^2 + (y2-y1)^2);
			System.out.println();
			System.out.println("Enter  the Co-ordinates of 2nd line2");
			System.out.println("Enter the Co-ordinates of x3 and y3:");
			int x3 = sc.nextInt();
		        int y3 = sc.nextInt();
			System.out.println("Enter the Co-ordinates of x4 and y4:");
		        int x4 = sc.nextInt();
		        int y4 = sc.nextInt();
			double len2 = Math.sqrt((x4-x3)^2 + (y4-y3)^2);
			System.out.println("Length of the first Line1 is:"+len1+"units");
			System.out.println("Length of the second Line2 is:"+len2+"units");
			System.out.println();
			if(len1.compareTo(len2) == 1)
			System.out.println("Length of Line1 is greater than Line2");
			else if(len1.compareTo(len2) == -1)
			System.out.println("Length of Line1 is less than Line2");
			else
			System.out.println("Both lines are equal in length");
		}
		}








