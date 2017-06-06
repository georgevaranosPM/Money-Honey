import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

public class Inc_Exp_GUI extends JFrame {

	
	private JPanel contentPane;
	private JTextField IncTagField;
	private JTextField IncAmountField;
	private JTextField ExpTagField;
	private JTextField ExpAmountField;
	//private ArrayList<Income> incomes;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Inc_Exp_GUI(User logginUser) {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(75, 75, 100));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(new Color(75, 75, 100));
		contentPane.add(mainPanel, "name_444500472500205");
		mainPanel.setLayout(null);
		
<<<<<<< HEAD
		JLabel Submit_label = new JLabel("Submit");
=======
		JLabel Submit_label = new JLabel("ΚΑΤΑΧΩΡΗΣΗ :");
>>>>>>> 06db8f5a6a5c6d9c4c21a59bcd7d513a27f94b41
		Submit_label.setHorizontalAlignment(SwingConstants.CENTER);
		Submit_label.setBounds(0, 0, 90, 20);
		Submit_label.setForeground(new Color(230, 255, 255));
		mainPanel.add(Submit_label);
		
<<<<<<< HEAD
		JButton IncButton = new JButton("Incomes");
=======
		JButton IncButton = new JButton("ΕΣΟΔΟ");
>>>>>>> 06db8f5a6a5c6d9c4c21a59bcd7d513a27f94b41
		IncButton.setBackground(new Color(240, 110, 118));
		IncButton.setBounds(91, 126, 97, 25);
		mainPanel.add(IncButton);
		
		
		
<<<<<<< HEAD
		JButton ExpButton = new JButton("Expenses");
=======
		JButton ExpButton = new JButton("ΕΞΟΔΟ");
>>>>>>> 06db8f5a6a5c6d9c4c21a59bcd7d513a27f94b41
		ExpButton.setBackground(new Color(240, 110, 118));
		ExpButton.setBounds(237, 126, 97, 25);
		mainPanel.add(ExpButton);
		
		
		JPanel IncPanel = new JPanel();
		IncPanel.setBackground(new Color(75, 75, 100));
		contentPane.add(IncPanel, "name_445013708017474");
		IncPanel.setLayout(null);
		
		
<<<<<<< HEAD
		JLabel IncTag_label = new JLabel("Type of Income");
		IncTag_label.setBounds(71, 60, 90, 22);
=======
		JLabel IncTag_label = new JLabel("Ειδος Εσοδου :");
		IncTag_label.setBounds(88, 60, 80, 22);
>>>>>>> 06db8f5a6a5c6d9c4c21a59bcd7d513a27f94b41
		IncTag_label.setForeground(new Color(230, 255, 255));
		IncPanel.add(IncTag_label);
		
		IncTagField = new JTextField();
		IncTagField.setBounds(193, 59, 116, 25);
<<<<<<< HEAD
		IncTagField.setText("(i.e. wage)");
		IncPanel.add(IncTagField);
		IncTagField.setColumns(10);
		
		JLabel IncAmount_label = new JLabel("Sum");
		IncAmount_label.setBounds(71, 109, 35, 22);
=======
		IncTagField.setText("(πχ μισθός)");
		IncPanel.add(IncTagField);
		IncTagField.setColumns(10);
		
		JLabel IncAmount_label = new JLabel("Ποσο :");
		IncAmount_label.setBounds(133, 109, 35, 22);
>>>>>>> 06db8f5a6a5c6d9c4c21a59bcd7d513a27f94b41
		IncAmount_label.setForeground(new Color(230, 255, 255));
		IncPanel.add(IncAmount_label);
		
		IncAmountField = new JTextField();
		IncAmountField.setBounds(193, 108, 116, 25);
		IncPanel.add(IncAmountField);
		IncAmountField.setColumns(10);
		
<<<<<<< HEAD
		JCheckBox TaxedcheckBox = new JCheckBox("Taxed");
		TaxedcheckBox.setForeground(new Color(230, 255, 255));
=======
		JCheckBox TaxedcheckBox = new JCheckBox("Φορολογείται");
		TaxedcheckBox.setForeground(Color.BLACK);
>>>>>>> 06db8f5a6a5c6d9c4c21a59bcd7d513a27f94b41
		TaxedcheckBox.setBounds(71, 180, 120, 25);
		TaxedcheckBox.setSelected(true);
		IncPanel.add(TaxedcheckBox);
		
<<<<<<< HEAD
		JCheckBox ConstantcheckBox = new JCheckBox("Monthly Stable");
		ConstantcheckBox.setForeground(new Color(230, 255, 255));
=======
		JCheckBox ConstantcheckBox = new JCheckBox("Σταθερό");
		ConstantcheckBox.setForeground(Color.BLACK);
>>>>>>> 06db8f5a6a5c6d9c4c21a59bcd7d513a27f94b41
		ConstantcheckBox.setBounds(250, 180, 140, 25);
		IncPanel.add(ConstantcheckBox);
		
