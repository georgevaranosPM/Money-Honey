import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Inc_Exp_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField IncAmountField;
	private JTextField ExpAmountField;
	private Bill def_Bill = new Bill("bill", 0);
	private Consumable def_Cons = new Consumable("consumable", 0);
	private Income def_Incomes = new Income("income", 0, false, false);
	private ArrayList<User> Users;

	public Inc_Exp_GUI(User logginUser,ArrayList<User> Users) {
		
		this.Users=Users;
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(75, 75, 100));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		this.setVisible(true);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(new Color(75, 75, 100));
		contentPane.add(mainPanel, "name_444500472500205");
		mainPanel.setLayout(null);
		
		JLabel Submit_label = new JLabel("Submit");
		Submit_label.setHorizontalAlignment(SwingConstants.LEFT);
		Submit_label.setBounds(6, 0, 50, 20);
		Submit_label.setForeground(new Color(230, 255, 255));
		mainPanel.add(Submit_label);
		
		JButton IncButton = new JButton("Incomes");
		IncButton.setBackground(new Color(240, 110, 118));
		IncButton.setBounds(91, 126, 97, 25);
		mainPanel.add(IncButton);
		
		JButton ExpButton = new JButton("Expenses");
		ExpButton.setBackground(new Color(240, 110, 118));
		ExpButton.setBounds(237, 126, 97, 25);
		mainPanel.add(ExpButton);
		
		JButton backTo_MainGUI = new JButton("Back");
		backTo_MainGUI.setBackground(new Color(240, 110, 118));
		backTo_MainGUI.setBounds(6, 239, 89, 23);
		mainPanel.add(backTo_MainGUI);
		
		backTo_MainGUI.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new MainGUI(logginUser,Users);
				dispose();
			}
			
		});
		
		
		JPanel IncPanel = new JPanel();
		IncPanel.setBackground(new Color(75, 75, 100));
		contentPane.add(IncPanel, "name_445013708017474");
		IncPanel.setLayout(null);
		
		
		JLabel IncTag_label = new JLabel("Type of Income");
		IncTag_label.setBounds(71, 60, 100, 22);
		IncTag_label.setForeground(new Color(230, 255, 255));
		IncPanel.add(IncTag_label);
		
		JLabel IncAmount_label = new JLabel("Amount");
		IncAmount_label.setBounds(71, 109, 69, 22);
		IncAmount_label.setForeground(new Color(230, 255, 255));
		IncPanel.add(IncAmount_label);
		
		IncAmountField = new JTextField();
		IncAmountField.setBounds(193, 108, 116, 25);
		IncPanel.add(IncAmountField);
		IncAmountField.setColumns(10);
		
		JCheckBox TaxedcheckBox = new JCheckBox("Taxed");
		TaxedcheckBox.setForeground(Color.RED);
		TaxedcheckBox.setBounds(71, 180, 120, 25);
		TaxedcheckBox.setSelected(true);
		IncPanel.add(TaxedcheckBox);
		
		JCheckBox ConstantcheckBox = new JCheckBox("Monthly Stable");
		ConstantcheckBox.setForeground(Color.RED);
		ConstantcheckBox.setBounds(250, 180, 140, 25);
		IncPanel.add(ConstantcheckBox);
		
		String[] incomes = def_Incomes.getDefault_Incomes();
		JComboBox income_comboBox = new JComboBox(incomes);
		income_comboBox.setBackground(new Color(240, 110, 118));
		income_comboBox.setBounds(193, 59, 116, 25);
		IncPanel.add(income_comboBox);
		
		
		JButton AddIncButton = new JButton("Add");
		AddIncButton.setBackground(new Color(240, 110, 118));
		AddIncButton.setBounds(334, 237, 100, 25);
		IncPanel.add(AddIncButton);
		//ActionListener gia th kataxwrhsh esodou
		AddIncButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				boolean taxed = false;
				boolean monthly = false;
				double amount = Double.parseDouble(IncAmountField.getText());
				
				if (TaxedcheckBox.isSelected()){
					 taxed = true;
				}
				else if (ConstantcheckBox.isSelected()){
					 monthly = true;
				}
				Income income = new Income(income_comboBox.getSelectedItem().toString(), amount, monthly, taxed);
				logginUser.add_Income(income);
				logginUser.print_Inc();
				
			}
			
		});
		
		JButton IncbackButton = new JButton("Back");
		IncbackButton.setBackground(new Color(240, 110, 118));
		IncbackButton.setBounds(4, 237, 69, 25);
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
		
		JLabel ExpTag_label = new JLabel("Type of Expense");
		ExpTag_label.setForeground(new Color(230, 255, 255));
		ExpTag_label.setBounds(210, 38, 110, 20);
		ExpPanel.add(ExpTag_label);
		
		JLabel ExpAmount_label = new JLabel("Amount");
		ExpAmount_label.setForeground(new Color(230, 255, 255));
		ExpAmount_label.setBounds(332, 38, 71, 20);
		ExpPanel.add(ExpAmount_label);
		
		ExpAmountField = new JTextField();
		ExpAmountField.setBounds(331, 70, 72, 22);
		ExpPanel.add(ExpAmountField);
		ExpAmountField.setColumns(10);
		ExpAmountField.setEditable(false);
		
		String[] kindofExpenses = {"Consumable", "Bill", "Tax", "   Income Tax", "   Vehicle Tax", "   Estate Tax"};
		JComboBox comboBox = new JComboBox(kindofExpenses);
		comboBox.setBackground(new Color(240, 110, 118));
		comboBox.setBounds(6, 70, 130, 22);
		ExpPanel.add(comboBox);
		
		
		
		String[] consumables = def_Cons.getDefault_Consumables();
		JComboBox cons_ComboBox = new JComboBox(consumables);
		cons_ComboBox.setBackground(new Color(240, 110, 118));
		cons_ComboBox.setBounds(210, 70, 99, 22);
		ExpPanel.add(cons_ComboBox);
		cons_ComboBox.setVisible(false);
		
		String[] bills = def_Bill.getDefault_Bills();
		JComboBox bills_ComboBox = new JComboBox(bills);
		bills_ComboBox.setBackground(new Color(240, 110, 118));
		bills_ComboBox.setBounds(210, 70, 99, 22);
		ExpPanel.add(bills_ComboBox);
		bills_ComboBox.setVisible(false);
		
		String[] veh = new String[logginUser.getVehicles().size()];
		for(int i=0; i<logginUser.getVehicles().size(); i++) {
			veh[i] = logginUser.getVehicles().get(i).getVeh_id();
		}
		JComboBox vehicles_comboBox = new JComboBox(veh);
		vehicles_comboBox.setBounds(210, 71, 99, 20);
		vehicles_comboBox.setBackground(new Color(240, 110, 118));
		ExpPanel.add(vehicles_comboBox);
		vehicles_comboBox.setVisible(false);
		
		
		String[] est = new String[logginUser.getEstates().size()];
		for(int i=0; i<logginUser.getEstates().size(); i++) {
			est[i] = logginUser.getEstates().get(i).getAddress();
		}
		JComboBox estates_comboBox = new JComboBox(est);
		estates_comboBox.setBounds(210, 71, 99, 20);
		estates_comboBox.setBackground(new Color(240, 110, 118));
		ExpPanel.add(estates_comboBox);
		estates_comboBox.setVisible(false);
		
		
		JButton AddExpButton = new JButton("Add");
		AddExpButton.setBackground(new Color(240, 110, 118));
		AddExpButton.setBounds(340, 237, 100, 25);
		ExpPanel.add(AddExpButton);
		
		//ActionListener gia th kataxwrhsh eksodou
		AddExpButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String selectedKind = (String) comboBox.getSelectedItem();
				double amount;
				switch(selectedKind){
				case "Consumable" :  //System.out.println("Cons");
					amount = Double.parseDouble(ExpAmountField.getText());
					Consumable new_Cons = new Consumable(cons_ComboBox.getSelectedItem().toString(), amount);
					logginUser.add_Expense(new_Cons);
					logginUser.print_Exp();
				break;
				
				case "Bill" : //System.out.println("Bil");
					amount = Double.parseDouble(ExpAmountField.getText());
					Bill new_Bill = new Bill(bills_ComboBox.getSelectedItem().toString(), amount);
					logginUser.add_Expense(new_Bill);
					logginUser.print_Exp();
				break;
				
				case "   Income Tax" : //System.out.println("Tx"); 
					amount = Double.parseDouble(ExpAmountField.getText());
					Tax new_inc_Tax = new Tax("Income Tax" , amount);
					logginUser.add_Expense(new_inc_Tax);
				break;
				
				case "   Estate Tax" : //System.out.println("Tx"); 
					amount = Double.parseDouble(ExpAmountField.getText());
					Tax new_est_Tax = new Tax(estates_comboBox.getSelectedItem().toString() , amount);
					logginUser.add_Expense(new_est_Tax);
				break;
				
				case "   Vehicle Tax" : //System.out.println("Tx"); 
					amount = Double.parseDouble(ExpAmountField.getText());
					Tax new_veh_Tax = new Tax(vehicles_comboBox.getSelectedItem().toString() , amount);
					logginUser.add_Expense(new_veh_Tax);
				break;
				}
				
				if(logginUser.checklimit()){
					JOptionPane.showMessageDialog(getContentPane(), "You exceeded your monthly limit!");
				}
				/*double sum = 0;
				boolean once_Shown = false;
				for(Expense expense : logginUser.getExpenses()) {
					sum =+ expense.getEx_amount();
				}
				if(logginUser.getLimit()<sum && !(once_Shown)) {
					JOptionPane.showMessageDialog(getContentPane(), "You exceeded your monthly limit!");
					once_Shown = true;
				}
				dispose();*/
		}});
		
		JButton ExpBackButton = new JButton("Back");
		ExpBackButton.setBackground(new Color(240, 110, 118));
		ExpBackButton.setBounds(6, 237, 97, 25);
		ExpPanel.add(ExpBackButton);
		
		
		JButton  go_Button = new JButton("Go!");
		go_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(comboBox.getSelectedIndex()==0) {
					estates_comboBox.setVisible(false);
					cons_ComboBox.setVisible(true);
					bills_ComboBox.setVisible(false);
					vehicles_comboBox.setVisible(false);
					ExpAmountField.setEditable(true);
				}
				else if(comboBox.getSelectedIndex()==1) {
					estates_comboBox.setVisible(false);
					cons_ComboBox.setVisible(false);
					bills_ComboBox.setVisible(true);
					vehicles_comboBox.setVisible(false);
					ExpAmountField.setEditable(true);
				}
				else if(comboBox.getSelectedIndex()==2) {
					JOptionPane.showMessageDialog(ExpPanel,
						    "Choose a tax type.",
						    "Choose tax type", JOptionPane.WARNING_MESSAGE);
				}
				else if(comboBox.getSelectedIndex()==3) {

					ExpAmountField.setText(Double.toString(logginUser.getIncomeTax()));
				}
				else if(comboBox.getSelectedIndex()==4) {
					estates_comboBox.setVisible(false);
					cons_ComboBox.setVisible(false);
					bills_ComboBox.setVisible(false);
					vehicles_comboBox.setVisible(true);
					
					ExpAmountField.setText(Double.toString(logginUser.getVehicles().get(vehicles_comboBox.getSelectedIndex()).calculate_veh_charge()));
				}
				else if(comboBox.getSelectedIndex()==5) {
					estates_comboBox.setVisible(true);
					cons_ComboBox.setVisible(false);
					bills_ComboBox.setVisible(false);
					vehicles_comboBox.setVisible(false);
					
					ExpAmountField.setText(Double.toString(logginUser.getEstates().get(estates_comboBox.getSelectedIndex()).calculate_est_charge()));
				}
			}
		});
		go_Button.setBounds(146, 69, 54, 25);
		ExpPanel.add(go_Button);
		
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
			public void actionPerformed(ActionEvent arg0) {
				mainPanel.setVisible(true);
				ExpPanel.setVisible(false);
			}
		});
	}
}
