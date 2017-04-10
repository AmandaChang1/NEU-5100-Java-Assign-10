import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CelsiusFahrenheitConverter extends JFrame {
	private JButton convertButton;
	private JTextField convertTextField;
	
	public CelsiusFahrenheitConverter(){
		createComponenets();
		createLayout();
		addComponents();
		addListeners();
		display();
	}
	 
	
	private void createComponenets() {
		convertButton = new JButton("Convert Fahrenheit to Celsius");
		convertTextField = new JTextField(30);
	}

	private void addComponents() {
		Container con = getContentPane();
		con.add(convertButton);
		con.add(convertTextField);
		
	}

	private void createLayout() {
		Container con= this.getContentPane();
		FlowLayout flowlayout = new FlowLayout();
		con.setLayout(flowlayout);
	}

	class convertBehavior implements ActionListener {
		
		public void convert(JTextField tf){
			String temperature = tf.getText();
			float t= Float.valueOf(temperature);
		    t = ((t - 32)*5)/9;
			String t1 = String.valueOf(t);
			tf.setText(t1);
			System.out.println("Temperatue in Celsius = " + t1);
		}
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			convert(convertTextField);
			
		}
	}	
	
	private void addListeners() {
		 convertBehavior behavior = new convertBehavior ();
		 convertButton.addActionListener(behavior);
		
	}

	private void display() {
		setSize(500, 500);
		setVisible(true);
		
	}


	public static void main(String[] args) {
		new CelsiusFahrenheitConverter();

	}

}
