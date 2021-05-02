//Swapping values using two variables
package com.class6Assignment;

public class SwappedWithTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=20;
System.out.println("Before Swapped value of a="+a+" and  b="+b);
b=b-a;
a=b+a;
b=a-b;

System.out.println("Swapped values of a="+a+" and b="+b);
	
	}

}
