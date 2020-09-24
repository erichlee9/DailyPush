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

	}

}
