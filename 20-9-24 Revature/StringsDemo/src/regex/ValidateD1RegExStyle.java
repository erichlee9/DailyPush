package regex;

public class ValidateD1RegExStyle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String d1="AE-56785-Y";
		
		//if(d1.matches("[A-Z]{2}-[0-9]{5}-[A-Z]{1}")) {
		//	System.out.println(d1+" validated");
			
		//}else {
		//	System.out.println("invalid id");
		//}
		
//----------------------------------------------Assessment is here------------------------------------------------------------------------		
		//String ss="123-12-1234";
		//if(ss.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}")){
		//	System.out.println("Valid");
		//}else {
		//	System.out.println("invalid ssn");
		//}
		
		//String dlno=12345679+"";
		//if(dlno.matches("[0-9]{9}")) {
		//	System.out.println("Valid number");
		//}else {
		//	System.out.println("invalid drivers license");
		//}
		
		String area="423";
		if(area.matches("[0-9]{3}")){
			System.out.println("valid area possibility");
		}
		else {
			System.out.println("invalid area");
		}
		
		
		String plate="234lkjls";
		if(plate.matches("[A-Za-z0-9]{7}")) {
			System.out.println("valid plate");
		}else {
			System.out.println("You full of shit");
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