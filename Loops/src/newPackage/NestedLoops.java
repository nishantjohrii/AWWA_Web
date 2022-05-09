package newPackage;

public class NestedLoops {

	public static void main(String[] args) {
		
		// while--> 3
		// for --> 4
		// do--> 5
		
		int i=0;
		int count =0;
		
		while (i<3) {
			for (int j=0; j<4; j++) {
				int k =0;
				do { 
					System.out.println("value of i is: " +i+ " value of j is: "+j+ " value of k is: " +k);
					k++;
					count++;
					
				} 
				while (k<5);
			}
			i++;
			System.out.println("Total count is: "+count);
		}
		
		

	}

}
