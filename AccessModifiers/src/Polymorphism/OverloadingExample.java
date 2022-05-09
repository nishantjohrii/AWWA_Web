package Polymorphism;

public class OverloadingExample {

	public static void main(String[] args) {
		
		OverloadingExample obj = new OverloadingExample();
		obj.add(1, 2, 3);
		obj.sample(1, 2);

	}
	
	public void add(int a, int b) {
		
	}
	
	public void add (int a, int b, int c) {
		
	}
	
	public void sample (int a, double b) {
		
	}
	
	public void sample (double a, double b) {
		
	}

}
