package collectionpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployeeComparable {

	public static void main(String[] args) {
		List employees = new ArrayList();
		
		employees.add(new Employees(12,120000,"bini"));
		employees.add(new Employees(5,125000,"Amal"));
		employees.add(new Employees(3,12000,"Binu"));
		
		Collections.sort(employees);
		
		System.out.println(employees);
		
		

	}

}
