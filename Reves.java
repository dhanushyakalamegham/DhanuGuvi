//String reverse in two methods
package s.com;

import java.util.Scanner;
import java.lang.*;
public class Reves {
	public static void main(String args[])
	{
		//String a="Wipro Technologies Bangalore";
		Scanner z=new Scanner(System.in);
		System.out.println("Enter your option 1 or 2");
		int c=z.nextInt();
		String a=z.nextLine();
		String[] a1=a.split(" ");
		//StringBuffer[] b=new StringBuffer[a1.length];
		String s="";
		int i,k;
		for(i=0;i<a1.length;i++)
		{
			s+=new StringBuffer(a1[i]).reverse().toString()+" ";
		}
		if(c==1)
		{
		System .out.println(s.trim());
		}
		
		else if(c==2)
		{
			StringBuffer b1=new StringBuffer(s);
			char[] d=a.toCharArray();
			for(k=0;k<a.length();k++)
			{
				if(Character.isUpperCase(a.charAt(k)))
				{
					b1.setCharAt(k,Character.toUpperCase(b1.charAt(k)));
				}
				else if(Character.isLowerCase(a.charAt(k)))
				{
					b1.setCharAt(k,Character.toLowerCase(b1.charAt(k)));
				}
				
			}
			System.out.println(new String(b1).trim());
		}
	}

}

