//Assignment 1- (((((10+2)+2)-2)*2)/2)=12

public class Maths {
public int add(int a, int b) {
	
	int c=a+b;//local variable a and b for add method
	return c;	
}
public int sub(int a, int b) {
	
	int c=a-b; //local variable a , b and c for sub method
	return c;
}
public int multi(int a, int b)
{
	int c=a*b;//local variable a , b and c for multi method
	return c;
}
public void divi(int a, int b) {
	int c=a/b;
	System.out.println("resutl of the (((((10+2)+2)-2)*2)/2) is:: "+c);
	
}
public static void main(String[] args) {
	
	
	
	Maths obj=new Maths();//Object creation of the class
	int addResult1=obj.add(10, 2);
	int addResult2=obj.add(addResult1, 2);
	int subResult=obj.sub(addResult2,2);
	int multiResult=obj.multi(subResult, 2);
	obj.divi(multiResult, 2);
}
}
