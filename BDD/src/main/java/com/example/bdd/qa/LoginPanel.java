package com.example.bdd.qa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class LoginPanel extends JPanel implements ActionListener {

	private JLabel parentLabel;
	private JTextField usernameInput;
	private JPasswordField passwordInput;
	private JButton login;

	public LoginPanel(JLabel label) {
		this.parentLabel = label;
		setLayout(new MigLayout());
		JLabel username = new JLabel("Username:");
		username.setName("usernameLabel");
		usernameInput = new JTextField(15);
		usernameInput.setName("username");
		JLabel password = new JLabel("Password:");
		password.setName("passwordLabel");
		passwordInput = new JPasswordField(15);
		passwordInput.setName("password");
		login = new JButton("Login");
		login.setName("login");
		login.addActionListener(this);
		this.add(username, "gap rel");
		this.add(usernameInput, "gap rel,wrap");
		this.add(password, "gap rel");
		this.add(passwordInput, "gap rel,wrap");
		this.add(login, "gap rel,wrap");
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if (usernameInput.getText().equalsIgnoreCase("admin") && passwordInput.getText().equalsIgnoreCase("admin")) {
			this.parentLabel.setText("Login Successful!!! Welcome to BDD!!!!");
			this.setVisible(false);
		}
		else{
			usernameInput.setText("");
			passwordInput.setText("");
		}

	}

}
