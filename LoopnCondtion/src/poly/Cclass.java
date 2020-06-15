package poly;

//import com.sun.tools.javac.launcher.Main;

public class Cclass extends Pclass {
	public void   sum(int a, int b) {
		int c;
		c=a+b;
		System.out.println("sum of the values:"+c);
		//return c;
}
	public static void main(String[] args) {
		Cclass aman=new Cclass();
		aman.sum(12, 3);
	
		
	}
}
