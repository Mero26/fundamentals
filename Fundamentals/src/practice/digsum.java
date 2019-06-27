package practice;

public class digsum {
	public static void main(String[] args) {
		
	    int n,sum;
	    n=Integer.parseInt(args[0]);
System.out.println("Enter a number ");
     
for(sum=0 ;n!=0 ;n/=10)
{
sum+=n%10;
}
System.out.println("Sum of digits of a number is "+sum);               	  
}
}
