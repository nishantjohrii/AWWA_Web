package Arrays;

import java.lang.reflect.Array;

public class ArrayForLoop {

	public static void main(String[] args) {
		
		int [] array = new int[5];
		
		for (int i=0; i<array.length;i++) {
			
			array[i] = (int) (Math.random()*100);
			System.out.println(array[i]);
		}

	}

}
