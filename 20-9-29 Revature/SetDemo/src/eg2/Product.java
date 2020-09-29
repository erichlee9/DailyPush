package eg2;

public class Product {
	
	private int id;
	private String name;
	private double cost;
	private float ratings;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(int id, String name, double cost, float ratings) {
		super();
		this.id =id;
		this.name = name;
		this.cost = cost;
		this.ratings = ratings;
}
	@Override
	public String toString() {
		return "This shit "+id+name+cost+ratings;
	}
}