		//ActionListener gia to TaxedcheckBox
		TaxedcheckBox.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(TaxedcheckBox.isSelected())
					ConstantcheckBox.setSelected(false);
				
			}
			
		});;
		
	
		
		JButton AddIncButton = new JButton("Add");
		AddIncButton.setBackground(new Color(240, 110, 118));
		AddIncButton.setBounds(250, 227, 100, 25);
		IncPanel.add(AddIncButton);
		//ActionListener gia th kataxwrhsh esodou
		AddIncButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				boolean taxed = true;
				boolean monthly = false;
				double amount = Double.parseDouble(IncAmountField.getText());
				//to true to evala apo monos mou..meta tha dw pws to pairnw apo to checkbox
				if (TaxedcheckBox.isSelected()){
					 taxed = true;
					 monthly = false;
				}
				else if (ConstantcheckBox.isSelected()){
					 taxed = false;
					 monthly = true;
				}
				Income income = new Income(IncTagField.getText(), amount,monthly,taxed);
				logginUser.add_Income(income);
				logginUser.print_Inc();
				
			}
			
		});
		
		JButton IncbackButton = new JButton("Back");
		IncbackButton.setBackground(new Color(240, 110, 118));
		IncbackButton.setBounds(71, 227, 69, 25);
		IncPanel.add(IncbackButton);
		
		//ActionListener tou IncbackButton
		IncbackButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				mainPanel.setVisible(true);
				IncPanel.setVisible(false);
				
			}
			
		});
		//ActionListenr tou IncButton
		IncButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				mainPanel.setVisible(false);
				IncPanel.setVisible(true);
				
			}
			
		});
	
		JPanel ExpPanel = new JPanel();
		ExpPanel.setBackground(new Color(75, 75, 100));
		contentPane.add(ExpPanel, "name_445032262353479");
		ExpPanel.setLayout(null);
		
<<<<<<< HEAD
		JLabel ExpTag_label = new JLabel("Type of Expense");
=======
		JLabel ExpTag_label = new JLabel("είδος");
>>>>>>> 06db8f5a6a5c6d9c4c21a59bcd7d513a27f94b41
		ExpTag_label.setForeground(new Color(230, 255, 255));
		ExpTag_label.setBounds(180, 38, 100, 20);
		ExpPanel.add(ExpTag_label);
		
<<<<<<< HEAD
		JLabel ExpAmount_label = new JLabel("Sum");
=======
		JLabel ExpAmount_label = new JLabel("ποσό");
>>>>>>> 06db8f5a6a5c6d9c4c21a59bcd7d513a27f94b41
		ExpAmount_label.setForeground(new Color(230, 255, 255));
		ExpAmount_label.setBounds(292, 38, 35, 20);
		ExpPanel.add(ExpAmount_label);
		
		ExpTagField = new JTextField();
		ExpTagField.setBounds(180, 70, 72, 22);
		ExpPanel.add(ExpTagField);
		ExpTagField.setColumns(10);
		
		ExpAmountField = new JTextField();
		ExpAmountField.setBounds(291, 70, 72, 22);
		ExpPanel.add(ExpAmountField);
		ExpAmountField.setColumns(10);
		
		String[] kindofExpenses = {"Consumable", "Bill", "Tax"};
		JComboBox comboBox = new JComboBox(kindofExpenses);
		comboBox.setBackground(new Color(240, 110, 118));
		comboBox.setBounds(22, 70, 130, 22);
		
		ExpPanel.add(comboBox);
		
		JButton AddExpButton = new JButton("Add");
		AddExpButton.setBackground(new Color(240, 110, 118));
		AddExpButton.setBounds(324, 227, 100, 25);
		ExpPanel.add(AddExpButton);
		//ActionListener gia th kataxwrhsh eksodou
		AddExpButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String selectedKind = (String) comboBox.getSelectedItem();
				double amount;
				switch(selectedKind){
				case "Consumable" :  System.out.println("Cons");
					 amount = Double.parseDouble(ExpAmountField.getText());
					Consumable cons = new Consumable(ExpTagField.getText(),amount);
					logginUser.add_Expense(cons);
					logginUser.print_Exp();
				break;
				
				case "Bill" : System.out.println("Bil");
					 amount = Double.parseDouble(ExpAmountField.getText());
					Bill bill = new Bill(ExpTagField.getText(),amount);
					logginUser.add_Expense(bill);
					logginUser.print_Exp();
				break;
				
				case "Tax" : System.out.println("Tx"); break;
				
			}
			
		}});
		
		JButton ExpBackButton = new JButton("Back");
		ExpBackButton.setBackground(new Color(240, 110, 118));
		ExpBackButton.setBounds(10, 227, 97, 25);
		ExpPanel.add(ExpBackButton);
		
		//ActionListenr tou ExpButton
		ExpButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				mainPanel.setVisible(false);
				ExpPanel.setVisible(true);
				
			}
			
		});

		//ActionListener tou ExpBackButton
		ExpBackButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				ExpPanel.setVisible(false);
				mainPanel.setVisible(true);
				
			}
			
		});
	}
}
