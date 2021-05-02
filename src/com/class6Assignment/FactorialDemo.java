package com.class6Assignment;

import java.util.Scanner;

public class FactorialDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int n=num;
		sc.close();
		for(int i=num-1;i>=2;i--)//logic for factorial
		{
			num=num*i;
			
		}
		System.out.println("Factorial of "+n+" is :"+num);
	}

}
