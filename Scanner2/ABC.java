import java.util.Scanner;
class ABC
{
public static void main(String ar[])
{
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a and b");
a=sc.nextInt();
b=sc.nextInt();
c=a+b;
//System.out.println(
System.out.format("Sum of %d and %d is %d",a,b,c);
//System.out.format("Sum of "+a+" and "+b+" is "+c);
}
}