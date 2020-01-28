import java.util.Scanner;
class ABC
{
public static void main(String ar[])
{
int i,n;
Scanner sc=new Scanner(System.in);
System.out.println("enter size of array");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter "+ n + " Elements");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
//---------------------------------
//System.out.println("Values are");
//for(i=0;i<n;i++)
//System.out.println(a[i]);
//---------------------------------
//System.out.println("Values are");
//for(i=0;i<a.length;i++)
//System.out.println(a[i]);
//---------------------------------
System.out.println("Values are");
for(int k:a)
System.out.println(k);
}
}