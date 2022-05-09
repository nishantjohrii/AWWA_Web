package Encapsulation;

public class Bank {
	
	private int AcctNo= 123456;
	private int PinNo= 1234;
	public int BalanceAmount= 100000;
	
	public void transaction(int accountNumber,int pin, int amount) {
		
		if (accountNumber==AcctNo && pin==PinNo) {
			
			if (amount<= BalanceAmount) {
				
				BalanceAmount= BalanceAmount-amount;
				System.out.println("Amount withdrawn is: " +amount);
				System.out.println("Balance Amount is: " +BalanceAmount);
				
			}else {
				System.out.println("insufficient balance");
			}
			
		}else {
			System.out.println("invalid credentials");
		}
	}
		
	public void updatePin(int AccNo, int oldPin, int newPin) {
		
		if (AccNo==AcctNo && oldPin==PinNo) {
			
			PinNo= newPin;
			System.out.println("Pin generated successfully");
			
		}else {
			System.out.println("invalid credentials for pin");
		}
	
	}

}
