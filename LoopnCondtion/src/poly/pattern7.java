package poly;

import java.util.Scanner;

public class pattern7 {
public static void main(String[] args) {
	System.out.println("Enter the value of n:");
	Scanner pat7= new Scanner(System.in);
	
	int n=pat7.nextInt();
	
	int i, j, k;
	
	for (i=1;i<=n;i++) {
		for (j=n;j>=i;j--) {
			System.out.print(" ");
		}
		
		for (k=-i;k<=i-1; k++) {
			
		System.out.print("*");
	   
	}
	System.out.println();
}
}}
