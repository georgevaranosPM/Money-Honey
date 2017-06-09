import java.awt.Color;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;


public class Diagrams_GUI extends JFrame{
	public Diagrams_GUI(int choice) {
		DefaultCategoryDataset incomes_Dataset = new DefaultCategoryDataset();
		incomes_Dataset.addValue(212, "Classes", "JDK1.0");
		incomes_Dataset.addValue(504, "Classes", "JDK1.1");
		incomes_Dataset.addValue(1520, "Classes", "SDK1.2");
		incomes_Dataset.addValue(1842, "Classes", "SDK1.3");
		incomes_Dataset.addValue(2991, "Classes", "SDK1.4");
		
		DefaultCategoryDataset expenses_Dataset = new DefaultCategoryDataset();
		expenses_Dataset.addValue(212, "Classes", "JDK1.0");
		expenses_Dataset.addValue(504, "Classes", "JDK1.1");
		expenses_Dataset.addValue(1520, "Classes", "SDK1.2");
		expenses_Dataset.addValue(1842, "Classes", "SDK1.3");
		expenses_Dataset.addValue(2991, "Classes", "SDK1.4");
		
		DefaultPieDataset pie_Dataset = new DefaultPieDataset( );
		pie_Dataset.setValue( "Incomes" , 20);  
		pie_Dataset.setValue( "Expenses" , 30);   
		
		JFreeChart incomes_Barchart = ChartFactory.createBarChart3D("Incomes Bar Chart of Last Month", "Type of Income", "Amount (euros)", incomes_Dataset, PlotOrientation.VERTICAL, false, true, false);
		JFreeChart expenses_Barchart = ChartFactory.createBarChart3D("Expenses Bar Chart of Last Month", "Type of Expense", "Amount (euros)", expenses_Dataset, PlotOrientation.VERTICAL, false, true, false);
		JFreeChart pie_Chart = ChartFactory.createPieChart("Incomes-Expense Pie Chart", pie_Dataset, false, true, false);
		
		ChartPanel incomes_BarchartPanel = new ChartPanel(incomes_Barchart);
		ChartPanel expenses_BarchartPanel = new ChartPanel(expenses_Barchart);
		ChartPanel inc_exp_PiechartPanel = new ChartPanel(pie_Chart);
		
		if(choice==1)
			setContentPane(incomes_BarchartPanel);
		else if(choice==2)
			setContentPane(expenses_BarchartPanel);
		else if(choice==3)
			setContentPane(inc_exp_PiechartPanel);
		
		this.setBackground(new Color(75, 75, 100));
		this.setVisible(true);
		this.setSize(540, 360);
	}

	protected void close_GUI() {
		this.dispose();
	}
}

