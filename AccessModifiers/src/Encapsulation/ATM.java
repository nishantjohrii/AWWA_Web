package Encapsulation;

public class ATM {

	public static void main(String[] args) {
		
		Bank obj = new Bank();
		//
		
		obj.updatePin(123456, 1234, 2222);
		obj.transaction(123456, 2222, 1000);

	}

}
