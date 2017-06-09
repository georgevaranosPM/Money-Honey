
public class Estate {

	private String address;
	private int square_meters;
	
	public Estate(String address, int square_meters) {
		super();
		this.address = address;
		this.square_meters = square_meters;
	}
	
	
	public String getAddress() {
		return address;
	}


	public int getSquare_meters() {
		return square_meters;
	}


	public double calculate_est_charge(){
		
		double charge = 0 ;
		
		if(square_meters<80)
			charge=square_meters*40;
		else if(square_meters<=120)
			charge=square_meters*65;
		else if(square_meters<=200)
			charge=square_meters*110;
		else if(square_meters<=300)
			charge=square_meters*200;
		else 
			charge=square_meters*400;
		
		
		return charge;
	}
	
}
