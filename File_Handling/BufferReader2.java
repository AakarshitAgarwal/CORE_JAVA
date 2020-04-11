import java.io.*;
public class BufferReader2{
	public static void main(String args[]) throws IOException{
		
		BufferedReader bf=new BufferedReader(new FileReader("forBuffReaderprg2.txt"));
		String s1;
		while((s1=bf.readLine())!=null)   //reads all the lines
		System.out.println(s1);   //s1=bf.readLine()--> Read First line
		bf.close();
	}
}
