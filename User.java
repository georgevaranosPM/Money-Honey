import java.util.ArrayList;

public class User {

	private String username;
	private String password;
	private String birthday;
	
	private ArrayList<Income> incomes;
	private ArrayList<Expense> expenses;
	private ArrayList<Estate> estates;
	private ArrayList<Vehicle> vehicles;
	
	
	public User(String username, String password) {
		
		this.username = username;
		this.password = password;
	}
	
	
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getBirthday() {
		return birthday;
	}


	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}


	public void add_Income(Income aIncome){
		incomes.add(aIncome);
	}
	public void add_Expense(Expense aExpense){
		expenses.add(aExpense);
	}
	
	


}
