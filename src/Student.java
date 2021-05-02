
public class Student {
	
	int a; 
	int b;
	
	public void display1() {
		
		System.out.println("This is display1 method");
		
	}
public void display2() {
	
	System.out.println("This is display2 method");
}

public static void main(String args[])
{
	//Creating Student class object
Student obj=new Student();	
//calling  method display1
obj.display1();
//calling method display2
obj.display2();
//initializing the values of a and b
obj.a=5;
obj.b=10;
//print both the variable a and b
System.out.println("values of a is: "+obj.a);
System.out.println("values of b is :"+obj.b);


}
}
