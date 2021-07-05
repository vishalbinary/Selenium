package com.String.Assigment;
import java.util.Scanner;
public class OccuranceLetter {
	private static int count=0;
	public static int occuranceOfLetter(String input, char letter) {	
		for(int i=0;i<input.length();i++) {		
			char ch=input.charAt(i);
				if(ch==letter) {
					count++;	
				}				
		}		
		return count;
	}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Please Enter any sentence!");
			String input=sc.nextLine();		
			System.out.println("Please Enter the letter to be counted");
			char letter = sc.next().charAt(0);	
		   int output=	occuranceOfLetter(input,letter);
			sc.close();
			System.out.println("*********************************");
			System.out.println("input :"+input );
			System.out.println("frequency of '"+letter+"' is : "+output);
			System.out.println("*********************************");
		}

	}


