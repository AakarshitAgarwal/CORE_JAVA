class A
{
   public A()
   {
   System.out.println("A");
   }
}
class B extends A
{
   public B()
   {
   this(4);
   System.out.println("B1");
   }
    public B(int k)
   {
   System.out.println("B2");
   }
}
public class Constructor_channing
{
  public static void main(String args[])
   {
    B ob1=new B();
   }
}
