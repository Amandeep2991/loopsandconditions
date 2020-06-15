package poly;

import java.util.Scanner;

public class Marks {
	public static void main(String[] args) {
		System.out.println("Enter marks");
		
		Scanner aman=new Scanner(System.in);
		int marks=aman.nextInt();
		
		//logic -ladder if else
		
		if((marks>=0)&&(marks<35))
		{
			System.out.println("Fail");
		}
		else if((marks>=35)&&(marks<50))
		{
			System.out.println("Mushkil se pass");
		}
		else if ((marks>50)&&(marks<=100))
		{
			System.out.println("Pass");
		}
	}

}
