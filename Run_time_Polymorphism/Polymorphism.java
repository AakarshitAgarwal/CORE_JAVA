//Run-time polymorphism,Dynamic Method Dispatch
class A
{
  public void m1()  //static keyword should not be used
  {
    System.out.println("Class A");
  }
}
class B extends A  
{
  public void m1()
  {
    System.out.println("Class B");
  }
}
public class Polymorphism
{
 public static void main(String args[])
  {
  A obj=new A();
  A obj1=new B();
  obj.m1();   //class A
  obj1.m1();  //class B
  }
}  

 