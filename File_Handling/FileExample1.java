import java.io.File;
import java.io.IOException;
public class FileExample1
{
	public static void main(String args[]) throws IOException
	{
		File f1=new File("C:/Users/500067782/Documents/java practice/File_Handling/name1.txt");
		f1.createNewFile();
		System.out.println("Is exists:"+f1.exists());
		System.out.println("Can file Read:"+f1.canWrite());
		System.out.println("File name:"+f1.getName());
		System.out.println("Length of file:"+f1.length());
		//f1.delete();
	}
}
