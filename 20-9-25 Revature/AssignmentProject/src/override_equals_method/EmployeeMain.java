package override_equals_method;

public class EmployeeMain {

	public static void main(String[] args) {
			
		Employee e1=new Employee(202928, "Barney");
		System.out.println(e1);
		
		Employee e2=new Employee(202928, "Barney");
		System.out.println(e2.getIdnumber()+" "+e2.getNames());

	
	if(e2.equals(e1)) {
		System.out.println("Identical Employee Entry");
	}else {
		System.out.println("Different Employee Entry");
	}

}
}