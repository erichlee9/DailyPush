package ex;

import java.util.LinkedList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		
		LinkedList li=new LinkedList();
		li.add(999);
		li.add("heyyy");
		li.add("hii");
		li.add(true);
		li.add('c');
		li.add(23.333);
		li.add(19834759832475L);
		li.add(null);
		li.add(null);
		System.out.println(li);
		
		List<Integer> li1=new LinkedList<>();//specified as list so it can't access methods of queue
		li1.add(1234);
		//li1.add("a;sdfkjasd;l");  <---this won't work because its a string
		li1.add(534524);
		li1.add(53452);
		
		li1.set(0, 222);//updates location to something else, not overloaded and must have index
		Integer i=100;
		li1.remove(i);//deletes that number from the list, the first one
		Integer i1=22;
		while(li1.remove(i1)) {}//deletes all of that number
		System.out.println(li1);
		
		System.out.println(li1.contains(555));//returns boolean
		
		System.out.println(li);
		System.out.println(li1);
		System.out.println(li1.contains(222));
		
		
		

	}

}
