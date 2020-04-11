import java.io.*;
public class BufferReader{
	public static void main(String args[]) throws IOException{
		int ch;
		BufferedReader bf=new BufferedReader(new FileReader("forBuffReaderprg.txt"));
		while((ch=bf.read())!=-1){
			System.out.print((char)ch);
		}
		bf.close();
	}
}
