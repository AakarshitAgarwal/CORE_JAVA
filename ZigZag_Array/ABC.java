//\t-8space
//print only so that text comes in same line
//zig-zag array
import java.util.Scanner;
class ABC
{
public static void main(String ar[])
{
int i,j;
Scanner s=new Scanner(System.in);
int a[][]=new int[3][];
a[0]=new int[5];
a[1]=new int[3];
a[2]=new int[4];
System.out.println("Enter Values");
for(i=0;i<3;i++)
{
for(j=0;j<a[i].length;j++)
{
a[i][j]=s.nextInt();
}
}
System.out.println("Values are");
for(i=0;i<3;i++)
{
for(int x:a[i])
{
System.out.print(x+"\t");
}
System.out.println();
}
}
}