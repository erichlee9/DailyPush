package bank_API_maven1_app.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//quit functionality, name and password input:
		Scanner scan=new Scanner(System.in);
		String un = "quit";
		String pw = null;
		
		System.out.println("Welcome to Erich Bank and Trust");
		System.out.println("*******************************");
		System.out.println("Please input username and password or type 'quit' to close app");
		System.out.println("--------------------------------------------------------------");
		//this block asks user to input username and password, should quit if user types "quit" in either input
		do {
			System.out.println("Username:");
			try {
			un=scan.nextLine();
			if(un.equals("quit")) {
				break;
			}else {
				System.out.println("Password: ");
				pw=scan.nextLine();
				if(pw.equals("quit")) {
					break;
				}else {System.out.println("Thank you for entering credentials, system under development");
				 break;}
			}
		//embedded if/else seems to work, need further instruction to continue. 
			
			}catch (IllegalArgumentException e) {
				
			}
		}while(un!="quit");
		
		
		

	}

}
