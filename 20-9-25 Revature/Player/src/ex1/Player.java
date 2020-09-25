package ex1;

	//Encapsulated Class
	//Model Class
	//POJO
	//Data transfer object class
	//Value object class (VO)
	//Bean class



public class Player {
	
	private int id;
	private String name;
	private int age;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}
	
	public Player(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		
	}
	@Override
	public String toString() {
		return "playre info "+id+" "+name+" "+age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

}
