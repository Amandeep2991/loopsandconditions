package poly;

public class parentsuper {
	
	public  parentsuper() { //default constructor
	this(1,2);
	System.out.println("Parent Default parameterized of parent");
	}
	
	public  parentsuper(int a) {
		this(3,4,5);
		System.out.println("Parent 1 parameterized of parent");
		}
	
       public  parentsuper(int a, int b) {
	this (1);
		System.out.println("Parent 2 parameterized of parent");
		}
       
       public  parentsuper(int a, int b, int c) {  
   		System.out.println("Parent 3 parameterized of parent");
   		}
	
	public static void main(String[] args) {
		parentsuper sp=new parentsuper();
		
	}
}
