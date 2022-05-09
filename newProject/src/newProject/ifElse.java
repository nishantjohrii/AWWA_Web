package newProject;

public class ifElse {

	public static void main(String[] args) {
		
		int num = (int) (Math.random()*10);
		if (num < 5) {
			System.out.println(num + " is less than 5");
		}
		else if (num == 5) {
			System.out.println(num + " is equal to 5");
		}
		else
			System.out.println(num + " is more than 5");

	}

}
