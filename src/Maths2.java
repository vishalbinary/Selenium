//Assignment 2- (((((10-2)+2)-2)*2)/2)=8
public class Maths2 {
	public int sub(int a, int b) {
		int c=a-b; //a,b and c are local variables
		return c;	
	}
public int add(int a, int b) {
	int c=a+b;//a,b and c are local variables
	return c;
}
public int multi(int a, int b) {
	
	int c=a*b;//a,b and c are local variables
	return c;
}
public void divide(int a, int b) {
	int c=a/b;//a,b and c are local variables
	System.out.println("Result of (((((10-2)+2)-2)*2)/2) is::: "+c);

}
public static void main(String[] args) {
	
	Maths2 obj=new Maths2();//Object creation of the class
	int subResult1=obj.sub(10, 2);
	int addResult=obj.add(subResult1, 2);
	int subResult2=obj.sub(addResult, 2);
	int multiResult=obj.multi(subResult2, 2);
	obj.divide(multiResult, 2);
}
}