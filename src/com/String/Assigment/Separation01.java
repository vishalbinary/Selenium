package com.String.Assigment;
import java.util.Scanner;
public class Separation01 {
	private static String one="";
	private static String zero="";
	public static String separate(String binary) {	
		for(int i=0;i<binary.length();i++) {
			if(binary.charAt(i)=='1') {
				one=one+binary.charAt(i);
			}
			else if(binary.charAt(i)=='0') {
				zero=zero+binary.charAt(i);
			}
		}
				return one.concat(zero);
	}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Please Enter any Binary Number!");
			String binary=sc.nextLine();		
			String output=separate(binary);
			sc.close();
			System.out.println("*********************************");
			System.out.println("input  : "+binary );
			System.out.println("output : "+output);
			System.out.println("*********************************");
		}

	}
