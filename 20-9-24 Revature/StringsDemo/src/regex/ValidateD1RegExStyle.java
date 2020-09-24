package regex;

public class ValidateD1RegExStyle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String d1="AE-56785-Y";
		
		if(d1.matches("[A-Z]{2}-[0-9]{5}-[A-Z]{1}")) {
			System.out.println(d1+" validated");
			
		}else {
			System.out.println("invalid id");
		}
				
	}

}
