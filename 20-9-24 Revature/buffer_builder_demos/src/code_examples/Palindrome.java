package code_examples;

public class Palindrome {

	public static void main(String[] args) {
		String s="madam1";
		
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		String s1=sb.toString();
		
		if(s.equals(s1)) {
			System.out.println("is palindrome");
		}else {
			System.out.println("not palindrome");
		}
		
		
		if(new StringBuffer(s).reverse().toString().equals(s)) {
			System.out.println("yep");
		}else {
			System.out.println("nope");
		}
		
		int x=121;
		if(new StringBuffer(x+"").reverse().toString().equals(x+"")) {
			System.out.println("Yep is pali");
		}else {
			System.out.println("no");
		}

	}

}
