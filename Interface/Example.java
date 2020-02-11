interface I1
{void f1(); }
interface I2
{void f2(); }
class A implements I1,I2
{ 
 public void f1() { }
 public void f2() { }
 public void f3() { }
}
class Example
{
 public static void main(String args[])
 {
   I2 obj=new A();
   obj.f1();
   obj.f2();   //error
   obj.f3();   //error
 }
}