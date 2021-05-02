/*Class 4-Assignment (a)-Car(Parent Class) and Audi(Child class)
 * Output
 * parent 3 Parameterized Constructor
 * parent  default Constructor
 * parent 1 Parameterized Constructor
 * parent 4 Parameterized Constructor
 * parent 2 Parameterized Constructor
 * Child  default Constructor
 * Child 3 Parameterized Constructor
 * Child 1 Parameterized Constructor
 * Child 2 Parameterized Constructor
 * Child 4 Parameterized Constructor
 * 
 * */
public class Audi extends Car{
	public Audi() {
		super(2,5);
		System.out.println("Child default Constructor");
	}

	public Audi(int a) {
		this(5,6,8);
		System.out.println("Child 1 Parameterized Constructor");
	}

	public Audi(int a, int b) {
		this(99);
		System.out.println("Child 2 Parameterized Constructor");
	}

	public Audi(int a, int b, int c) {
		this();
		System.out.println("Child 3 Parameterized Constructor");
	}

	public Audi(int a, int b, int c, int d) {
		this(5,8);
		System.out.println("Child 4 Parameterized Constructor");
	}
	public static void main(String[] args) {
		Audi obj=new Audi(1,2,3,4);
	}
}
