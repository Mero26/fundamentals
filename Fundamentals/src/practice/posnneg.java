package practice;

public class posnneg {
	public static void main(String[] args) 
    {
        int n;
       
        System.out.print("Enter the number you want to check:");
        n=Integer.parseInt(args[0]);
        if(n > 0)
        {
        	
            System.out.println("The given number "+n+" is Positive");
        }
        else if(n < 0)
        {
            System.out.println("The given number "+n+" is Negative");
        }
        else
        {
            System.out.println("The given number "+n+" is  ");
        }
    }

}
