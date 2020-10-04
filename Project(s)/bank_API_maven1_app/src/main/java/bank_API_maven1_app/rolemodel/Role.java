package bank_API_maven1_app.rolemodel;

public class Role {
	private int roleId;
	private String role;

public Role() {
	// TODO Auto-generated constructor stub
}

public int getRoleId() {
	return roleId;
}

public void setRoleId(int roleId) {
	this.roleId = roleId;
}

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}

@Override
public String toString() {
	return "Role [roleId=" + roleId + ", role=" + role + "]";
}


	
}
