package programs.TwentyTwo;

import java.util.Scanner;

public class Person {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the Age");
		int age=scan.nextInt();
		if(age>=18) 
			System.out.println("The Person is eligible to Vote");
		else {
			try {
				throw new AgeInvalidException("The Person is Not Eligible To Vote");
			} catch (AgeInvalidException e) {
				System.out.println(e.getMessage());
			}
		}
		scan.close();				
	}

}
