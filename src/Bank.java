/*Class 4- Assignment-(b)*/




public class Bank {
	
	
	
	
	public void p() {System.out.println("parent default method");}
	public void p1(int a) {
		this.p4(3, 44,5, 6);
		System.out.println("parent 1 parameterized method");}
	public void p2(int a, int b) {
		this.p1(88);
		
		System.out.println("parent 2 parameterized method");}
	public void p3(int a , int b, int c) {
		
		this.p2(4, 6);
		System.out.println("parent 3 parameterized method");}
	public void p4(int a, int b, int c,int d) {
		this.p();
		System.out.println("parent 4 parameterized method");}

}
