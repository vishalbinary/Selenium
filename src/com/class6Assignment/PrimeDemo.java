//Check if a number if prime or not
package com.class6Assignment;

import java.util.Scanner;

public class PrimeDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number");
		int num=sc.nextInt();
		sc.close();
		boolean isNum=true;
		
		for(int i=2; i<=num/2;) {
			if(num%2==0)
				isNum=false;
			break;
		}
			if(isNum)
				System.out.println(num+" is a Prime number");
			else
				System.out.println(num+" is not a Prime number");
		
	
		}
	
	}
