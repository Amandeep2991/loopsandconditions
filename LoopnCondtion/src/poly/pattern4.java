package poly;

import java.util.Scanner;

public class pattern4 {
public static void main(String[] args) {
	System.out.println("Enter the value");
    Scanner pat4=new Scanner(System.in);
    int n=pat4.nextInt();
    int i, j;
    
    for (i=1; i<=n;i++) {
    	for (j=n; j>=i; j--) {
    		System.out.print("*");
    }
    System.out.println();
}}
}