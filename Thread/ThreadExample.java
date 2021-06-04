import java.util.*;
class Account
{
	private int bal;
	public Account(int bal)
	{this.bal=bal;}
	public boolean isSuffucientBalance(int w)
	{
		if(bal>w)
			return(true);
		else
			return(false);
	}
	public void withdraw(int amt)
	{
		bal=bal-amt;
		System.out.println("Withdrawl money is"+amt);
		System.out.println("Your current balance is"+bal);
	}
}
class Customer implements Runnable	
{
	private String name;
	private Account account;     //account type reference variable is used for Account 
	public Customer(Account a,String n)
	{ this.account=a;
	  name=n;
	}
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		
		synchronized(account)  //thread is now shared with shared resources account
		{
		System.out.println(name+":Enter amount to withdraw");
		int amt=sc.nextInt();
		if(account.isSuffucientBalance(amt))
		{
		    System.out.println(name);
			account.withdraw(amt);
		}
		else
		System.out.println("Insufficient Balance");
		}
	}
}
public class ThreadExample
{
 public static void main(String args[])
 {
	Account a1=new Account(1000);
	Customer c1=new Customer(a1,"Aakarshit"),c2=new Customer(a1,"xxxxx");
	Thread t1=new Thread(c1);
	Thread t2=new Thread(c2);
	t1.start();
	t2.start();
 }
}
 
	
		