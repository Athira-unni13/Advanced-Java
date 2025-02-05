package iopack;

import java.io.DataInputStream;
import java.io.IOException;

public class DataInputStreamExample {

	public static void main(String[] args) throws IOException{
		int rollNo;
		String name;
		float marks;
		
		DataInputStream dis = new DataInputStream(System.in);
		
		try{
			System.out.print("Enter a RollNo: ");
			rollNo = Integer.parseInt(dis.readLine());//Object -> primitive dataType use
			
			System.out.print("Enter name:");
			name = dis.readLine();
			
			System.out.print("Enter the marks: ");
			marks = Float.parseFloat(dis.readLine());
			System.out.println("Details of students\n===================");
			System.out.println(rollNo+"  "+name+"  "+marks);
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			dis.close();
		}
		
		
	}

}
