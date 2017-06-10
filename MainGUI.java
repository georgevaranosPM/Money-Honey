import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;
import java.awt.SystemColor;

public class MainGUI extends JFrame{
	
	private Date from_Date;
	private Date to_Date;
	private ArrayList<User> Users;
	
	public MainGUI(User logginUser,ArrayList<User> allUsers) {
		this.Users=allUsers;
		
		getContentPane().setLayout(null);
		
		//////Main Panel//////
		JPanel mainPanel = new JPanel();
		mainPanel.setBounds(110, 58, 309, 241);
		getContentPane().add(mainPanel);
		getContentPane().setBackground(new Color(75, 75, 100));
		mainPanel.setLayout(null);
		
		//////Lista esodwn///////
		JList<String> Inc_List = new JList<String>();
		
		DefaultListModel<String> listModel = new DefaultListModel<String>();
		
		for(Income income : logginUser.getIncomes())
		{
			listModel.addElement(income.getIn_tag()+ " " + Double.toString(income.getIn_amount())+ "€" );
		}
		Inc_List.setModel(listModel);
		
		Inc_List.setBounds(6, 71, 144, 164);
		mainPanel.add(Inc_List);
		
		
		//////Lista e3odwn///////
		JList<String> Exp_List = new JList<String>();
		
		DefaultListModel<String> listModel1 = new DefaultListModel<String>();
		
		for(Expense expense : logginUser.getExpenses()) {
			listModel1.addElement(expense.getEx_tag()+ " " + Double.toString(expense.getEx_amount())+ "€" );
		}
		Exp_List.setModel(listModel1);
		
		Exp_List.setBounds(159, 71, 144, 164);
		mainPanel.add(Exp_List);
		


		JLabel from_Date_Label = new JLabel("From");

		from_Date_Label.setBounds(6, 22, 61, 16);
		from_Date_Label.setForeground(new Color(230, 255, 255));
		mainPanel.add(from_Date_Label);
		

		JLabel to_Date_Label = new JLabel("To");

		to_Date_Label.setBounds(170, 22, 20, 16);
		to_Date_Label.setForeground(new Color(230, 255, 255));
		mainPanel.add(to_Date_Label);
		
		JSpinner from_Date_Select = new JSpinner();
		SpinnerDateModel from_date_Select_Model = new SpinnerDateModel();
		from_Date_Select.setBounds(45, 17, 105, 26);
		from_date_Select_Model.setCalendarField(Calendar.DAY_OF_MONTH);
		from_Date_Select.setModel(from_date_Select_Model);
		from_Date_Select.setEditor(new JSpinner.DateEditor(from_Date_Select,"dd/MM/yyyy"));
		mainPanel.add(from_Date_Select);
		
		JSpinner to_Date_Select = new JSpinner();
		SpinnerDateModel to_date_Select_Model = new SpinnerDateModel();
		to_Date_Select.setBounds(198, 17, 105, 26);
		to_date_Select_Model.setCalendarField(Calendar.DAY_OF_MONTH);
		to_Date_Select.setModel(to_date_Select_Model);
		to_Date_Select.setEditor(new JSpinner.DateEditor(to_Date_Select,"dd/MM/yyyy"));
		mainPanel.add(to_Date_Select);
		mainPanel.setBackground(new Color(75, 75, 100));
		
		JLabel lblIncomes = new JLabel("Incomes");
		lblIncomes.setBounds(6, 50, 57, 15);
		lblIncomes.setForeground(new Color(230, 255, 255));
		mainPanel.add(lblIncomes);
		
		JLabel lblExpenses = new JLabel("Expenses");
		lblExpenses.setBounds(246, 50, 65, 15);
		lblExpenses.setForeground(new Color(230, 255, 255));
		mainPanel.add(lblExpenses);


		JTextField result_Field = new JTextField();
		result_Field.setBounds(157, 217, 55, 23);
		result_Field.setEditable(false);
		result_Field.setText(Double.toString(logginUser.getResult()));
		mainPanel.add(result_Field);
		result_Field.setColumns(10);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setBounds(112, 223, 41, 15);
		lblResult.setForeground(new Color(230, 255, 255));
		mainPanel.add(lblResult);

		
			
			///////Right Panel////////
			JPanel mainRightPanel = new JPanel();
			mainRightPanel.setBounds(419, 58, 121, 241);
			getContentPane().add(mainRightPanel);
			mainRightPanel.setLayout(null);
			

			JButton delete_Inc_Btn = new JButton("Delete Income");
			delete_Inc_Btn.setBounds(0, 91, 120, 29);
			delete_Inc_Btn.setBackground(new Color(240, 110, 118));
			delete_Inc_Btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					logginUser.getIncomes().remove(Inc_List.getSelectedIndex());
					listModel.remove(Inc_List.getSelectedIndex());

					result_Field.setText(Double.toString(logginUser.getResult()));

				}
			});
			
			mainRightPanel.add(delete_Inc_Btn);
			mainRightPanel.setBackground(new Color(75, 75, 100));
			
			
			JButton delete_Exp_Btn = new JButton("Delete Expense");
			delete_Exp_Btn.setBounds(0, 132, 120, 29);
			delete_Exp_Btn.setBackground(new Color(240, 110, 118));
			delete_Exp_Btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					logginUser.getExpenses().remove(Exp_List.getSelectedIndex());
					listModel1.remove(Exp_List.getSelectedIndex());

					result_Field.setText(Double.toString(logginUser.getResult()));

				}
			});
			mainRightPanel.add(delete_Exp_Btn);

		
		///////South Panel////////
		JPanel mainSouthPanel = new JPanel();
		mainSouthPanel.setBounds(0, 299, 540, 39);
		getContentPane().add(mainSouthPanel);
		mainSouthPanel.setLayout(null);
		

		JButton graphsBtn = new JButton("Show Diagrams");

		graphsBtn.setSize(160, 25);
		graphsBtn.setLocation(184, 6);
		graphsBtn.setBackground(new Color(240, 110, 118));
		graphsBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new choose_DiagramGUI(logginUser);
			}
		});
		mainSouthPanel.add(graphsBtn);
		mainSouthPanel.setBackground(new Color(75, 75, 100));
		
		
		//////North Panel//////
		JPanel mainNorthPanel = new JPanel();
		mainNorthPanel.setBounds(0, 0, 540, 58);
		getContentPane().add(mainNorthPanel);
		mainNorthPanel.setLayout(null);
		
		JLabel userLabel = new JLabel(logginUser.getUsername());
		userLabel.setBounds(32, 14, 100, 16);
		userLabel.setFont(getFont());
		userLabel.setForeground(new Color(230, 255, 255));
		mainNorthPanel.add(userLabel);
		
		JLabel dateLabel = new JLabel(DateTimeFormatter.ofPattern("dd/MM/yyy").format(LocalDate.now()));
		dateLabel.setBounds(218, 14, 78, 16);
		dateLabel.setForeground(new Color(230, 255, 255));
		mainNorthPanel.add(dateLabel);
		

		JButton editProfBtn = new JButton("Settings");

		editProfBtn.setBounds(427, 1, 107, 29);
		editProfBtn.setBackground(new Color(240, 110, 118));
		editProfBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close_GUI();
				new editGUI(logginUser,Users);
			}
		});
		mainNorthPanel.add(editProfBtn);
		

		JButton logOutBtn = new JButton("Log Out");
		logOutBtn.setBounds(427, 32, 107, 29);

		logOutBtn.setBackground(new Color(240, 110, 118));
		logOutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close_GUI();
				LoginGUI.SaveStatus(Users);
				new LoginGUI(Users);
			}
		});
		mainNorthPanel.add(logOutBtn);
		mainNorthPanel.setBackground(new Color(75, 75, 100));
		
		JLabel show_Label1 = new JLabel("Submissions");
		show_Label1.setBounds(228, 45, 80, 16);
		mainNorthPanel.add(show_Label1);
		show_Label1.setForeground(new Color(230, 255, 255));
		
		
		///////Left Panel////////
		JPanel mainLeftPanel = new JPanel();
		mainLeftPanel.setBounds(0, 58, 110, 241);
		getContentPane().add(mainLeftPanel);
		mainLeftPanel.setBackground(new Color(75, 75, 100));
		
		JButton sbmtBtn = new JButton("+");
		sbmtBtn.setBounds(36, 90, 38, 35);
		sbmtBtn.setBackground(new Color(240, 110, 118));
		sbmtBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Inc_Exp_GUI(logginUser,Users);
				close_GUI();
			}
		});
		mainLeftPanel.setLayout(null);
		mainLeftPanel.add(sbmtBtn);
		
		this.setVisible(true);
		this.setSize(540, 360);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	protected void close_GUI() {
		this.dispose();
	}
}

	
	

