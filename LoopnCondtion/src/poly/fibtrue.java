package poly;

import java.util.Scanner;

public class fibtrue {

	public static void main(String[] args) {
		int a=1;
		int b = 1;
		int c=2;
		System.out.println("Enter the numbers:" +a +b +c);
	
		Scanner fib=new Scanner(System.in);
		a=fib.nextInt();
		b=fib.nextInt();
		c= fib.nextInt();
		
		int n=0, temp=c;
		for(int i = 1; i <= n; i++)
	        {
	            a = b;
	            b = c;
	            c = a + b;
		
	}
		if (temp==c)
			System.out.println("Its fibonnic series");
		else
			System.out.println("Its not a fibonnic series");
		
		
}}
