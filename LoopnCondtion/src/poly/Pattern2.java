/*output    *
           **
          ***/

          
package poly;
          
import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		System.out.println("Enter the value: ");
		Scanner pat2=new Scanner(System.in);
		int n=pat2.nextInt();
		
		int i, j, k;
		
		for ( i=1; i<=n;i++) // space 
		{
			//System.out.print(" ");
		
			for (j=n; j>=i; j--) {    //row 
				System.out.print(" ");
			}
			
			for (k=1; k<=i; k++) {   // column
				System.out.print("*" );
				
			
		}
		System.out.println( );
		}
		
	}}
		
	


