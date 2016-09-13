import java.util.*;
import java.util.Scanner;
public class Oddeven {
     public static void main(String args[])
     {
    	 Scanner in=new Scanner(System.in);
    	 System.out.println("enter the number");
    	 int n= in.nextInt();
    	 
    	 if(n % 2 == 0)
    	 {
    		 System.out.println("even number");
    	 }
    	 else
    	 {
    		 System.out.println("odd number");
    	 }
     }
}
