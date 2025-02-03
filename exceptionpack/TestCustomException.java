package exceptionpack;

import java.util.Scanner;

public class TestCustomException {
	public  static void validate(int age) throws InvalidAgeException {
		if(age < 18) {
			throw new InvalidAgeException("Age must be greater than 18");
		}else {
			System.out.println("Welcome to vote");
		}
	}

	public static void main(String[] args) throws InvalidAgeException {
		int age ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		age = sc.nextInt();
		validate(age);
//		try {
//			
//		}catch(InvalidAgeException e) {
//			System.out.println("Exception occured "+e);
//		}finally {
//			sc.close();
//			System.out.println("Rest of the code!");
//		}
		System.out.println("Rest of the code!");
	}

}
