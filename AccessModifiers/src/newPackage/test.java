package newPackage;

public class test {
	
	public int publicVariable = 10;
	private int privateVariable = 20;
	protected int protectedVariable = 30;
	int defaultVariable = 40;
	
	public static void main(String[] args) {
		
		test mod = new test();
		System.out.println(mod.publicVariable);
		System.out.println(mod.privateVariable);
		System.out.println(mod.protectedVariable);
		System.out.println(mod.defaultVariable);
		
	}

}
