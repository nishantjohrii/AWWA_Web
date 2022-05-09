package Interface;

public class Child extends ParentClass implements Parent1, Parent2{
	
	public void show() {
		System.out.println("Child show");
	}
	
	public static void main(String[] args) {
		
		Parent2 c = new Child();
		c.show();
	}

}
