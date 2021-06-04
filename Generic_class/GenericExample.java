public class GenericExample
{
	public <E> void printArray(E []s)
	{
		for(E x:s)                  //for each loop
			System.out.println(x);
	}


public static void main(String args[]){
	GenericExample e1=new GenericExample();
	String countries[]=new String[]{"India","Pakistan","Nepal"};
	Integer numbers[]={12,20,30,45,67};
	e1.printArray(countries);
	e1.printArray(numbers);
	}
}
