import java.util.Scanner;

/*Class-5-Assignment-2
 * ((((x1-x2)+x3)-x4)/x5)*x6
 * */
public class ScannerDemo2 {
	
	public void multi(int a, int b) {
		int c = a * b;
		System.out.println("Output of ((((x1-x2)+x3)-x4)/x5)*x6 is::" + c);
	}

	public int add(int a, int b) {
		int c = a + b;
		return c;

	}

	public int sub(int a, int b) {
		int c = a - b;
		return c;

	}

	public int divide(int a, int b) {

		int c = a / b;
		return c;
		
	}
	
	public static void main(String[] args) {
		
	
	int values[] = new int[6];//Using Array to store inputs
	ScannerDemo2 obj = new ScannerDemo2();
	Scanner sc = new Scanner(System.in);//Scanner Class to take inputs
	for (int i = 0; i <= 5; i++) {
		int k = i + 1;
		System.out.println("Enter the values of x" + k);

		values[i] = sc.nextInt();
	}

	int subResult1 = obj.sub(values[0], values[1]);
	int sumResult = obj.add(subResult1, values[2]);
	int subResult2 = obj.sub(sumResult, values[3]);
	int divResult = obj.divide(subResult2, values[4]);
	obj.multi(divResult, values[5]);

}
}