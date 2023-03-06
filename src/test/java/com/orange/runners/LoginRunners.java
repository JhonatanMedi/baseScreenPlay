package com.orange.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="src/test/resources/features/Login.feature", glue = "com/orange/stepDefinitions", plugin = "pretty")
public class LoginRunners {

}
