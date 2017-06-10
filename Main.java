import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		/*Income inc1 = new Income("misthos", 450,true,false);
		User aUser = new User("patakos","123",1233 );
		aUser.add_Income(inc1);*/
		ArrayList<User> AllUsers = new ArrayList<User>();
		//UsersInit.add(aUser);
		try{
			FileInputStream fileIn = new FileInputStream("MoneyHoneyDB.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			 AllUsers = (ArrayList<User>)in.readObject();
			in.close();
			fileIn.close();
			//Users.addAll(list);

		
		}
		catch(IOException exc)
		{
			exc.printStackTrace();
		}
		catch(ClassNotFoundException exc)
		{
			exc.printStackTrace();
		}
		new LoginGUI(AllUsers); 
		
		/*try{
			
			FileOutputStream fileOut = new FileOutputStream("MoneyHoneyDB.bin");
			
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(AllUsers);
			out.close();
			fileOut.close();
			
			System.out.println("Serialization succeded!");
		}
		catch(IOException exc)
		{
			exc.printStackTrace();
		}*/
		
		
		
	}

}
