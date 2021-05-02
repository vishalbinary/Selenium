/*Output
 1
 1 2
 1 2 3
 1 2 3 4
 1 2 3 4 5
 */
package com.loopPyramid;

import java.util.Scanner;

public class NumTree1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the height");
		int num=sc.nextInt();
		sc.close();
		for(int i=1;i<=num;i++) {//This loop for Row	
			for(int j=1;j<=i;j++) {//This loop is to print values of j every time
				
				System.out.print(" "+j);
			}
			
			System.out.println();
		}
	}

}
