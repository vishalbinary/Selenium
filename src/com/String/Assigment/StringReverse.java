// Program reverse the given string
package com.String.Assigment;
import java.util.Scanner;
public class StringReverse {
	private static String reverse="";
public static String reverseString(String string) {
	String str[]=string.split(" ");
	for(int i=str.length-1;i>=0;i--) {
		reverse=reverse+str[i]+" ";	
	}
	return reverse;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter any sentence!");
		String input=sc.nextLine();		
		String output=reverseString(input);
		sc.close();
		System.out.println("*********************************");
		System.out.println("input :"+input );
		System.out.println("output: "+output);
		System.out.println("*********************************");
	}

}
