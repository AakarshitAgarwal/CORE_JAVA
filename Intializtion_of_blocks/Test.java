public class Test{
 private int x;   //instance value is 0 by default
  {
   System.out.println("Intialization block:x="+x);   /*for every object value of x is intialize to 0*/
  x=5;
  }
  public Test(){
  System.out.println("Constructor:x="+x);
  }
  public static void main(String args[]){
  Test t1=new Test();
  Test t2=new Test();
   }
}
