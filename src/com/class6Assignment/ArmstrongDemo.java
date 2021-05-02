//Code of Armstrong number
package com.class6Assignment;

import java.util.Scanner;

public class ArmstrongDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int a=153
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		sc.close();
		int t = num;
		int pal = 0;
		while (num != 0) {
			int rem = num % 10;// it gives you remainder
			num = num / 10;

			pal = pal + (rem * rem * rem);

		}
		if (pal == t)
			System.out.println("Given number is armstrong");
		else
			System.out.println("Given number is not armstrong");

	}

}
