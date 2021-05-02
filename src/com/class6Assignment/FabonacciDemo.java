package com.class6Assignment;
import java.util.Scanner;
public class FabonacciDemo {
	static int a=0, b=1;
	static int fabo;
	public static void fabonacci(int num) {
		System.out.print(a+" "+b);
	for(int i=2; i<num;i++)	 {
			 fabo=a+b;
			System.out.print(" "+fabo);
			 a=b; b=fabo;
	}	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of fabonacci series");
		int num=sc.nextInt();
		sc.close();
		fabonacci(num);
	}
}