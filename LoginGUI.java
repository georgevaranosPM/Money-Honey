import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

 public final  class LoginGUI extends JFrame{
	private JTextField textField_USERNAME;
	private JTextField textField_PASSWORD;
	private ArrayList<User> Users = new ArrayList<User>();
	public LoginGUI() {
		
		try{
			FileInputStream fileIn = new FileInputStream("MoneyHoneyDB.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			ArrayList<User> list = (ArrayList<User>)in.readObject();
			in.close();
			fileIn.close();
			Users.addAll(list);

		
		}
		catch(IOException exc)
		{
			exc.printStackTrace();
		}
		catch(ClassNotFoundException exc)
		{
			exc.printStackTrace();
		}
		
		
		
		
		
		
		
		
		setBackground(Color.DARK_GRAY);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.DARK_GRAY);
		panel.setBackground(Color.DARK_GRAY);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		textField_USERNAME = new JTextField();
		textField_USERNAME.setBounds(160, 61, 130, 26);
		panel.add(textField_USERNAME);
		textField_USERNAME.setColumns(10);
		
		JLabel lblUsername = new JLabel("Όνομα Χρήστη");
		lblUsername.setBounds(41, 66, 109, 16);
		lblUsername.setForeground(Color.WHITE);
		panel.add(lblUsername);
		
		textField_PASSWORD = new JTextField();
		textField_PASSWORD.setBounds(160, 99, 130, 26);
		panel.add(textField_PASSWORD);
		textField_PASSWORD.setColumns(10);
		
		JLabel lblPassword = new JLabel("Κωδικός");
		lblPassword.setBounds(88, 104, 73, 16);
		lblPassword.setForeground(Color.WHITE);
		panel.add(lblPassword);
		
		JLabel lblUserLogin = new JLabel("Είσοδος Χρήστη");
		lblUserLogin.setBounds(6, 6, 144, 16);
		lblUserLogin.setForeground(Color.PINK);
		panel.add(lblUserLogin);
		
		JButton btnLogin = new JButton("Είσοδος");
		btnLogin.setBounds(177, 153, 84, 29);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String UsernameText = textField_USERNAME.getText();
				String PasswordText = textField_PASSWORD.getText();
				for (int i=0; i<Users.size(); i++ ){
					if (UsernameText.equals(Users.get(i).getUsername())&& PasswordText.equals(Users.get(i).getPassword()))
				       {	new MainGUI(Users,i);
				       	disposeGUI();break;}
					else JOptionPane.showMessageDialog(panel,
						    "User "+UsernameText+" DOESN'T EVEN EXIST!");}}
			});
		panel.add(btnLogin);
		
		JLabel lblMoneyHoney = new JLabel("MONEY HONEY");
		lblMoneyHoney.setBounds(150, 17, 124, 21);
		lblMoneyHoney.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblMoneyHoney.setForeground(Color.YELLOW);
		panel.add(lblMoneyHoney);
		
		JLabel lblDontHaveAn = new JLabel("Δεν έχετε λογαριασμό;");
		lblDontHaveAn.setBounds(56, 219, 149, 16);
		lblDontHaveAn.setForeground(Color.WHITE);
		panel.add(lblDontHaveAn);
		
		JButton btnRegisterHere = new JButton("Εγγραφείτε!");
		btnRegisterHere.setBounds(213, 214, 147, 29);
		btnRegisterHere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new RegisterGUI();
				disposeGUI();
			}
		});
		
		panel.add(btnRegisterHere);
		
		this.setVisible(true);
		this.setSize(540, 360);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public  void disposeGUI(){
		this.dispose();
	}
	public  static void SaveStatus(ArrayList<User> Users){

		try{
			
			FileOutputStream fileOut = new FileOutputStream("MoneyHoneyDB.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(Users);
			out.close();
			fileOut.close();
			
			System.out.println("Serialization succeded!");
		}
		catch(IOException exc)
		{
			exc.printStackTrace();
		}
	}
		
	}


