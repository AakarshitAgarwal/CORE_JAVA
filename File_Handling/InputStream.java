import java.io.*;
public class InputStream
{
	public static void main(String args[]) throws IOException
	{
		int i;
		FileInputStream fis=new FileInputStream("./mynewfile.txt");
		do{
			i=fis.read();
			if(i!=-1)
				System.out.print((char)i);
		  }while(i!=-1);
		  
	}
}
		