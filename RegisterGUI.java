import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class RegisterGUI extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	public RegisterGUI() {
		
		JPanel panel = new JPanel();
		this.setSize(450,500);
		panel.setBackground(Color.GRAY);
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblRegister = new JLabel("ΕΓΓΡΑΦΗ");
		lblRegister.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblRegister.setForeground(Color.YELLOW);
		lblRegister.setBounds(6, 6, 79, 19);
		panel.add(lblRegister);
		
		JLabel label = new JLabel("Προφιλ");
		label.setBounds(215, 8, 61, 16);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Όνομα χρήστη:");
		label_1.setBounds(94, 40, 99, 16);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Κωδικός:");
		label_2.setBounds(135, 68, 59, 16);
		panel.add(label_2);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(155, 95, 38, 16);
		panel.add(lblEmail);
		
		textField = new JTextField();
		textField.setBounds(215, 35, 130, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(215, 63, 130, 26);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(215, 95, 130, 26);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_3 = new JLabel("Χρήστης");
		label_3.setBounds(215, 131, 61, 16);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Ον/μο:");
		label_4.setBounds(149, 161, 44, 16);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("Ημ.Γέννησης:");
		label_5.setBounds(108, 189, 85, 16);
		panel.add(label_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(215, 159, 130, 26);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(215, 184, 130, 26);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel label_6 = new JLabel("Ακίνητα:");
		label_6.setBounds(137, 257, 56, 16);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("Οχήματα:");
		label_7.setBounds(131, 285, 62, 16);
		panel.add(label_7);
		
		JButton button = new JButton("ΠΡΟΣΘΗΚΗ");
		button.setBounds(215, 252, 117, 29);
		panel.add(button);
		
		JButton button_1 = new JButton("ΠΡΟΣΘΗΚΗ");
		button_1.setBounds(215, 280, 117, 29);
		panel.add(button_1);
		
		JLabel label_8 = new JLabel("Όριο Εξόδων:");
		label_8.setBounds(132, 342, 90, 16);
		panel.add(label_8);
		
		textField_5 = new JTextField();
		textField_5.setBounds(234, 337, 130, 26);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JButton button_2 = new JButton("ΟΛΟΚΛΗΡΩΣΗ");
		button_2.setBounds(285, 426, 117, 29);
		panel.add(button_2);
	}

}
