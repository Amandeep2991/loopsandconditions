package poly;

public class increment {

	
	int a;  // default value=0
	
public void method()
{

a=a+1;


}

public static void main(String[] args) {
	increment static1=new increment();
	static1.method();
	
	System.out.println("static1--- value of "+static1.a); // output will 1 
	
	
	increment static2=new increment();
	static2.method();
	
	System.out.println("static2--- value of "+static2.a); //output as each code has its own memory
	

	increment static3=new increment();
	static3.method();
	
	System.out.println("static3--- value of "+static3.a); //output as each code has its own memory
	
}
}