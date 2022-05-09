package newProject;

public class testExceptions {

	public static void main(String[] args) {
		
		try {
			System.out.println("beginning");
			
		
			int divide = 10/0;
			System.out.println(divide);
		}
		
		catch (Throwable t) {
			System.out.println("Error occurred");
			System.out.println(t.getMessage());
		}
		
		System.out.println("ending");

	}

}
