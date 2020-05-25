import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class gui implements ActionListener {
	
	private static JLabel label;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton button;

	

	public static void main(String[] args) {
		JPanel panel= new JPanel();
		JFrame frame= new JFrame();
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);
		
		panel.setLayout(null);
		label= new JLabel("Korisničko_ime");
		label.setBounds(10, 20, 80, 25);
		panel.add(label);
		
		userText= new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		passwordLabel = new JLabel("šifra");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);
		
		passwordText = new JPasswordField();
		passwordText.setBounds(100, 50, 165, 25);
		panel.add(passwordText);
		
		button =new JButton("Login");
		button.setBounds(10, 80, 80, 25);
		panel.add(button);
		button.addActionListener(new gui());
		
		

		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	 
		String user = userText.getText();
		String password = passwordText.getText();
		
	}

}
