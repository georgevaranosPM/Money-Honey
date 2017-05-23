import java.util.ArrayList;

public class User {

	private String username;
	private String password;
	//private String birthday; den XREIAZETAIIIII!!!!!!
	
	private ArrayList<Income> incomes;
	private ArrayList<Expense> expenses;
	private ArrayList<Estate> estates;
	private ArrayList<Vehicle> vehicles;
	/*// private double limit;  To evala se sxolio na doume se poia klasi tha bei...
	//egw lew edw opws kai to checklimit afou edw einai h lista me ta eksoda
	 */	
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

	// DEN XREAIZETAI!!!!!
	/*public String getBirthday() {
		return birthday;
	}


	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}*/


	public void add_Income(Income aIncome){
		incomes.add(aIncome);
	}
	public void add_Expense(Expense aExpense){
		expenses.add(aExpense);
	}
	
	public void add_Estate(Estate aEstate){
		estates.add(aEstate);
	}
	public void add_Vehicle(Vehicle aVehicle){
		vehicles.add(aVehicle);
	}
	// STA PRINT DEN KSERW TI ALLO NA GRAFOYME..TO AFISA ETSI GIA NA DOUME OLOI MAZI PWS THA EMFANIZONTAI
	public void print_Exp(){
		for(Expense expense : expenses)
			System.out.println(expense.getEx_tag() + expense.getEx_amount());
	}
	public void print_Inc(){
		for(Income income : incomes)
			System.out.println(income.getIn_tag() + income.getIn_amount());
	
	}
	


}
