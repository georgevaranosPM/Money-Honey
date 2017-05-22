import java.util.ArrayList;

public class Bill extends Expense{

	public Bill(String ex_tag, double ex_amount) {
		super(ex_tag, ex_amount);
	}
	
	private ArrayList<Bill> default_Bills;
	
}
