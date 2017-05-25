import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JComboBox;

public class Inc_Exp_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField IncTagField;
	private JTextField IncAmountField;
	private JTextField ExpTagField;
	private JTextField ExpAmountField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inc_Exp_GUI frame = new Inc_Exp_GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Inc_Exp_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel mainPanel = new JPanel();
		contentPane.add(mainPanel, "name_444500472500205");
		mainPanel.setLayout(null);
		
		JLabel Submit_label = new JLabel("\u039A\u03B1\u03C4\u03B1\u03C7\u03C9\u03C1\u03B7\u03C3\u03B7");
		Submit_label.setBounds(128, 41, 125, 31);
		mainPanel.add(Submit_label);
		
		JButton IncButton = new JButton("\u0395\u03A3\u039F\u0394\u0391");
		IncButton.setBounds(39, 126, 97, 25);
		mainPanel.add(IncButton);
		
		
		
		JButton ExpButton = new JButton("\u0395\u039E\u039F\u0394\u0391");
		ExpButton.setBounds(237, 126, 97, 25);
		mainPanel.add(ExpButton);
		
		
		JPanel IncPanel = new JPanel();
		contentPane.add(IncPanel, "name_445013708017474");
		IncPanel.setLayout(null);
		
		
		JLabel IncTag_label = new JLabel("E\u03B9\u03B4\u03BF\u03C2 \u0395\u03C3\u03CC\u03B4\u03BF\u03C5:");
		IncTag_label.setBounds(4, 5, 114, 22);
		IncTag_label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		IncPanel.add(IncTag_label);
		
		IncTagField = new JTextField();
		IncTagField.setBounds(123, 5, 116, 22);
		IncTagField.setText("(\u03C0\u03C7 \u03BC\u03B9\u03C3\u03B8\u03CC\u03C2)");
		IncPanel.add(IncTagField);
		IncTagField.setColumns(10);
		
		JLabel IncAmount_label = new JLabel("\u03A0\u03BF\u03C3\u03CC: ");
		IncAmount_label.setBounds(64, 55, 54, 22);
		IncAmount_label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		IncPanel.add(IncAmount_label);
		
		IncAmountField = new JTextField();
		IncAmountField.setBounds(123, 57, 116, 22);
		IncAmountField.setText("(\u03B5\u03C5\u03C1\u03CE)");
		IncPanel.add(IncAmountField);
		IncAmountField.setColumns(10);
		
		JCheckBox TaxedcheckBox = new JCheckBox("\u03A6\u03BF\u03C1\u03BF\u03BB\u03BF\u03B3\u03B5\u03AF\u03C4\u03B1\u03B9");
		TaxedcheckBox.setBounds(26, 114, 103, 25);
		TaxedcheckBox.setSelected(true);
		IncPanel.add(TaxedcheckBox);
		
		JCheckBox ConstantcheckBox = new JCheckBox("\u03A3\u03C4\u03B1\u03B8\u03B5\u03C1\u03CC");
		ConstantcheckBox.setBounds(185, 114, 75, 25);
		IncPanel.add(ConstantcheckBox);
		
		JButton AddIncButton = new JButton("\u03A0\u03C1\u03BF\u03C3\u03B8\u03AE\u03BA\u03B7");
		AddIncButton.setBounds(215, 180, 89, 25);
		IncPanel.add(AddIncButton);
		
		JButton IncbackButton = new JButton("Back");
		IncbackButton.setBounds(97, 180, 69, 25);
		IncPanel.add(IncbackButton);
		
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
		contentPane.add(ExpPanel, "name_445032262353479");
		ExpPanel.setLayout(null);
		
		JLabel ExpTag_label = new JLabel("E\u03AF\u03B4\u03BF\u03C2");
		ExpTag_label.setBounds(177, 39, 69, 29);
		ExpPanel.add(ExpTag_label);
		
		JLabel ExpAmount_label = new JLabel("\u03A0\u03BF\u03C3\u03CC");
		ExpAmount_label.setBounds(294, 39, 69, 29);
		ExpPanel.add(ExpAmount_label);
		
		ExpTagField = new JTextField();
		ExpTagField.setBounds(177, 97, 72, 22);
		ExpPanel.add(ExpTagField);
		ExpTagField.setColumns(10);
		
		ExpAmountField = new JTextField();
		ExpAmountField.setBounds(291, 97, 72, 22);
		ExpPanel.add(ExpAmountField);
		ExpAmountField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(107, 97, 25, 22);
		ExpPanel.add(comboBox);
		
		JButton AddExpButton = new JButton("\u03A0\u03C1\u03BF\u03C3\u03B8\u03AE\u03BA\u03B7");
		AddExpButton.setBounds(291, 190, 89, 25);
		ExpPanel.add(AddExpButton);
		
		JButton ExpBackButton = new JButton("Back");
		ExpBackButton.setBounds(24, 190, 97, 25);
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
		
		JLabel ExpKind_label = new JLabel("E\u03AF\u03B4\u03BF\u03C2 \u0395\u03BE\u03CC\u03B4\u03BF\u03C5");
		ExpKind_label.setBounds(27, 97, 94, 22);
		ExpPanel.add(ExpKind_label);
	}
}
