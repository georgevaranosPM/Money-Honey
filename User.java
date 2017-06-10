import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {

	private String username;
	private String password;
	
	
	private ArrayList<Income> incomes = new ArrayList<Income>();
	private ArrayList<Expense> expenses = new ArrayList<Expense>();
	private ArrayList<Estate> estates = new ArrayList<Estate>();
	private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	private double limit;
	
	public User(String username, String password,double limit) {
		
		this.username = username;
		this.password = password;
	}
	
	
	public ArrayList<Income> getIncomes() {
		return incomes;
	}



	public ArrayList<Expense> getExpenses() {
		return expenses;
	}



	public double getLimit() {
		return limit;
	}



	public ArrayList<Estate> getEstates() {
		return estates;
	}



	public ArrayList<Vehicle> getVehicles() {
		return vehicles;
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
	
	public void print_Exp(){
		for(Expense expense : expenses)
			System.out.println(expense.getEx_tag() + expense.getEx_amount());
	}
	public void print_Inc(){
		for(Income income : incomes)
			System.out.println(income.getIn_tag() + income.getIn_amount());
	
	}
	public double getIncomeTax(){
		double charge=0;
		for(Income income : incomes)
		{
			if(income.isTaxed())
			{
				charge+=income.getIn_amount();
			}
		}
		if(charge<=20000)
			charge=charge*0.22;
		else if(charge<=30000)
			charge=charge*0.29;
		else if(charge<=40000)
			charge=charge*0.37;
		else
			charge=charge*0.45;
		return charge;
	}
	
	public boolean checklimit(){
		boolean overlimit = false;
		double sum = 0;
		for(Expense expense : expenses){
			sum = sum+ expense.getEx_amount();
		}
		if(limit<sum)
			overlimit=true;
		return overlimit;
	}


}
