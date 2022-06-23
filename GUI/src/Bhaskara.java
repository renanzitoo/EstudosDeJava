import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Bhaskara {

	public static void main(String[] args) {
		
		
		//Jframe
		JFrame screen = new JFrame();
		screen.setSize(new Dimension (500,500));
		screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		screen.setTitle("Bhaskara");
		//Jlabel
		JLabel letterA = new JLabel();
		letterA.setText("A");
		
		JLabel letterB = new JLabel();
		letterB.setText("B");
		
		JLabel letterC = new JLabel();
		letterC.setText("C");
		
		JLabel letterX = new JLabel();
		letterX.setText("X");
		
		JLabel letterY = new JLabel();
		letterY.setText("Y");
		//text fields
		JTextField fieldA = new JTextField();
		
		JTextField fieldB = new JTextField();
		
		JTextField fieldC = new JTextField();
		
		JTextField fieldX = new JTextField();
		
		JTextField fieldY = new JTextField();
		
		//Button
		
		JButton btnl = new JButton();
		btnl.setText("Calcule");
		btnl.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// Button function
				String varA = fieldA.getText();
				String varB = fieldB.getText();
				String varC = fieldC.getText();
				
				int numA = Integer.parseInt(varA);
				int numB = Integer.parseInt(varB);
				int numC = Integer.parseInt(varC);
				
				double delta, x1 , x2;
				String rx1, rx2;
				rx1= "X";
				rx2= "Y";
				
				delta = (numB*numB) - 4*numA*numC;
				if (delta<0) {
					JOptionPane.showMessageDialog(null, "O delta não pode ser negativo");	
				}else {
					x1 = (numB * (-1) + Math.sqrt(delta))/2*numA;
					x2 = (numB * (-1) - Math.sqrt(delta))/2*numA;
					
					rx1 = String.valueOf(x1);
					rx2 = String.valueOf(x2);
					
				}
				
				fieldX.setText(rx1);
				fieldY.setText(rx2);
			}
			
		});
		
		//SetBounds
		letterA.setBounds(10,10,20,40);
		letterB.setBounds(10,80,20,40);
		letterC.setBounds(10,150,20,40);
		fieldA.setBounds(30,10,200,40);
		fieldB.setBounds(30,80,200,40);
		fieldC.setBounds(30,150,200,40);
		letterX.setBounds(10,290,20,40);
		letterY.setBounds(10,360,20,40);
		fieldX.setBounds(30,280,200,40);
		fieldY.setBounds(30,350,200,40);
		btnl.setBounds(30,220,200,40);
		
		
		//Container 
		Container container = screen.getContentPane();
		container.setLayout(null);
		container.add(letterA);
		container.add(letterB);
		container.add(letterC);
		container.add(letterX);
		container.add(letterY);
		container.add(fieldA);
		container.add(fieldB);
		container.add(fieldC);
		container.add(fieldX);
		container.add(fieldY);
		container.add(btnl);
		screen.setVisible(true);
		
		
		
		
		
		
		

	}

}
