package example;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);// only to console
		
		System.out.println("Enter your name");
		//String name=sc.next();//reads only 1 word
		String name=sc.nextLine();
		System.out.println("Enter Your Age");
		int age=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Salary");
		double salary=Double.parseDouble(sc.nextLine());
		
		System.out.println("Hello "+name);
		System.out.println("Age : "+age);
		System.out.println("Salary : "+salary);
	}

}
