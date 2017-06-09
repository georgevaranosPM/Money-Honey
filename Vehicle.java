
public class Vehicle {

	private int cc;
	private int year;
	private String veh_id;
	private boolean taxed;
	
	
	public Vehicle(int cc, int year, String veh_id, boolean taxed) {
		super();
		this.cc = cc;
		this.year = year;
		this.veh_id = veh_id;
		this.taxed = taxed;
	}
	
	public double calculate_veh_charge(){
		
		double charge = 0;
		if(cc<=785)
			charge=55;
		else if(cc>785 && cc<=1000)
			charge=120;
		else if(cc>1000 && cc<1400)
			charge=135;
		else if(cc>=1400 && cc<1600)
			charge=255;
		else if(cc>=1600 && cc<1800)
			charge=280;
		else
			charge=320;
		
		
		
		return charge;
	}
	
}
