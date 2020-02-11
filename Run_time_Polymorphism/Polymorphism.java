//Run-time polymorphism,Dynamic Method Dispatch
class A
{
  int i=10;
  public void m1()  //static keyword should not be used
  {
    System.out.println("Class A");
  }
}
class B extends A  
{
  int i=20;
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
  A obj2=new A();
  A obj3=new B();
  obj.m1();   //class A
  obj1.m1();  //class B
  System.out.println(obj2.i);
  System.out.println(obj3.i);  
  }
}  

 