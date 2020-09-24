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
////+1-9123456780
//"\\+1-[0-9]{10}"   the back slashes are "escape sequence" has something to do with metacharacters

/*
*validate all the ids you have
*-ssn
*-dlno
*-area pin code
*-car license plate
*/