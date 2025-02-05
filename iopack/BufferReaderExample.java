package iopack;

import java.io.BufferedReader;
//import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderExample {

	public static void main(String[] args) throws FileNotFoundException ,IOException  {
		
//		File fl = new File("C:\\Users\\HP\\Desktop\\Luminar\\firstfile.txt");
//		BufferedReader file = new BufferedReader(new FileReader(fl));
		
		FileReader fl = new FileReader("C:\\Users\\HP\\Desktop\\Luminar\\firstfile.txt");
		BufferedReader file = new BufferedReader(fl);
		try {
			String str;
			while((str = file.readLine())!=null) {
				System.out.println(str);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			file.close();
		}
	
	}

}
