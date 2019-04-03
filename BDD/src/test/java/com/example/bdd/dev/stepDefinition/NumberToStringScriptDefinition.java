package com.example.bdd.dev.stepDefinition;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import com.example.bdd.dev.NumberToString;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NumberToStringScriptDefinition {

	long number = 0;
	String actualResult = null;
	String expectedResult = null;

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getActualResult() {
		return actualResult;
	}

	public void setActualResult(String actualResult) {
		this.actualResult = actualResult;
	}

	public String getExpectedResult() {
		return expectedResult;
	}

	public void setExpectedResult(String expectedResult) {
		this.expectedResult = expectedResult;
	}

	@Given("^A Single Digit Number$")
	public void SetSingleDigitNumber() {
		setNumber(3);
		setExpectedResult("three");
	}

	@Given("^A Double Digit Number$")
	public void setDoubleDigitNumbers() {
		setNumber(34);
		setExpectedResult("thirty four");
	}

	@Given("^A Double Digit Number from teens$")
	public void setDoubleDigitFromTeens() {
		setNumber(17);
		setExpectedResult("seventeen");
	}

	@Given("^A Triple Digit Number$")
	public void setTripleDigitNumber() {
		setNumber(115);
		setExpectedResult("one hundred and fifteen");
	}

	@Given("^A long Number$")
	public void setLongNumber() {
		setNumber(438237764);
		setExpectedResult("forty three crore eighty two lakh thirty seven thousand seven hundred and sixty four");
	}

	@Given("^A Single Digit Number is (.*)$")
	public void SetSingleDigitNumber(long number) {
		setNumber(number);
	}

	@Given("^A Double Digit Number is (.*)$")
	public void setDoubleDigitNumbers(long number) {
		setNumber(number);
	}

	@Given("^A Double Digit Number from teens is (.*)$")
	public void setDoubleDigitFromTeens(long number) {
		setNumber(number);
	}

	@Given("^A Triple Digit Number is (.*)$")
	public void setTripleDigitNumber(long number) {
		setNumber(number);
	}

	@Given("^A long Number is (.*)$")
	public void setLongNumber(long number) {
		setNumber(number);
	}

	@When("^conversion API called$")
	public void callConversionAPI() {
		setActualResult(NumberToString.convertToWords(getNumber()).trim());
	}

	@Then("^it should return that number in words$")
	public void shouldReturnSingleDigitNumberInWords() {
		assertThat(getActualResult(), equalTo(getExpectedResult()));
	}

	@Then("^it should return that number in words as (.*)$")
	public void shouldReturnSingleDigitNumberInWords(String expectedResult) {
		assertThat(getActualResult(), equalTo(expectedResult));
	}
}