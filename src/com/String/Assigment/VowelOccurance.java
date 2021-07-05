package com.String.Assigment;
import java.util.Scanner;
public class VowelOccurance {
	private static int count=0;
	public static int occuranceOfVowel(String input) {
		for(int i=0;i<input.length();i++) {	
			char ch=input.charAt(i);
				if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u') {
					count++;					
				}
		}		
		return count;
	}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Please Enter any sentence!");
			String input=sc.nextLine();		
		   int output=	occuranceOfVowel(input);
			sc.close();
			System.out.println("*********************************");
			System.out.println("input :"+input );
			System.out.println("frequency of vowel in sentence is :"+output);
			System.out.println("*********************************");
		}

	}