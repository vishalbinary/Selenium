package com.loopPyramid;

import java.util.Scanner;

public class StarDemo2 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the height");
	int num=sc.nextInt();
	sc.close();
	for(int i=num; i>=1;i--) {//this loop create new row
	
		for(int j=i;j>=1;j--) {//this loop create column in decreasing order
			
			System.out.print(" *");
		}
			
		System.out.println();
		
	}

	}

}
