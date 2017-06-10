import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

 public final  class LoginGUI extends JFrame{
	private JTextField textField_USERNAME;
	private JTextField textField_PASSWORD;
	private ArrayList<User> Users;
	
	public LoginGUI(ArrayList<User> AllUsers) {
		this.Users=AllUsers;
	
		try{
			
			FileInputStream fileIn = new FileInputStream("MoneyHoneyDB.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			AllUsers = (ArrayList<User>)in.readObject();
			in.close();
			fileIn.close();
			//users.addAll(list);

		
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
		
		
		
		
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(75, 75, 100));
		getContentPane().add(panel);
		panel.setLayout(null);
		
		textField_USERNAME = new JTextField();
		textField_USERNAME.setBounds(226, 105, 130, 26);
		panel.add(textField_USERNAME);
		textField_USERNAME.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(129, 110, 109, 16);
		lblUsername.setForeground(new Color(230, 255, 255));
		panel.add(lblUsername);
		
		textField_PASSWORD = new JTextField();
		textField_PASSWORD.setBounds(226, 143, 130, 26);
		panel.add(textField_PASSWORD);
		textField_PASSWORD.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(129, 148, 73, 16);
		lblPassword.setForeground(new Color(230, 255, 255));
		panel.add(lblPassword);
		
		JButton btnLogin = new JButton("Log In");
		btnLogin.setBackground(new Color(240, 110, 118));
		btnLogin.setBounds(250, 197, 84, 29);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String UsernameText = textField_USERNAME.getText();
				String PasswordText = textField_PASSWORD.getText();
		        btnLogin.setBounds(250, 197, 84, 29);
                for(User user: Users)
                    System.out.println("Name " + user.getUsername());
                boolean flag=false;
                for (User user : Users ){
                     if (user.getUsername().equals(UsernameText)) {    
                    	if(user.getPassword().equals(PasswordText)) {
                    		User loggedin_User=user;
		                    flag = true;
		                    new MainGUI(loggedin_User,Users);
		                    dispose();break;
                    	}
                    	else
                    		JOptionPane.showMessageDialog(panel, "Wrong Password!");
                    	flag = true;
					}
                }
                if(!flag){
                	JOptionPane.showMessageDialog(panel,
						    "User "+UsernameText+" does not exist!");
                }
                     
			}
		});
		panel.add(btnLogin);
		
		ImageIcon logo = new ImageIcon("/Users/GeorgeVaranos/Money-Honey/Money_Honey_Logo.png");
		
		JLabel lblMoneyHoney = new JLabel(logo);
		lblMoneyHoney.setBounds(132, 6, 249, 73);
		lblMoneyHoney.setForeground(new Color(230, 255, 255));
		panel.add(lblMoneyHoney);
		
		JLabel lblDontHaveAn = new JLabel("Don't have an account?");
		lblDontHaveAn.setBounds(107, 294, 149, 16);
		lblDontHaveAn.setForeground(new Color(230, 255, 255));
		panel.add(lblDontHaveAn);
		
		JButton btnRegister = new JButton("Register!");
		btnRegister.setBackground(new Color(240, 110, 118));
		btnRegister.setBounds(257, 288, 147, 29);
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new RegisterGUI(Users);
				disposeGUI();
			}
		});
		
		panel.add(btnRegister);
		
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


