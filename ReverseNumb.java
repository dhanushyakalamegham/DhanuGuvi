import java.util.Scanner;
 class ReverseNumb
{
   public static void main(String args[])
   {
      int a, reverse = 0;
 
      System.out.println("Enter the number to reverse");
      Scanner in=new Scanner(System.in);
      a=in.nextInt();
 
      while( a!=0 )
      {
          reverse=reverse*10;
          reverse = reverse+a%10;
          a=a/10;
      }
 
      System.out.println("Reverse of entered number is "+reverse);
   }
}
