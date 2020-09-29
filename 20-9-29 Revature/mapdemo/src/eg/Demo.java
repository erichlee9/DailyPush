package eg;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Demo {

	public static void main(String[] args) {
		
		Map<Integer, String> hm=new HashMap<>();
		hm.put(100, "hello1");//put works as insert and update
		hm.put(100, "herro1");
		hm.put(200, "hello2");
		hm.put(120, "middle1");
		hm.put(99, "middle2");
		System.out.println(hm);//in order of modulo of the hash

		
		Map<Integer, String> hm2=new LinkedHashMap<>();//this one retains order of insertion
		hm2.put(100, "hello1");//put works as insert and update
		hm2.put(100, "herro1");
		hm2.put(200, "hello2");
		hm2.put(120, "middle1");
		hm2.put(99, "middle2");
		System.out.println(hm2);
		
		
		Map<Integer, String> trhash=new TreeMap<>();//tree map is in the order of the keys
		trhash.put(100, "hello1");//put works as insert and update
		trhash.put(100, "herro1");
		trhash.put(200, "hello2");
		trhash.put(120, "middle1");
		trhash.put(99, "middle2");
		System.out.println(trhash);
		
		
		Map<Integer, String> hasht=new Hashtable<>();//can't have null, throws null pointer exception
		hasht.put(100, "hello1");//put works as insert and update
		hasht.put(100, "herro1");
		hasht.put(200, "hello2");
		hasht.put(120, "middle1");
		//hasht.put(null, "null");
		hasht.put(99, "middle2");
		System.out.println(hasht);
		
		
		System.out.println(hasht.size());
		System.out.println(hasht.containsKey(200));
		System.out.println(hasht.containsValue("herro1"));
		System.out.println(hasht.get(200));
		System.out.println(hasht.get(2000));
		
		
		System.out.println("Iterating map method preffered");
		for(Entry<Integer, String> e:hasht.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
		for(Entry<Integer, String> e:trhash.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

	
}
