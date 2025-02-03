package collectionpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {

	public static void main(String[] args) {
		List<Teacher> teachers = new ArrayList<Teacher>();
		
		teachers.add(new Teacher(101,"thira",12345.5f));
		teachers.add(new Teacher(123,"bini",12800.5f));
		teachers.add(new Teacher(100,"khila",12340.5f));
		
		Collections.sort(teachers);
		
		for(Teacher t:teachers) {
			System.out.println(t.teacher_id+"\t"+t.teacher_Name+"\t"+t.Salary);
		}
	}

}
