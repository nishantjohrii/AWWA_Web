package newpckg1;

import newPackage.test;

public class Sample extends test{

	public static void main(String[] args) {
		
		Sample mod = new Sample();
		System.out.println(mod.publicVariable);
		//System.out.println(mod.privateVariable);
		System.out.println(mod.protectedVariable);
		//System.out.println(mod.defaultVariable);
		

	}

}
