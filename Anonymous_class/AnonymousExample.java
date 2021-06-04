class Greeting 
{
	public void Trump()
	{
		System.out.println("Hello");
	}
}
class India
{
	Greeting g=new Greeting(){
		public void Trump()      //ek tareke se greeting ki child class bana di ha!
		{
			System.out.println("Namaaasteeee");
		}
	};
}
public class AnonymousExample
{
	public static void main(String args[])
	{
		India india=new India();
		india.g.Trump();
	}
}

		