/*Output
    *
   **
  ***
 ****
*****
 */
package com.loopPyramid;

import java.util.Scanner;

public class StarDemo3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the height");
		int num=sc.nextInt();
		sc.close();
		boolean vishal=true;
		for(int i=1; i<=num;i++) {//this loop is for row
			for(int j=1;j<=i;j++) {//this loop is for print star
				
				for(int k=num-1; k>=i;k--) {//this loop is for create space
					if(vishal==false)//I have taken boolean to break the loop
						break;
					System.out.print(" ");
				}
				System.out.print("*");
			vishal=false;}
			System.out.println();
		vishal=true;}


	}

}
