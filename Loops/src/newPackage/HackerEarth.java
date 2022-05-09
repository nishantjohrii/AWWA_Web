package newPackage;

public class HackerEarth {
	
	static void proc1() {
		
		try {
			System.out.println("inside 1");
			throw new IllegalAccessError("Java");
		} catch (Exception e) {
			System.out.println("error");
		}
		
	}

	public static void main(String[] args) {
		
		proc1();

	}

}
