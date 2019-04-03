package com.example.bdd.qa;

import org.fest.swing.edt.GuiActionRunner;
import org.fest.swing.edt.GuiQuery;
import org.fest.swing.fixture.FrameFixture;
import org.fest.swing.fixture.JButtonFixture;
import org.fest.swing.fixture.JLabelFixture;
import org.fest.swing.fixture.JPanelFixture;
import org.fest.swing.fixture.JTextComponentFixture;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BddFrameTestHelper {

	FrameFixture window = null;
	JPanelFixture loginPanel = null;

	public void openBddFrame() {
		BddFrame frame = GuiActionRunner.execute(new GuiQuery<BddFrame>() {
			protected BddFrame executeInEDT() {
				@SuppressWarnings("resource")
				ApplicationContext context = new AnnotationConfigApplicationContext(SpringContext.class);
				BddFrame bddFrame = (BddFrame) context.getBean("bddFrame");
				bddFrame.init();
				return bddFrame;
			}
		});
		window = new FrameFixture(frame);
	}

	public void clickProceed() {
		JButtonFixture proccedButton = window.button("proceedButton");
		proccedButton.click();
	}

	public JPanelFixture LoginPanelVisible() {
		try {
			loginPanel = window.panel("loginPanel");
			return loginPanel.requireVisible();
		} finally {
			window.cleanUp();
		}
	}

	public void openLoginFrame() {
		loginPanel = window.panel("loginPanel");
	}

	public void userEnterUsernameAndPassword(String usernameInput, String passwordInput) {
		JTextComponentFixture username = loginPanel.textBox("username");
		JTextComponentFixture password = loginPanel.textBox("password");
		username.setText(usernameInput);
		password.setText(passwordInput);
	}

	public void userClicksOnLoginButton() {
		JButtonFixture login = loginPanel.button("login");
		login.click();
	}

	public String getWelcomeLabel() {
		try {
			JLabelFixture welcomeLabel = window.label("welcomeLabel");
			String welcomeMessage = welcomeLabel.text();
			return welcomeMessage;
		} finally {
			window.cleanUp();
		}
	}

	public String getUsername() {
		JTextComponentFixture username = loginPanel.textBox("username");
		return username.text();
	}

	public String getPassword() {
		JTextComponentFixture password = loginPanel.textBox("password");
		return password.text();
	}
}