/*Class 4-Assignment-(a)
 * 
 */
public class Car {
	public Car() {// Default Constructor
		this(5,2,8);
		System.out.println("Parent Default Constructor");
	}

	public Car(String s) {// One Parameterised constructor
		this();
		System.out.println("Parent 1 Parameterized Constructor");

	}

	public Car(int a, int b) {// Two Parameterised Constructor
this(5,8,"one","two");
		System.out.println("Parent 2 Parameterized Constructor");
	}

	public Car(int a, int b, int c) {// Three Parameterised Constructor
		System.out.println("Parent 3 Parameterized Constructor");
	}

	public Car(int a, int b, String s1, String s2) {// Four Parameterised Constructor
		this("java");
		System.out.println("Parent 4 Parameterized Constructor");
	}
}
