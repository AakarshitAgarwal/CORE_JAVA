class Book{
  int quantity;
    void Total(int q){
    quantity=q;
    System.out.println("Book available is :RD Sharma");
    System.out.println("Total no. of RD Sharma available"+q);
   }
    void Purchase(){
    Scanner p=new Scanner(System.in);
    System.out.println("Total no. of RD Sharma to purchase"+p.nextInt); 
    q=q-p;
    System.out.println("Total no. of RD Sharma left"+q);
   }
   void Add(){
    Scanner a=new Scanner(System.in);
    System.out.println("Total no. of RD Sharma to Add"+a.nextInt);
    q=q+a;
    System.out.println("Total no. of RD Sharma left"+q);
   }
}
class Example{
  public static void main(String args[]){
    Book b1=new Book();
    b1.Total(10);
    Book b2=new Book();
    b2.Purchase();
    Book b3=new Book();
    b3.Add();
  }
}
 
