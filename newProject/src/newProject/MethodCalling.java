package newProject;

public class MethodCalling {

	public static void main(String[] args) {
		
		MethodCalling m = new MethodCalling();
		m.go();
		m.go1();
		m.go2();
		
	}
	
	public void go() {
		System.out.println("inside Go Method");
		go1();
	}
	public void go1() {
		System.out.println("inside Go1 Method");
	}
	public void go2() {
		System.out.println("inside Go2 Method");
	}

}
