package ex1;

public class Demo1 {

	public static void main(String[] args) {

		int a=10;
		int b=0;
		int res=0;
		
		try {
		res=a/b;
		System.out.println("result is "+res);
		
		}catch(ArithmeticException e) {
			System.out.println("you can't divide by zero "+e);
		}finally {
			System.out.println("result is "+res);
		}
		
		System.out.println("this is other line of code in my app");
		

	}

}
