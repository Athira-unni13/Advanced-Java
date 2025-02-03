package collectionpack;

public class Employees implements Comparable {
	int id;
	int salary;
	String name;

	Employees(int id, int salary, String name) {
		this.id = id;
		this.salary = salary;
		this.name = name;
	}

	@Override
	public int compareTo(Object object) {
		
		Employees emp = (Employees) object;
		
		/*
		 * int values = 0; if(this.id == emp.id) { return values+=values; }
		 */
		if (id == emp.id)
			return 0;
		else if (id > emp.id)
			return 1;
		else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return "id=" + id + " salary=" + salary + " name=" + name ;
	}
	
}
