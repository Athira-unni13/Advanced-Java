package collectionpack;

import java.util.ArrayList;
import java.util.List;

public class Student {
	int rollNo;
	String name;
	int Mark;
	String Grade;

	Student(int rollNo, String name, int Mark, String Grade) {
		this.rollNo = rollNo;
		this.name = name;
		this.Mark = Mark;
		this.Grade = Grade;
	}

	@Override
	public String toString() {
		return "RollNo = " + rollNo + " Name = " + name + " Mark = " + Mark + " Grade = " + Grade;
	}

	public static void main(String[] args) {

		List<Student> Details = new ArrayList<Student>();

		Details.add(new Student(1, "Amal", 124, "B"));
		Details.add(new Student(2, "Arun", 135, "B+"));
		Details.add(new Student(4, "Athul", 144, "A"));
		Details.add(new Student(5, "Arun", 146, "A+"));

		for (Student student : Details) {
			System.out.println(student);
		}
	}

}
