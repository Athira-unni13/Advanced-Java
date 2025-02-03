package collectionpack;

public class Teacher implements Comparable<Teacher> {
	int teacher_id;
	String teacher_Name;
	float Salary;
	public Teacher(int teacher_id, String teacher_Name, float salary) {
		this.teacher_id = teacher_id;
		this.teacher_Name = teacher_Name;
		Salary = salary;
	}
	@Override
	public int compareTo(Teacher t) {
		if(teacher_id == t.teacher_id) {
			return 0;
		}
		else if(teacher_id > t.teacher_id) {
			return 1;
		}
		else {
			return 1;
		}
	}
	
}
