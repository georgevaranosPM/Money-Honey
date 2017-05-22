

public class Income {

	private String in_tag;
	private double in_amount;
	private boolean monthly;
	private boolean taxed;
	


	public Income(String in_tag, double in_amount, boolean monthly, boolean taxed) {
		super();
		this.in_tag = in_tag;
		this.in_amount = in_amount;
		this.monthly = monthly;
		this.taxed = taxed;
	}

} 