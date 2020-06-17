package poly;

import java.util.Scanner;

public class palindrome {
	
	public static void main(String[] args) {
		System.out.println("Enter the value of a");
		Scanner aman=new Scanner(System.in);
		int a=aman.nextInt();
		
		int r,sum=0,temp;    
		  
		  
		  temp=a;    
		  while(a>0){    
		   r=a%10;  //getting remainder  //121, r=1
		   sum=(sum*10)+r;   //sum is taking memory 0=0*10+1=1 
		   a=a/10;    //jo next two rhte h vo yaha divide kro
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
		 
		}
	


