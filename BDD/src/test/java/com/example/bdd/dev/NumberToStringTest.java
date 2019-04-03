package com.example.bdd.dev;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features/NumberToString.feature", glue = "com.example.bdd.dev.stepDefinition")
public class NumberToStringTest {
	// Driver class to run feature file NumberToString.feature
}
