package poly;

import java.util.Scanner;

public class Swapwithoutvar {
		public static void main(String[] args) {
			Scanner swap=new Scanner(System.in);
			
			System.out.println("Enter the value of a:");
			int a=swap.nextInt();
			
			System.out.println("Enter the value of b");
			int b=swap.nextInt();
			
			a=a+b;
			b=a-b;
			a=a-b;
			
			System.out.println("After swapping, value of A:"+a);
			System.out.println("After swapping, value of B:"+b);
			
			
		}
		
	}

	