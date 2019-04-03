package com.example.bdd.qa.stepDefinition;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import com.example.bdd.qa.BddFrameTestHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BddFrameScriptDefinition {

	private BddFrameTestHelper helper = new BddFrameTestHelper();

	@Given("^BddFrame is open$")
	public void openBddFrame() {
		helper.openBddFrame();
		pause();
	}

	@When("^proceed button is clicked$")
	public void clickProceedButton() {
		helper.clickProceed();
		pause();
	}

	@Then("^it should open login window which will have input fields like username and password$")
	public void LoginPanelVisible() {
		helper.LoginPanelVisible();
		pause();
	}

	@Given("^Login panel is visible$")
	public void openLoginFrame() {
		helper.openLoginFrame();
		pause();
	}

	@Given("^User enters username (.*) and password (.*)$")
	public void userEnterUsernameAndPassword(String username,String password) {
		helper.userEnterUsernameAndPassword(username,password);
		pause();
	}

	@When("^user clicks on login button$")
	public void userClicksOnLoginButton() {
		helper.userClicksOnLoginButton();
		pause();
	}

	@Then("^on successful login it should change main label to welcome message$")
	public void changeWelcomeLabel() {
		String message = helper.getWelcomeLabel();
		pause();
		assertThat(message, equalTo("Login Successful!!! Welcome to BDD!!!!"));
	}
	@Then("^on unsuccessful login it reset login panel fields$")
	public void resetLoginPanelFields() {
		String username = helper.getUsername();
		String password = helper.getPassword();
		pause();
		assertThat(username, equalTo(""));
		assertThat(password, equalTo(""));
	}
	

	private void pause() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException exception) {
			exception.printStackTrace();
		}
	}
}