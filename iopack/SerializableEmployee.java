package iopack;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableEmployee {

	public static void main(String[] args) {
		
		try {
			Employee emp = new Employee(2,"bini");
			FileOutputStream fout = new FileOutputStream("C:\\Users\\HP\\Desktop\\Luminar\\employee.txt");
			
			ObjectOutputStream out = new ObjectOutputStream(fout);
			
			//ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\HP\\Desktop\\Luminar\\employee.txt"))
			
			out.writeObject(emp);
			
			out.flush();
			out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
