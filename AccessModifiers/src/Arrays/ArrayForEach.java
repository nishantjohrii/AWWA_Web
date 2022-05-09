package Arrays;

public class ArrayForEach {

	public static void main(String[] args) {
		
		int [] array = new int[5];
		
		for (int i=0; i<array.length; i++) {
			array[i] = (int)(Math.random()*1000);
		}
		
		for (int var:array) {
			
			System.out.println(var);
			
		}
		 System.out.println("-----------------");
		
		for (int i=array.length-1; i>=0; i--) {
			
			System.out.println(array[i]);
		
		}
		
		

	}
	

}
