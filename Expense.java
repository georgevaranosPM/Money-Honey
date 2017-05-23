
public class Expense {
	
	private String ex_tag;
	private double ex_amount;
	
	
	public Expense(String ex_tag, double ex_amount) {
		super();
		this.ex_tag = ex_tag;
		this.ex_amount = ex_amount;
	}
	
	

	public String getEx_tag() {
		return ex_tag;
	}



	public void setEx_tag(String ex_tag) {
		this.ex_tag = ex_tag;
	}



	public double getEx_amount() {
		return ex_amount;
	}



	public void setEx_amount(double ex_amount) {
		this.ex_amount = ex_amount;
	}


//Ayto nomizw kalutera prepei na paei ston User
	public boolean check_Limit(double sum, double limit) {
		
		boolean passed = false;
		
		return passed;
	}
	
	public void add_newDefault(Expense newExp) {

	}
	
}

