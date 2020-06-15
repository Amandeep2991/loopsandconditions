package poly;

import java.util.Scanner;

public class tables {
	public static void main(String[] args) {
		Scanner aman=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=aman.nextInt();
		
		System.out.println("Table of :"+a);
		for (int i=1; i<=10; i++)
		{
		
			System.out.println(a+"*"+i+"="+a*i);
		}
		
		
		
	}

}
