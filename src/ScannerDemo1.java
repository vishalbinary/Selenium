// Class-5-Assignment-1
/*((((x1*x2)+x3)+x3)-x5)/x6)
 * */

import java.util.Scanner;

public class ScannerDemo1 {
	public int multi(int a, int b) {
		int c = a * b;
		return c;

	}

	public int add(int a, int b) {
		int c = a + b;
		return c;

	}

	public int sub(int a, int b) {
		int c = a - b;
		return c;

	}

	public void divide(int a, int b) {

		int c = a / b;
		System.out.println("Output of ((((x1*x2)+x3)+x3)-x5)/x6) is::" + c);
	}

	public static void main(String[] args) {
		int values[] = new int[6];// Using Array to store inputs
		ScannerDemo1 obj = new ScannerDemo1();
		Scanner sc = new Scanner(System.in);// Scanner Class to take inputs
		for (int i = 0; i <= 5; i++) {
			int k = i + 1;
			System.out.println("Enter the values of x" + k);

			values[i] = sc.nextInt();
		}

		int multiResult = obj.multi(values[0], values[1]);
		int sumResult1 = obj.add(multiResult, values[2]);
		int sumResult2 = obj.add(sumResult1, values[3]);
		int subResult = obj.sub(sumResult2, values[4]);
		obj.divide(subResult, values[5]);
	}
}
