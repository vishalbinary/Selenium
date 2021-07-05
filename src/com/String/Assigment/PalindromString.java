package com.String.Assigment;
import java.util.Scanner;
public class PalindromString {
	private static String reverse="";
	public static void palindrome(String input) {	
		for(int i=input.length()-1;i>=0;i--) {
			reverse=reverse+(input.charAt(i));
		}
		System.out.println("input :"+input );
		System.out.println("output :'"+reverse);
		System.out.println("________________________");
		if(input.equalsIgnoreCase(reverse))
			System.out.println("given String is Palindrom");
		else
			System.out.println("given String is not Palindrom");
	}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Please Enter any String!");
			String input=sc.nextLine();		
	     	palindrome(input);
			sc.close();
		
		}

	}


