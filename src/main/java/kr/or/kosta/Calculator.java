package kr.or.kosta;

public class Calculator {

	public void addition(int a, int b){
		System.out.println("addition()");
		int result = a + b;
		System.out.println(a + "+" + b + " = " + result);
	}

	public void subtraction(int a, int b){
		System.out.println("subtraction()");
		int result = a - b;
		System.out.println(a + "-" + b + " = " + result);
	}
	
	public void multiplication(int a, int b){
		System.out.println("multiplication()");
		int result = a * b;
		System.out.println(a + "*" + b + " = " + result);
	}
	
	public void division(int a, int b){
		System.out.println("division()");
		int result = a / b;
		System.out.println(a + "/" + b + " = " + result);
	}
}
