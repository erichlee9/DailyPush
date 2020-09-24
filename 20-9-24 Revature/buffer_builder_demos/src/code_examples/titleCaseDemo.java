package code_examples;

public class titleCaseDemo {

	public static void main(String[] args) {
		String s="hello hi how are you doing today";
		
		String ar[]=s.split(" ");
		
		StringBuilder sb=new StringBuilder();
		
		for (int i = 0; i < ar.length; i++) {
			sb.append(ar[i].charAt(0));
			
		}
		
		System.out.println(sb);
		
		StringBuilder sl=new StringBuilder();
		
		//for (int i = 0; i < ar.length; i++) {
		//	sl.append
		
		
		//Task is here-----------------------------------------------------------------------------------------------------------------------------
		
		String a="this is a sentence where the last letters will be uppercased";
		
		String b[]=a.split(" ");
		
		StringBuilder ul=new StringBuilder();
		
		for (int j = 0; j < b.length; j++) {
			ul.append(b[j].substring(0,b[j].length()-1)).append(Character.toUpperCase(b[j].charAt(b[j].length()-1))).append(" ");
			System.out.println(b[j].substring(1));
		
		}
		System.out.println(ul.toString().trim());

	}

}


//Task
//Try to convert every word last letter to upper case

		//StringBuilder sl=new StringBuilder();
		//for ()