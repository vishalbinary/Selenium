//3 apr 2021
//Assignment 3-(a)-Output should be called in this manner
//four parameterized constructor
//one parameterized constructor
//default  constructor
//three parameterized constructor
//two parameterized constructor
public class ConstructorCall1 {//default  constructor
	public ConstructorCall1() {
		this(5);
		System.out.println("This is default constructor");
	}
	
	public ConstructorCall1(int a) {//one parameterized constructor
		this(1,2,3,4);
		System.out.println("This is one parameterized constructor");
		
	}
	
	public ConstructorCall1(int a, int b) {//two parameterized constructor
		this(5,10,15);
		System.out.println("This is two parameterizd constructor");
		
		
	}
public ConstructorCall1(int a, int b, int c) {//three parameterized constructor
	this();
	System.out.println("This is three parameterized constructor");
}
public ConstructorCall1(int a, int b,int c, int d) {//four parameterized constructor
	System.out.println("This is four parameterized constructor");
}
public static void main(String args[]) {//main method
	new ConstructorCall1(9,99);
	
}
}
