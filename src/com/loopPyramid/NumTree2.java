/*Output
 1
 2 3
 4 5 6
 7 8 9 10
 
 */
package com.loopPyramid;

import java.util.Scanner;

public class NumTree2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the height");
		int num=sc.nextInt();
		sc.close();
	int count=0;
		for(int i=1;i<=num;i++) {//This loop is for Row
			for(int j=1;j<=i;j++) {//This loop is to print column values
				count++;
				System.out.print(" "+count);
			}
			System.out.println();
		}

	}

}
