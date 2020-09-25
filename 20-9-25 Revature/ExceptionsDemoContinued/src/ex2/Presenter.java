package ex2;

import java.io.FileNotFoundException;

public class Presenter {

	public static void main(String[] args) {
		Logic l=new Logic();//this is a class
		try {
			l.openFile("hello.txt");
		}catch (FileNotFoundException e){
			System.out.println(e);
		}
		
		try {
		int res=l.divide(10, 5);
		System.out.println("Result is "+res);
		}catch(ArithmeticException e){
		System.out.println("Can't divide by zerio");
	}

}}
