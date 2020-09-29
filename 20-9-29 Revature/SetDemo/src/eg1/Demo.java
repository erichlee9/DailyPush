package eg1;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class Demo {

	public static void main(String[] args) {
		Set<String> hs=new HashSet<>();
		hs.add("heyy");
		hs.add("java");
		hs.add(";aas;dklfj");
		hs.add("hibernate");
		hs.add(null);
		hs.add(null);
		hs.add("java");
		hs.add("mySql");
		System.out.println(hs);
		
		
		Set<String> lhs=new LinkedHashSet<>();
		lhs.add("heyy");
		lhs.add("java");
		lhs.add(";aas;dklfj");
		lhs.add("hibernate");
		lhs.add(null);
		lhs.add(null);
		lhs.add("java");
		lhs.add("mySql");
		System.out.println(lhs);
		
		Set<String> ts=new TreeSet<>();//ascending alphabetical
		//Set<String> ts=new TreeSet<>(Collections.reverseOrder());//descending alphabetical
		ts.add("heyy");
		ts.add("java");
		ts.add(";aas;dklfj");
		ts.add("hibernate");
		//ts.add(null); null is not allowed
		//ts.add(null);
		ts.add("java");
		ts.add("mySql");
		System.out.println(ts);//alphabetical order by default
		System.out.println();
	}
//assignment addAll, retainAll, removeAll..
}
