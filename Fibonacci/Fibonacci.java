import java.util.*;
public class Fibonacci
{
   public static void main(String args[])
   {
      int a=0,b=1,i=0;
      int n=Integer.parseInt(args[0]);
      System.out.println("Number of terms are "+n);
      System.out.print(a +" ");
      while (i <= n)
        {
            int sum = a + b;
            a = b;
            b = sum;
            i++;
            System.out.print(sum +"  ");
        }
    }
}
      