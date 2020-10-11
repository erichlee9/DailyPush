package bank_API_maven1_app.service;

//this is the interface (abstract?) to support all admin functions

import java.util.List;

import bank_API_maven1_app.accountmodel.*;
import bank_API_maven1_app.accountstatusmodel.*;
import bank_API_maven1_app.accounttypemodel.AccountType;
import bank_API_maven1_app.usermodel.User;

import bank_API_maven1_app.rolemodel.*;

public interface admin {
	//list of supported admin functions, view all user info and directly modify it
	//userId, username, password, firstName, lastName, email, role
	
	public List<User> getAllUserdata(); //throws bankexception;
	public int modifyUserId(int userId);
	public String modifyUsername(String username);
	
	
	

}
