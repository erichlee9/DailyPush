package eg1;

public class SbDemo1 {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("hello");
		System.out.println(sb);
		sb.append(" heyyyyy");
		System.out.println(sb);
		System.out.println(sb.length());
		sb.insert(2, "JAVA");
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb);
		
		sb.delete(3, 8);
		System.out.println(sb);
		
		
		StringBuffer sb1=new StringBuffer("JAVA");
		StringBuffer sb2=new StringBuffer("JAVA");
		
		System.out.println(sb1.equals(sb2)); //compares addresses here exactly like == operator by default
		//reason stringbuffer and stringbuilder doesn't have equals method so they take it from the parent class object which
		//compares the memory not the data
		
		System.out.println(sb1.toString().equals(sb2.toString()));
		

	}

}
