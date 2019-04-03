package com.example.bdd.qa;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features/BddFrame.feature", glue = "com.example.bdd.qa.stepDefinition")
public class BddFrameTest {
	// Driver class to run feature file BddFrame.feature
}
