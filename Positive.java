import java.io.*;
import java.util.Scanner;
public class Positive {
    public static void main(String args[])
    {
    	Scanner in=new Scanner(System.in);
    	System.out.println("enter the number");
    	int n=in.nextInt();
    	if(n>0)
    	{
    		System.out.println("the number is positive");
    	}
    	else if(n<0)
    	{
    		System.out.println("the number is negative");
    	}
    	else if(n==0)
    	{
    		System.out.println("zero");
    	}
    }
}
