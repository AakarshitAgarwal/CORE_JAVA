import java.io.*;
public class BufferReader3{
	public static void main(String args[]) throws IOException{
		
		BufferedReader bf=new BufferedReader(new FileReader("forBuffReaderprg.txt"));
		char []s=new char[20];
		bf.read(s,2,4);
		System.out.println(s);
		bf.close();
	}
}
