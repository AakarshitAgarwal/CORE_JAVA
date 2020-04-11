import java.io.*;
public class BufferWriter
{
	public static void main(String args[]) throws IOException{
		FileWriter fw=new FileWriter("file1.txt",true);
		BufferedWriter bf=new BufferedWriter(fw);
		bf.write("Hey, it's me Aakarshit");
		bf.close();
	}
}