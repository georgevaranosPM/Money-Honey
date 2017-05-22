import java.util.ArrayList;

public class Consumable extends Expense {

	public Consumable(String ex_tag, double ex_amount) {
		super(ex_tag, ex_amount);
	}
	
	private ArrayList<Consumable> default_Consumables;
}
