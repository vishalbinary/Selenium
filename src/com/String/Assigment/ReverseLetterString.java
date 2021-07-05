package com.String.Assigment;
import java.util.Scanner;
public class ReverseLetterString {
private static String reReverse="";
	public static String reverseLetter(String string) {
		String str[]=string.split(" ");
		for(int i=0;i<str.length;i++) {
		
			for(int j=str[i].length()-1; j>=0; j--) {
				reReverse=reReverse+str[i].charAt(j);				
			}
			reReverse=reReverse+" ";
		}
		
		return reReverse;
	}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Please Enter any sentence!");
			String input=sc.nextLine();		
		String output=	reverseLetter(input);
			sc.close();
			System.out.println("*********************************");
			System.out.println("input :"+input );
			System.out.println("output: "+output);
			System.out.println("*********************************");
		}

	}
