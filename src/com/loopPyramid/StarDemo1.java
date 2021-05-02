/*OUtput
 * 
 * *
 * * *
 * * * * 
 */
package com.loopPyramid;

import java.util.Scanner;

public class StarDemo1 {

	public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
System.out.println("Enter the height");
int num=sc.nextInt();
sc.close();
for(int i=1; i<=num;i++) {//This loop is for row
	System.out.println();
for(int j=1; j<=i;j++) {//This loop is to print *, for j times
	System.out.print(" *");

}
}
	}

}
