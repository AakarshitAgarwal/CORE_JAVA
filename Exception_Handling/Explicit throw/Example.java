import java.util.*;
class Example{
 public static void main(String args[]){
  int balance=1000;
  System.out.println("Your Given balance is "+balance);
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the withdrawAmount");
  int withdrawAmount=sc.nextInt();
 try
 {
  if(balance<withdrawAmount)
   throw new ArithmeticException(" Insufficient balance");
  else
   balance =balance-withdrawAmount;
  System.out.println("Transaction Successfully Completed and remaining balance is "+balance);
  }
 catch(ArithmeticException e)
 {
  System.out.println("Exception:"+e.getMessage());
 }
  System.out.println("Program continue...");
 }
}