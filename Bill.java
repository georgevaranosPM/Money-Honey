public class Bill extends Expense{

	public String[] default_Bills = {"Electricity", "Water Supply", "Internet", 
									"Telephone", "Mobile", "Oil", "Gas", "Rent", "Other"};
	
	public String[] getDefault_Bills() {
		return default_Bills;
	}

	public void setDefault_Bills(String[] default_Bills) {
		this.default_Bills = default_Bills;
	}
	
	public Bill(String ex_tag, double ex_amount) {
		super(ex_tag, ex_amount);
		
	}

}
