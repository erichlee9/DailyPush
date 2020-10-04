package bank_API_maven1_app.accountmodel;
//used to represent a single account for a user
public class Account {
	private int accountId;
	private double balance;
	//private AccountStatus status;
	//private AccountType Type;

public Account() {
	// TODO Auto-generated constructor stub
}

public int getAccountId() {
	return accountId;
}

public void setAccountId(int accountId) {
	this.accountId = accountId;
}

public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}

@Override
public String toString() {
	return "Account [accountId=" + accountId + ", balance=" + balance + "]";
}





}

