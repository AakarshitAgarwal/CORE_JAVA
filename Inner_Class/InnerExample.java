class Outer
{
	int x=10;
  class Inner{
  void if1(){
    System.out.println("if1():"+x);     //non-static inner class can access outer class variables
   }
 }
}
public class InnerExample{
 public static void main(String args[]){
	Outer out=new Outer();                //for non-static inner class make
    //Outer.Inner o1 =new Outer.Inner();  //for static inner class
	Outer.Inner o1=out.new Inner();       //for non-static inner class
	o1.if1();
 }
}