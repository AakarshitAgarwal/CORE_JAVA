import java.util.*;
public class Calculator
{
   public static void main(String args[])
   {
   int d=0;
   int a=Integer.parseInt(args[0]);
   String op=args[1];
   int c=Integer.parseInt(args[2]);
   if(op.equals("+"))
      {
      d=a+c;
      System.out.println(d);
      }
      else if(op.equals("-"))
      {
      d=a-c;
      System.out.println(d);
      }
      else if(op.equals("*"))
      {
      d=a*c;
      System.out.println(d);
      }
      else
      {
      d=a/c;     
      System.out.println(d);
      }
    }
}