package eg1;

public class MobileObjectCasting {

	public static void main(String[] args) {
		
		/*
		 * Object Casting:
		 * 1)Its possible only and only between the parent & child relationship only
		 * 2)If there is no relationship of if the child object is not created and you try to convert your parent
		 * object to Child class it will throw unchecked ClassCastException
		 * 3)Conversion between casting is not possible
		 * 
		 * Types of Casting
		 * 1)Implicit Casting(done by compiler) - where child class object can be assigned to any parent class implicitly, but
		 * remember this doesn't mean the parent will be able to access any child
		 * 
		 * 2)Explicit Casting(Done by developer) -explicitly converting the reference of a parent to the child
		 * 
		 */
		
		
		MobileV1 v1=new MobileV3();
		

	}

}
