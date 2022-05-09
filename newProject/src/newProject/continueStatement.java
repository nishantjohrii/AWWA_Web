package newProject;

public class continueStatement {

	public static void main(String[] args) {
		
		int [] numbers = {5,10,15,25,30,35,45,55};
		
		for (int i : numbers) {
			if (i==25) {
				continue;
			}
			System.out.println(i);
		}

	}

}
