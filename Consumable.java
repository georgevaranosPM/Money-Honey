public class Consumable extends Expense {

	public String[] default_Consumables = {"Petrol", "Super Market", "Clothing", "Furniture", "Devices", "Car Service", 
											"Home Service", "Entertainment", "School Supplies", "Other"};
	
	
	public String[] getDefault_Consumables() {
		return default_Consumables;
	}


	public void setDefault_Consumables(String[] default_Consumables) {
		this.default_Consumables = default_Consumables;
	}


	public Consumable(String ex_tag, double ex_amount) {
		super(ex_tag, ex_amount);
		
	}
	
}
