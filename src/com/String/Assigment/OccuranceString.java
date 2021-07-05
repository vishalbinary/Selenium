package com.String.Assigment;
import java.util.Scanner;
public class OccuranceString {
	private static int count=0;
	public static int occuranceOfString(String input, String word) {
		String str[]=input.split(" ");
		for(int i=0;i<str.length;i++) {				
				if(str[i].equalsIgnoreCase(word)) 
					count++;	
		}
		
		return count;
	}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Please Enter any sentence!");
			String input=sc.nextLine();		
			System.out.println("Please Enter the word to be counted");
			String word=sc.nextLine();	
		   int output=	occuranceOfString(input,word);
			sc.close();
			System.out.println("*********************************");
			System.out.println("input :"+input );
			System.out.println("frequency of '"+word+"' is : "+output);
			System.out.println("*********************************");
		}

	}

