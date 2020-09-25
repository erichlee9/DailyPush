package AssignmentPackage;


public class Project {
	
	private String projId;
	private String projName;
	private String clientname;
	private double cost;
	
	public Project() {
		// TODO Auto-generated constructor stub
	}
	
	public Project(String projId, String projName, String clientname, double cost) {
		this.projId = projId;
		this.projName = projName;
		this.clientname = clientname;
		this.cost = cost;
	}

	public String getProjId() {
		return projId;
	}

	public void setProjId(String projId) {
		this.projId = projId;
	}

	public String getProjName() {
		return projName;
	}

	public void setProjName(String projName) {
		this.projName = projName;
	}

	public String getClientname() {
		return clientname;
	}

	public void setClientname(String clientname) {
		this.clientname = clientname;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Project [projId=" + projId + ", projName=" + projName + ", clientname=" + clientname + ", cost=" + cost
				+ "]";
	}
	
	

}
