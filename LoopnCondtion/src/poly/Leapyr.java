package poly;

import java.util.Scanner;

public class Leapyr {
	public static void main(String[] args) {
		System.out.println("Enter the year:");
		Scanner leap=new Scanner(System.in);
		int a=leap.nextInt();
		
		if (a%4==0) {
			System.out.println("Its leap yr");
		
		}
		else {
			System.out.println("Not leap yr");
	}
		}

}
