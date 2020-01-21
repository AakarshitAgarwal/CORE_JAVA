public class Constructorbox
{
  private int l,b,h;
   /*public Constructorbox()
   {
   l=10;b=19;h=4;
   }*/
   public Constructorbox(int L,int B,int H)
   {
   l=L;b=B;h=H;
   System.out.println(+l+" "+b+" "+h);
   }
   public static void main(String []args)
   {
    //Constructorbox b1=new Constructorbox();
    Constructorbox b2=new Constructorbox(5,7,8);
    System.out.println(b2);
   }
}
     