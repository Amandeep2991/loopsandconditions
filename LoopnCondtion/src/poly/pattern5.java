package poly;

import java.util.Scanner;

public class pattern5 
{

	public static void main(String[] args) {
	
	System.out.println("Enter value ");
	Scanner pat5=new Scanner(System.in);
	
	int n=pat5.nextInt();
	
	int i, j, a=2;
	for(i=1; i<=n; i++)    ///row 
	{
		for (j=1; j<=i; j++) {

			System.out.print(a + " ");
			a=a+2;
}
		
		System.out.println();
		
	}
	
	
	
}
}
