package Calc;

public class CalcAssignment {
	
	
	public int add(int a, int b) {
		
		return a+b;
	}
	
	public int sub(int a, int b) {
		
		return a-b;
	}

	public int mul(int a, int b) {
		
		int result = a*b;
		return result;
	}
	
	public int div(int a, int b) {
		
		int result = a/b;
		return result;
	}
	
	public static void main(String[] args) {
		
		CalcAssignment calc = new CalcAssignment();
		System.out.println(calc.add(10, 20));
		
		int sub = calc.sub(20, 15);
		System.out.println(sub);
		
		System.out.println("Value of div is: " +calc.div(40, 5));
		System.out.println("Value of multiplication is: " +calc.mul(4, 5));
		
	}

}
