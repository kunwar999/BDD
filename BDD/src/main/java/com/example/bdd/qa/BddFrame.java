package com.example.bdd.qa;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BddFrame extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	JButton button;
	JLabel label;
	LoginPanel loginPanel;

	public BddFrame(String title) {
		super();
		setTitle(title);
		setSize(640, 480);
		label = new JLabel("Ready to learn BDD?");
		label.setName("welcomeLabel");
		button = new JButton("Proceed");
		button.setName("proceedButton");
		button.addActionListener(this);
		loginPanel = new LoginPanel(label);
		loginPanel.setName("loginPanel");
		loginPanel.setVisible(false);
		this.add(loginPanel);
		getContentPane().add(BorderLayout.SOUTH, button);
		getContentPane().add(BorderLayout.NORTH, label);
	}

	public void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent event) {
		loginPanel.setVisible(true);
	}
}
