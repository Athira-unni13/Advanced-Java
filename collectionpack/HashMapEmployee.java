package collectionpack;

import java.util.HashMap;
import java.util.Map;

public class HashMapEmployee {

	public static void main(String[] args) {
		
//		Map<Integer,String> employee = new HashMap<>();
//		employee.put(23, "Athira");
//		employee.put(24, "Amala");
//		employee.put(25, "Arunima");
//		
//		for(int emp_id : employee.keySet()) {
//			System.out.println(" "+emp_id+" "+employee.get(emp_id));
//		}
		
		Map<Integer,Employee> employee = new HashMap<>();
		employee.put(101,new Employee(10000,"Athira"));
		employee.put(102,new Employee(15000,"Amala"));
		employee.put(103,new Employee(20000,"Arunima"));
		
		for(Map.Entry<Integer,Employee> detail:employee.entrySet()) {
			int key = detail.getKey();
			Employee emp = detail.getValue();
			System.out.println(key+" Details: ");
			System.out.println(emp.name+"  "+emp.salary);
		}
	}

}
