package poly;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		
		Scanner arm=new Scanner(System.in);
		int a=arm.nextInt();
		
		int r, sum=0, temp=a;
		
		while (a>0) {
			r=a%10; //for remainder
			a=a/10; //for next number
			sum=sum+ (r*r*r);
		}
			if (temp==sum) 
			System.out.println("Its armstrong number");
		
			else
			
				System.out.println("Its not armstrong number");

			
	

}}