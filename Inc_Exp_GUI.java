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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(Color.LIGHT_GRAY);
		contentPane.add(mainPanel, "name_444500472500205");
		mainPanel.setLayout(null);
		
		JLabel Submit_label = new JLabel("Καταχώρηση");
		Submit_label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Submit_label.setBounds(148, 41, 142, 31);
		mainPanel.add(Submit_label);
		
		JButton IncButton = new JButton("\u0395\u03A3\u039F\u0394\u0391");
		IncButton.setBackground(Color.GRAY);
		IncButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		IncButton.setForeground(Color.RED);
		IncButton.setBounds(53, 126, 97, 25);
		mainPanel.add(IncButton);
		
		
		
		JButton ExpButton = new JButton("\u0395\u039E\u039F\u0394\u0391");
		ExpButton.setBackground(Color.GRAY);
		ExpButton.setBounds(237, 126, 97, 25);
		mainPanel.add(ExpButton);
		
		
		JPanel IncPanel = new JPanel();
		IncPanel.setBackground(Color.LIGHT_GRAY);
		contentPane.add(IncPanel, "name_445013708017474");
		IncPanel.setLayout(null);
		
		
		JLabel IncTag_label = new JLabel("E\u03B9\u03B4\u03BF\u03C2 \u0395\u03C3\u03CC\u03B4\u03BF\u03C5:");
		IncTag_label.setBounds(4, 5, 114, 22);
		IncTag_label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		IncPanel.add(IncTag_label);
		
		IncTagField = new JTextField();
		IncTagField.setBounds(144, 8, 116, 22);
		IncTagField.setText("(π.χ. μισθός)");
		IncPanel.add(IncTagField);
		IncTagField.setColumns(10);
		
		JLabel IncAmount_label = new JLabel("\u03A0\u03BF\u03C3\u03CC: ");
		IncAmount_label.setBounds(64, 54, 54, 22);
		IncAmount_label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		IncPanel.add(IncAmount_label);
		
		IncAmountField = new JTextField();
		IncAmountField.setBounds(144, 57, 116, 22);
		IncAmountField.setText("(\u03B5\u03C5\u03C1\u03CE)");
		IncPanel.add(IncAmountField);
		IncAmountField.setColumns(10);
		
		JCheckBox TaxedcheckBox = new JCheckBox("\u03A6\u03BF\u03C1\u03BF\u03BB\u03BF\u03B3\u03B5\u03AF\u03C4\u03B1\u03B9");
		TaxedcheckBox.setBounds(4, 114, 120, 25);
		TaxedcheckBox.setSelected(true);
		
		IncPanel.add(TaxedcheckBox);
		
		JCheckBox ConstantcheckBox = new JCheckBox("\u03A3\u03C4\u03B1\u03B8\u03B5\u03C1\u03CC");
		ConstantcheckBox.setBounds(185, 114, 100, 25);
		IncPanel.add(ConstantcheckBox);
		
		//ActionListener gia to TaxedcheckBox
		TaxedcheckBox.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(TaxedcheckBox.isSelected())
					ConstantcheckBox.setSelected(false);
				
			}
			
		});;
		
		//ActionListener gia to ConstantcheckBox
		ConstantcheckBox.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(TaxedcheckBox.isSelected())
					TaxedcheckBox.setSelected(false);
				
			}
			
		});;
		
		JButton AddIncButton = new JButton("\u03A0\u03C1\u03BF\u03C3\u03B8\u03AE\u03BA\u03B7");
		AddIncButton.setBounds(215, 180, 100, 25);
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
		
		JButton IncbackButton = new JButton("Πίσω");
		IncbackButton.setBounds(97, 180, 69, 25);
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
		ExpPanel.setBackground(Color.LIGHT_GRAY);
		contentPane.add(ExpPanel, "name_445032262353479");
		ExpPanel.setLayout(null);
		
		JLabel ExpTag_label = new JLabel("E\u03AF\u03B4\u03BF\u03C2");
		ExpTag_label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ExpTag_label.setBounds(177, 11, 69, 29);
		ExpPanel.add(ExpTag_label);
		
		JLabel ExpAmount_label = new JLabel("\u03A0\u03BF\u03C3\u03CC");
		ExpAmount_label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ExpAmount_label.setBounds(291, 11, 69, 29);
		ExpPanel.add(ExpAmount_label);
		
		ExpTagField = new JTextField();
		ExpTagField.setBounds(177, 51, 72, 22);
		ExpPanel.add(ExpTagField);
		ExpTagField.setColumns(10);
		
		ExpAmountField = new JTextField();
		ExpAmountField.setBounds(291, 51, 72, 22);
		ExpPanel.add(ExpAmountField);
		ExpAmountField.setColumns(10);
		
		String[] kindofExpenses = {"Consumable", "Bill", "Tax"};
		JComboBox comboBox = new JComboBox(kindofExpenses);
		comboBox.setBounds(24, 51, 130, 22);
		
		ExpPanel.add(comboBox);
		
		JButton AddExpButton = new JButton("\u03A0\u03C1\u03BF\u03C3\u03B8\u03AE\u03BA\u03B7");
		AddExpButton.setBounds(297, 216, 100, 25);
		ExpPanel.add(AddExpButton);
		//ActionListener gia th kataxwrhsh eksodou
		AddExpButton.addActionListener(new ActionListener(){

			@Override
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
		
		JButton ExpBackButton = new JButton("Πίσω");
		ExpBackButton.setBounds(24, 216, 97, 25);
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
