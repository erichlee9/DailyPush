package Classes;

public class ClassTwo {

	public static void main(String[] args) {
		ClassOne id1=new ClassOne();
		int id2;
		id1.setId(130);
		System.out.println(id1.getId());
		System.out.println(id1.getId()+100);
		if(id1.getId()<100) {
			id2=id1.getId()+100;
			System.out.println("Altered Id is "+id2);
		}else {
			System.out.println("Id is unalterd: "+id1.getId());
		}
		System.out.println(id1.hashCode());
		System.out.println(id1.toString());
		
		int id3=130;
		System.out.println(id1.getId());
		System.out.println(id3);
		id1.toString();
		System.out.println(id1.getId());
		
		//if(id1.getId()) {
		//	System.out.println("The same");
		//}else {System.out.println("Not same");
	}
		//System.out.println(id1.getId());
//issue here because can't invoke method .equals on int, can't invoke method toString() on int either
}

