package ex1;

public class PlayerMain {

	public static void main(String[] args) {

		Player p1=new Player(100, "kunal", 22);
		System.out.println(p1);
		
		
		
		Player p2=new Player();
		p2.setId(101);
		
		System.out.println(p2);

	}

}
