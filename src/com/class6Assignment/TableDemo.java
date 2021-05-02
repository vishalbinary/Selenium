//This is a code of table
package com.class6Assignment;

import java.util.Scanner;

public class TableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number");
int num=sc.nextInt();
sc.close();
int i=0;
System.out.println("Table of "+num+" is");
do	
{
	i++;
	System.out.println(" "+i*num);

}while((i!=10));
	}

}
