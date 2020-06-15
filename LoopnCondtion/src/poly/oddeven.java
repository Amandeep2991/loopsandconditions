package poly;

import java.util.Scanner;

public class oddeven {
	public static void main(String[] args) {
		System.out.println("Enter the value:");
		Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		
		
		if (a%2==0)
		{
			System.out.println("Its even");
		}
		else
		{
			System.out.println("Its odd");
			
		}
		
		
	}
}
