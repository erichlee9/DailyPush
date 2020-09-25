package initial;

public class ConstructorNonMain {  
	
	private int id;
	private String name;
	
	
	public ConstructorNonMain(int id, String name) {
		this.id=id;
		this.name=name;
		
	}		
	
	public ConstructorNonMain(int id) {
		this.id=id;
		this.name="Dammit Steve";
	
	}
	
	@Override
	public String toString() {
		return "ID= "+id+ " " +name;
		

}}
