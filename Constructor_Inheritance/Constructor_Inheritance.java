class A
{
  int a;
  public A(int x)
  {
  a=x;
  System.out.println(""+a);
  }
}
class B extends A
{
  int b;
  public B()
  {
   super(5);
   System.out.println("B");
  }
}
class Constructor_Inheritance
{
  public static void main(String args[])
  {
   B obj=new B();
  }
}