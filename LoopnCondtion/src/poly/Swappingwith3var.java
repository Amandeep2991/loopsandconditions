// swapping of variable with the use of third variable 

package poly;

import java.util.Scanner;

public class Swappingwith3var {
	public void Swap(int a, int b)
	{
		int c;
		c= a;
		a=b;
		b=c;
		
		System.out.println("Value of A After Swapping:"+a);
		System.out.println("Value of b After Swapping:"+b);

		
	}
	public static void main(String[] args) {
	Scanner aman=new Scanner(System.in);
	System.out.println("Enter value of A:");
	int a=aman.nextInt();
	
	System.out.println("Enter value of B:");
	int b=aman.nextInt();
	
	Swappingwith3var after=new Swappingwith3var();
	
	after.Swap(a,b);
				
		}
	}

