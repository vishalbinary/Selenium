/*Class 4- Assignment (b)
 * Output
 * Parent Default method
 * Parent 4 parameterized method
 * parent 1 parameterized method
 * parent 2 parameterized method
 * parent 3 parameterized method
 * child default method
 * child 4 parameterized method
 * child 3 parameterized method
 * child 1 parameterized method
 * child 2 parameterized method
 */

public class SBI extends Bank {
	public void def() {
		super.p3(4, 55, 8);
		System.out.println("Child default method");
	}

	public void one(int a) {
		this.three(2, 5, 7);
		System.out.println("Child 1 parameterized method");
	}

	public void two(int a, int b) {
		this.one(5);
		System.out.println("Child 2 parameterized method");
	}

	public void three(int a, int b, int c) {
		this.four(3, 6, 55, 8);
		System.out.println("Child 3 parameterized method");
	}

	public void four(int a, int b, int c, int d) {
		this.def();
		System.out.println("Child 4 parameterized method");
	}

	public static void main(String[] args) {
		SBI obj = new SBI();
		obj.two(1, 2);
	}
}
