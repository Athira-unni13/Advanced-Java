package iopack;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		//Step 1 : Open file for operation
		
		FileReader fr = new FileReader("C:\\Users\\HP\\Desktop\\Luminar\\firstfile.txt");
		//Step 2: do the work
		try {
			
			int i;
			while((i=fr.read())!=-1) {
				System.out.println((char) i);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			fr.close();
		}
		
	}

}
