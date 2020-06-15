package poly;

public class ploymorphism {
public int sum(int a, int b)
{
	int c;
	c=a+b;
//System.out.println("sum of two values:"+c);
return c;
}

public void sum(int m, int n, int p)
{
	int k;
	k=m+n+p;
	System.out.println("Sum of three values:"+k);


}
public static void main(String[] args) {
	ploymorphism aman=new ploymorphism();
	aman.sum(12, 3, 6);
	int aman1=aman.sum(12, 3); //  type of method koi bhi naam identify = ref var. method(values)
	System.out.println("Sum of third :"+aman1); // jo identify naam h usse hm output lete h
	
	
	
	
}
}
