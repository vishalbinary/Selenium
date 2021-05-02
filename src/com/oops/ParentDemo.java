package com.oops;

public class ParentDemo {
	public ParentDemo() {
		this(1,2);
		System.out.println("This is parent Constructor");
	}
	public ParentDemo(int a) {
		System.out.println("This is 1 para construct");
		
	}
	public ParentDemo(int a, int b) {
		this(1);
		
		System.out.println("This is 2 para constuct");
	}
public static void main(String[] args) {
	ParentDemo obj=new ParentDemo();
}
}
