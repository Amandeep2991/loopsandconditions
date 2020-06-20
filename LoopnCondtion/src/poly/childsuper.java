package poly;

public class childsuper extends parentsuper //need inheritance

{

	public  childsuper() {
		super();
		System.out.println("child Default Parameterized constructor");
		
	}
	
	public  childsuper(int a) {
		this(23,34,45);
		System.out.println("child 1 Parameterized constructor");
		
	}
	public  childsuper(int a, int b) {
		this(34);
		System.out.println("child 2 Parameterized constructor");
		
	}
	public  childsuper(int a, int b, int c) {
		this();		
		System.out.println("child 3 Parameterized constructor");
		
	}
	public static void main(String[] args) {
		
		childsuper cs= new childsuper(23,32);
	
		
	}
}
