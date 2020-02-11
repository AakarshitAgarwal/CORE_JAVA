abstract class A
{

}
class B extends A
{
   public B()
   { 
   System.out.println("B");
   }
}
public class Abstract_Class
{
  public static void main(String args[])
 {
  A ob1=new B();
 }
}