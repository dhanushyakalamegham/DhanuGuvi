import java.util.*;
public class length
{
public static void main(String ar[])throws Exception
{
Scanner sc=new Scanner(System.in);
int n,j;
n=sc.nextInt();
String a[]=new String[100];
for(int i=0;i<n;i++)
{
a[i]=sc.next();
}
String l,check;
if(a.length>0)
l=a[0];
for(int i=1;i<a.length;i++)
{
check=a[i];
for(j=0;j<Math.min(l.length(),a[i].length());j++)
{
if(l.charAt(j)!=check.charAt(j))
break;
}
l=a[i].subString(0,j);
}
System.out.println("longest prefix is:"+l);
}
}
