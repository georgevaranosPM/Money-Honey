import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
//th Main thn evala gia na treksw ta dika mou ennoeitai pws tha allaksei
public class Main {

	public static void main(String[] args) {
		Income inc1 = new Income("misthos", 450,true,false);
		User aUser = new User("patakos","123" );
		aUser.add_Income(inc1);
		ArrayList<User> UsersInit = new ArrayList<User>();
		UsersInit.add(aUser);
		
		
		try{
			
			FileOutputStream fileOut = new FileOutputStream("MoneyHoneyDB.ser");
			
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(UsersInit);
			out.close();
			fileOut.close();
			
			System.out.println("Serialization succeded!");
		}
		catch(IOException exc)
		{
			exc.printStackTrace();
		}
		
		
		new LoginGUI(); 

		new Inc_Exp_GUI(aUser);
	}

}
