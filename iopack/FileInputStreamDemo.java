package iopack;

import java.io.FileInputStream;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\HP\\Desktop\\Luminar\\firstfile.txt");
			int i;
			while((i=fin.read())!=-1) {
				System.out.println((char)i);
			}
			fin.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
