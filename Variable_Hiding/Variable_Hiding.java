class Parent
{
   static int y=4;
}
class Child extends Parent
{
 static //static member variables do not inherit
 {y=5;}
}
public class Variable_Hiding
{
 public static void main(String args[])
  {
   System.out.println("y="+Child.y);  //y=4
  }
}