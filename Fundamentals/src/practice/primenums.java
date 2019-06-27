package practice;

public class primenums {
	public static void main(String[] args) {
		
		int count=0;
		int i,j;
		for(i=10;i<99;i++)
		{
		count=0;
		for(j=1;j<=i;j++) {
		if(i%j==0) {
		count=count+1;
		}
		}
		if(count==2)
		{
		System.out.println(i);
		}
		}
		}
}
