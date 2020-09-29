package assignmentPackage;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class trees {

	public static void main(String[] args) {
		
		Set<String> types=new TreeSet<>();
		types.add("pine");
		types.add("oak");
		types.add("birch");
		types.add("palm");
		types.add("dogwood");
		types.add("willow");
		types.add("aspen");
		types.add("seqouia");
		
		Set<String> dtypes=new TreeSet<>(Collections.reverseOrder());
		dtypes.add("dogwood");
		dtypes.add("willow");
		dtypes.add("aspen");
		dtypes.add("seqouia");
		dtypes.add("peach");
		
		System.out.println(types);
		System.out.println(dtypes);
		
		types.addAll(dtypes);
		System.out.println(types);
		
		//types.retainAll(dtypes);
		//System.out.println(types);
		
		types.removeAll(dtypes);
		System.out.println(types);

	}

}
