package poly;

import java.util.Scanner;

public class Pclass {
	

	public static void main(String[] args) {
		Scanner aman=new Scanner(System.in);
		
		System.out.println("Enter the value:");
		int a=aman.nextInt();
		boolean b=true;
			for (int i=2;i<=a/2;i++) 
			{
				if (a%i==0) {
					b= false;
					//System.out.println("Its not prime no.");
				break;	
			}}
				if (b==true) {
				System.out.println("Its prime no.");
				}
				else 
				{
					System.out.println("Its not prime number");
			}
			}
	}	

