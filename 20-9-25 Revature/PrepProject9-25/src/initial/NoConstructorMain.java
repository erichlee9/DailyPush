package initial;

public class NoConstructorMain {
	
	public static void main(String[] args) {
		String a="str";
		ConstructorNonMain x=new ConstructorNonMain(5, "Sam");
		System.out.println(x);
		
		ConstructorNonMain y=new ConstructorNonMain(6);
		System.out.println(y);
	
	}
	
	
}
