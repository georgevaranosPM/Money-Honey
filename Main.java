import java.util.ArrayList;
//th Main thn evala gia na treksw ta dika mou ennoeitai pws tha allaksei
public class Main {

	public static void main(String[] args) {
		Income inc1 = new Income("misthos", 450,true,false);
		User aUser = new User("patakos","ne2cooja" );
		aUser.add_Income(inc1);
		
		new LoginGUI(); 

	}

}
