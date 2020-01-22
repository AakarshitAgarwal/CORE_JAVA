public class Test2
{  
  private static int k;
  static
  {
  System.out.println("Static Intialization Block:k="+k);
  k=10;
  }
  public static void main(String args[])
  {
   new Test2();
  }
}