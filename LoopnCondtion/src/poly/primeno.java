package poly;

import java.util.Scanner;

public class primeno {
	public static void main(String[] args) {
		System.out.println("Enter the no.");
		Scanner aman=new Scanner(System.in);
		int x=aman.nextInt();
		
		if(x%2==0) {
			System.out.println("Its prime no");
		}
		else
		{
			System.out.println("Its not prime no");
		}
		
		
	}

}
