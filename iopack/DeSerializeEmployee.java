package iopack;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializeEmployee {

	public static void main(String[] args) {
		try {
			
			ObjectInputStream file = new ObjectInputStream(new FileInputStream("C:\\Users\\HP\\Desktop\\Luminar\\employee.txt"));
			
			Employee emp =(Employee)file.readObject();//one class -> another class = typeCast
			
			System.out.println("Employee");
			System.out.println(emp.empid+"  "+emp.name);
			 
			file.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
