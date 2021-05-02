//Assignment 3-(b)-Output should be called in this manner
//three parameterized constructor
//default  constructor
//one  parameterized constructor
//four parameterized constructor
//two parameterized constructor
public class ConstructorCall2 {
	
		public ConstructorCall2() {//default  constructor
			this(1,8,6);
			System.out.println(" default constructor");
		}
		
		public ConstructorCall2(int a) {//one parameterized constructor
			this();
			System.out.println("One");
			
		}
		
		public ConstructorCall2(int a, int b) {//two parameterized constructor
			this(5,10,15,19);
			System.out.println(" Two");
			
			
		}
	public ConstructorCall2(int a, int b, int c) {//three parameterized constructor
		
		System.out.println("Three");
	}
	public ConstructorCall2(int a, int b,int c, int d) {//four parameterized constructor
		this(99);
		System.out.println("Four");
	}
	public static void main(String args[]) {//main method
		new ConstructorCall2(0,0);
		
	}
	}
