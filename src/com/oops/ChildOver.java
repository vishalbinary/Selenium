package com.oops;

public class ChildOver extends Overriding {
	
public void show() {
		
		
		
		System.out.println("This is ChildOver method");
		
		
	}
public void display() {
	
	System.out.println("This is display ChildOver");
}
public static void main(String[] args) {
	Overriding obj=new ChildOver();
	obj.show();

}
}
