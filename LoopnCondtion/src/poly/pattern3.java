/* output 
 *    1
 *   23
    456*/

 package poly;

import java.util.Scanner;

public class pattern3 {
public static void main(String[] args) {
	System.out.println("enter the value: ");
	Scanner patt3=new Scanner(System.in);
	int n= patt3.nextInt();
	int i, j, k;
	
	for (i=1;i<=n;i++) {
		for (j=n;j>=i; j--) {
			System.out.print(" ");
		}
		for (k=1; k<=i;k++) {
			System.out.print(+k);
	}
	System.out.println( );
	
}
}
}