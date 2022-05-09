package Polymorphism;

public class SBI extends RBI{

	public static void main(String[] args) {
		
		SBI obj = new SBI();
		System.out.println(obj.getHomeLoanROI());
	}
	
	public double getHomeLoanROI() {
		
		return 7.8;
	}

}
