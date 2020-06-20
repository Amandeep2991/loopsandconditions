/* If you make something static memory then 
 * it will allocate to class level instead of object level
 */

package poly;

public class statickeyword {

	static int a;  // default value=0, memory will allocate to class
	
	public void method()
	{
           a=a+1;
      }

	public static void main(String[] args) {
		statickeyword s1=new statickeyword();
		s1.method();
		System.out.println("s1--- value of "+s1.a); // output will 1 
		
		
		statickeyword s2=new statickeyword();
		s2.method();
		System.out.println("s2--- value of "+s2.a); //output as each code has its own memory
		
		statickeyword s3=new statickeyword();
		s3.method();
		System.out.println("s3--- value of "+s3.a); //output as each code has its own memory
		
	}
	}
