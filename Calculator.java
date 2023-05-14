package week3.day1;

public class Calculator {
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public void multiple(double a, double b) {
		System.out.println(a*b);
	}
	
	public void multiple(float a, float b) {
		System.out.println(a*b);
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add(3, 8);
		calc.add(2, 3, 4);
		calc.multiple(2.3, 5.6);
		calc.multiple(2.3f, 5.6f);
		
	}

}
