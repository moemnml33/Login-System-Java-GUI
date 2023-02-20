import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.util.HashMap;

import javax.swing.*;

public class LoginSystem extends JFrame implements ActionListener {
	private HashMap<String, String> loginInfo = new HashMap<String, String>();
	private JButton loginButton, resetButton;
	private JTextField userIDField;
	private JPasswordField passwordField;
	private JLabel userIDLabel, passwordLabel, messageLabel;
	
	public LoginSystem(HashMap<String, String> loginInfo) {
		this.loginInfo = loginInfo;
		loginButton = new JButton("Login");
		resetButton = new JButton("Reset");
		userIDField = new JTextField();
		passwordField = new JPasswordField();
		userIDLabel = new JLabel("User ID");
		passwordLabel = new JLabel("Password");
		messageLabel = new JLabel();
		
		userIDLabel.setBounds(50, 100, 75, 25);
		passwordLabel.setBounds(50, 150, 75, 25);
		userIDLabel.setBackground(Color.BLACK);
		userIDLabel.setForeground(Color.MAGENTA);
		passwordLabel.setBackground(Color.BLACK);
		passwordLabel.setForeground(Color.MAGENTA);

		userIDField.setBounds(125, 100, 200, 25);
		passwordField.setBounds(125, 150, 200, 25);
		userIDField.setBackground(Color.BLACK);
		userIDField.setForeground(Color.MAGENTA);
		userIDField.setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
		userIDField.setCaretColor(Color.MAGENTA);
		passwordField.setBackground(Color.BLACK);
		passwordField.setForeground(Color.MAGENTA);
		passwordField.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		passwordField.setCaretColor(Color.DARK_GRAY);
		
		loginButton.setBounds(125, 200, 100, 25);
		loginButton.addActionListener(this);
		loginButton.setBackground(Color.BLACK);
		loginButton.setForeground(Color.MAGENTA);
		loginButton.setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
		loginButton.setFocusable(false);
		resetButton.setBounds(225, 200, 100, 25);
		resetButton.addActionListener(this);
		resetButton.setBackground(Color.BLACK);
		resetButton.setForeground(Color.MAGENTA);
		resetButton.setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
		resetButton.setFocusable(false);
		
		messageLabel.setBounds(125, 250, 200, 35);
		messageLabel.setFont(new Font("Arial", Font.ITALIC, 15));
		
		this.add(userIDLabel);
		this.add(passwordLabel);
		this.add(messageLabel);
		this.add(passwordField);
		this.add(userIDField);
		this.add(loginButton);
		this.add(resetButton);
		
		this.getContentPane().setBackground(Color.BLACK);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420, 420);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==resetButton) {
			userIDField.setText("");
			passwordField.setText("");
			messageLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			messageLabel.setText("");		
		}
		if(e.getSource()==loginButton) {
			String userID = userIDField.getText();
			String password = String.valueOf(passwordField.getPassword());
			
			if(loginInfo.containsKey(userID) ) {
					if(loginInfo.get(userID).equals(password)) { 
						messageLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
						messageLabel.setForeground(Color.MAGENTA);
						messageLabel.setText("Welcome back "+userIDField.getText()+".");
				}
					else {
						messageLabel.setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
						messageLabel.setForeground(Color.MAGENTA);
						messageLabel.setText("Wrong password");
					}

			}
			else {
				messageLabel.setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
				messageLabel.setForeground(Color.MAGENTA);
				messageLabel.setText("Wrong username");
			}

		}
	}

}
