package override_equals_method;

public class Employee {
	
	private int idnumber;
	private String names;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int idnumber, String names) {
		this.idnumber = idnumber;
		this.names = names;
	}

	public int getIdnumber() {
		return idnumber;
	}

	public void setIdnumber(int idnumber) {
		this.idnumber = idnumber;
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	@Override
	public boolean equals(Object sup) {
		boolean b=false;
		Employee e1=(Employee)sup;
		if(this.idnumber==e1.idnumber) {
			b=true;
		}
		return b;
	}




	}
	


