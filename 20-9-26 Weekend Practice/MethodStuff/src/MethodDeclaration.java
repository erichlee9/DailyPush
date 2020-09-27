
public class MethodDeclaration {
	
	public static void main(String[] args) {
		
		int x=5;
		int y=10;
		double q=0;
		
		MethodDeclaration meth=new MethodDeclaration();
		meth.talk();
		
		int value=150;
		//int sameValue=getInt(value); //can also change the method to static
		int sameValue=meth.getInt(value);
		System.out.println(value);
		
		q=meth.remainder(8, 3);
		System.out.println(q);
		
	}
	
	public void talk() {
		
		int x=7; //variables have to be initialized within a method for that method to work with them
		int y=9;
		
		System.out.println("Inside of talk method");
		System.out.println(x+y);
		System.out.println("x and y are not 5 and 10"+" "+"see: "+x+", "+y);
	}
	
	public int getInt(int input) {
		return input;
	}
	
	public double remainder(int x, int y) {
		return x%y;
	}

}
