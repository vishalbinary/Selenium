package org.testing.Assertion;

public class Assertions {
	public static void myAssertion(String expected, String actual) {
		
		if(expected.equals(actual)) {
			System.out.println("__________________________________");
			System.out.println(expected +"::"+actual);		
			System.out.println("Hurrey ! Succesfully  Matched");
			System.out.println("__________________________________");
		}
		else
		{
			System.out.println("*****************************");
			System.out.println(expected +"::"+actual);
			System.out.println("Sorry,Not Matched !");
			System.out.println("*****************************");
		}
		
		
	}

}
