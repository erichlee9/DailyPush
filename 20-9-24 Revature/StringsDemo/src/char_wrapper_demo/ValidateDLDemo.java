package char_wrapper_demo;

public class ValidateDLDemo {

	public static void main(String[] args) {
		/*
		 * First 2 uppercase letters
		 * and a - and
		 * Followed by 5 digits
		 *and a - and 1 uppercase letter
		 */
		String d1="AE-5678-Y";
		boolean b=false;
		
		if(d1.length()==10 && Character.isUpperCase(d1.charAt(9)) && d1.charAt(8)=='-') {
			int upper=0;
			for (int i = 0; i < 2; i++) {
				if(Character.isUpperCase(d1.charAt(i))) {
					upper++;
				}
				
			}
			if(upper==2 && d1.charAt(2)=='-') {
				int digit=0;
				for (int j = 3; j < 8; j++) {
					if(Character.isDigit(d1.charAt(j))) {
						digit++;
					}
				}
			if(digit==5) {
				b=true;
			}
			}
		}
		
		if(b) {
			System.out.println(d1+" is valid");
		}else {
			System.out.println(d1+" is invalid");
		}
		
	}

}
