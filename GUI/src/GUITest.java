import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GUITest {

	public static void main(String[] args) {
		
		JFrame screen = new JFrame();
		JLabel number = new JLabel();
		JTextField text = new JTextField();
		JButton btnl = new JButton();
		number.setText("Escreva um numero aqui");
		number.setBounds(10, 10, 400, 100);
		
		screen.setSize(new Dimension (1000,1000));
		screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		screen.setTitle("My first screen");
		
		text.setBounds(10,80,400,40);
		
		btnl.setBounds(10,135,150,50);
		btnl.setText("Click Here");
		btnl.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("O botão funcionou");
					String numberA = text.getText();
					int n1 = Integer.parseInt(numberA);
					int n2 = n1*n1;
					String r = String.valueOf(n2);
					JOptionPane.showMessageDialog(null, r);				
					
			}
			
		});
		
		Container container = screen.getContentPane();
		container.setLayout(null);
		container.add(number);
		container.add(text);
		container.add(btnl);
		screen.setVisible(true);
		
		
		
		
	}

}
