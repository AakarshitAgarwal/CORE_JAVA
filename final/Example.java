final class Dummy //final class
{	} 
/*class Dummy
{
	public void somefunction()
	{}
}
class MoreDummy extends Dummy
{
	public void someFunction()   ----ERROR(SINCE METHODS CAN'T GET OVERIDDEN)----
	{}
}*/
public class Example
{ 
  private final int x; //final instance member variable
  private final static int y;//final static member function
  static 
  {y=4;}
  Example()
  {x=5;}
  public void func()
  {
     final int k; //final local variable 
  }
  public static void main(String args[])
    {
      Example e1=new Example();
    }
}