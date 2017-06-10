import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args)  {
		
		ArrayList<User> AllUsers = new ArrayList<User>();
		
        try{
            FileInputStream fileIn = new FileInputStream("MoneyHoneyDB.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
             AllUsers = (ArrayList<User>)in.readObject();
            in.close();
            fileIn.close();
           

        
        }
        catch(EOFException eof){
			
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

		
		
		
		
		 
	}

}
