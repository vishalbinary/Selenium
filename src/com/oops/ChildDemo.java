package com.oops;

public class ChildDemo extends Overloading{
		public static void main(String args[]) {
		
		ChildDemo obj=new ChildDemo();
		
		int addValue=obj.add(5, 3);
		int multiResult=obj.multi(12, 12);
		
		System.out.println("added values is:: "+addValue);
		System.out.println("multiplication is:: "+multiResult);
	}

}
