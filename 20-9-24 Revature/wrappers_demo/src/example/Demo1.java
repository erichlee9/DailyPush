package example;

public class Demo1 {

	public static void main(String[] args) {
		Integer i1=10;//common pool
		Integer i2=10;//common pool
		Integer i3=new Integer(10); //heap
		
		
		
		System.out.println("i1==i2 : "+(i1==i2));
		System.out.println("i1==i3 : "+(i1==i3));
		//i1++;
		System.out.println("i1 = "+i1);
		System.out.println("i2 = "+i2);
		
		System.out.println("i1.equals(i2) : "+i1.equals(i2));
		System.out.println("i1.equals(i3) : "+i1.equals(i3));
		
		/*
		 * public int obj1.compareTo(ob2) - used for sorting, it is available in all the wrapper classes & String class
		 * if value of obj1 is equal to the value of obj2 it will return 0
		 * if value of obj1 is greater than value of obj2 it will return positive value
		 * if value of obj1 is lesser than value of obj2 it will return negative value
		 */
		Integer i4=19;
		System.out.println(i4.compareTo(99));
		
		//seems to return 0,1, or -1
		
		System.out.println(Integer.MAX_VALUE);  //static final variable
		
		int x=i4; //Autoboxing
		System.out.println("x : "+x);
		
		x=10000;
		i4=x; //Autoboxing------auto changing from object to primitive and vice versa 
		
		
		String s="12334";
		
		int a=Integer.parseInt(s); //common accross wrapper classes except character, changes string to integer
		System.out.println("a = "+a);
		
		//TASK IS HERE---------------------------------------------------------------------------------------------------------------------------------
		
		Double d1=new Double(500);
		Double d2=new Double(500);
		Double d3=500.0;
		
		System.out.println("d1.equals(d2) : "+d1.equals(d2));
		System.out.println("i1.equals(i3) : "+d1.equals(d3));
		System.out.println("compareTo of d1 and d2 "+d1.compareTo(d2));
		
		System.out.println(d1.compareTo(4000.0));
		Double d=Double.parseDouble(s);
		System.out.println("d= "+d);
		
		
		//System.out.println(Long.MAX_VALUE);
		Long l1=new Long(3234);
		Long l2=new Long(6546846);
		Long l3=Long.parseLong(12341234+"");
		
		System.out.println("comparison l1 and l2 "+l1.equals(l2));
		System.out.println("comparison l2 and l1 "+l2.equals(l1));
		System.out.println("compareTo of l1 and l2 "+l1.compareTo(l2));
		Long l=Long.parseLong(s);
		System.out.println("l= "+l);
		
		//System.out.println(Float.MAX_VALUE);
		Float f1=5.0f;
		Float f2=40f;
		Float f3=new Float(40);
		
		System.out.println("comparison f1 and f2 "+f1.equals(f2));
		System.out.println("compareTo of f1 and f2 "+f1.compareTo(f2));
		Float f=Float.parseFloat(s);
		System.out.println("parsed s to float= "+f);
		
		
		
		
		
		//-----------------------------------------------------------------------------------------------------------------------------------------------

	}
	
	
//Task, immitate above with floa, long, and double classes respectively 
}
