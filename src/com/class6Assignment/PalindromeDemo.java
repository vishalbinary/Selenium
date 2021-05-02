package com.class6Assignment;

import java.util.Scanner;

public class PalindromeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Give any number");
		int num=sc.nextInt();
		sc.close();
		int t=num;
		 int reverse=0;
		
		while(num!=0) {
		int a=num%10;//it will give you 4//it will give you 2//it will give you 1
		num=num/10;//it will give you 12//it will give you 1//it will give you 0
		
		reverse=reverse*10+a;
		

	}
		System.out.println("Given num is= "+t);
		System.out.println("reverse num is= "+reverse);
		if(t==reverse)
			System.out.println("Given number is Palindrome");
		else
			System.out.println("Given number is not Palindrome");

		
	}

}
