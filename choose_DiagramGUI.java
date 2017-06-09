import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class choose_DiagramGUI extends JFrame{
	public choose_DiagramGUI() {
		
		JPanel choicePanel = new JPanel();
		choicePanel.setBackground(new Color(75, 75, 100));
		choicePanel.setLayout(null);
		this.setContentPane(choicePanel);
		
		JLabel lblDiagrams = new JLabel("Diagrams");
		lblDiagrams.setBounds(6, 6, 110, 16);
		lblDiagrams.setForeground(new Color(230, 255, 255));
		choicePanel.add(lblDiagrams);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close_GUI();
			}
		});
		btnBack.setBounds(6, 303, 117, 29);
		btnBack.setBackground(new Color(240, 110, 118));
		choicePanel.add(btnBack);
		
		JButton btnPieChart = new JButton("Incomes-Expenses Pie Chart");
		btnPieChart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Diagrams_GUI(3);
				close_GUI();
			}
		});
		btnPieChart.setBounds(170, 169, 210, 29);
		btnPieChart.setBackground(new Color(240, 110, 118));
		choicePanel.add(btnPieChart);
		
		JButton btnIncomesBarChart = new JButton("Incomes Bar Chart");
		btnIncomesBarChart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Diagrams_GUI(1);
				close_GUI();
			}
		});
		btnIncomesBarChart.setBounds(80, 100, 150, 29);
		btnIncomesBarChart.setBackground(new Color(240, 110, 118));
		choicePanel.add(btnIncomesBarChart);
		
		JButton btnExpensesBarChart = new JButton("Expenses Bar Chart");
		btnExpensesBarChart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Diagrams_GUI(2);
				close_GUI();
			}
		});
		btnExpensesBarChart.setBounds(310, 100, 150, 29);
		btnExpensesBarChart.setBackground(new Color(240, 110, 118));
		choicePanel.add(btnExpensesBarChart);
		
		this.setBackground(new Color(75, 75, 100));
		this.setVisible(true);
		this.setSize(540, 360);
	}
	
	protected void close_GUI() {
		this.dispose();
	}
}
