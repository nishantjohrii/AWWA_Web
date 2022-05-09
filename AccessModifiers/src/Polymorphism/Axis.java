package Polymorphism;

public class Axis extends RBI {

	public static void main(String[] args) {
		
		Axis obj = new Axis();
		System.out.println(obj.getHomeLoanROI());
		
	}
	public double getHomeLoanROI() {
		
		return 9.0;
	}
	
	public Axis getObject() {
		
		Axis obj = new Axis();
		return obj;
	}

}
