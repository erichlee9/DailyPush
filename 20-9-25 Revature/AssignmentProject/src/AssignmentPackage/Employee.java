package AssignmentPackage;

//Employee is-A person
public class Employee extends Person{
//try private Address  presentAddress
	//add has-A relationship Project-pid,name,clientname,cost
	private String designation; //has-A
	private double salary;//has-A
	private Address permenantAddress;//has-A
	private Address workingAddress;
	private Address homeAddress;
	private Project pid;
	
	
	
	
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String designation, double salary, Address permanentAddress, Address workingAddress, Address homeAddress, Project pid) {
		super(id, name);
		this.designation = designation;
		this.salary = salary;
		this.permenantAddress = permenantAddress;
		this.workingAddress = workingAddress;
		this.homeAddress = homeAddress;
		this.pid = pid;
		
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getPermenantAddress() {
		return permenantAddress;
	}

	public void setPermenantAddress(Address permenantAddress) {
		this.permenantAddress = permenantAddress;
	}

	public Address getWorkingAddress() {
		return workingAddress;
	}

	public void setWorkingAddress(Address workingAddress) {
		this.workingAddress = workingAddress;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Project getPid() {
		return pid;
	}

	public void setPid(Project pid) {
		this.pid = pid;
	}

	@Override
	public String toString() {
		return "Employee [designation=" + designation + ", salary=" + salary + ", permenantAddress=" + permenantAddress
				+ ", workingAddress=" + workingAddress + ", homeAddress=" + homeAddress + ", pid=" + pid + "]";
	}
	
	
	
}
