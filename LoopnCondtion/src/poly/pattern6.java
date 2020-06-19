package poly;

import java.util.Scanner;

public class pattern6 {
public static void main(String[] args) {
	System.out.println("Enter the value");
	Scanner pat6=new Scanner(System.in);
	
	int n= pat6.nextInt();
	int a=1;
	int i, j, k;
	
	for (i=1;i<=n;i++) {
		for (j=n;j>=i;j--) {
			System.out.print(" ");
		}
		
		for (k=1;k<=i; k++) {
			
		System.out.print(a + " ");
	     a=a+2;
	}
	System.out.println();
}
}}
