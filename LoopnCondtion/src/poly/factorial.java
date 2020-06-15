package poly;

import java.util.Scanner;

public class factorial {


	public static void main(String[] args) {
		System.out.println("Enter the value of a:");

		Scanner fact=new Scanner(System.in);
		int number=fact.nextInt();
		int i, a=1;
		for (i=1;i<=number;i++) {
			a=a*i;
			
		}
		System.out.println("Factorial of number:" +a);
		
	}
}
