package com.orange.stepDefinitions;

import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;

public class LoginStepDefinitions {

    @Given("^the user access on the pages$")
    public void accessPages() {
        OnStage.theActorInTheSpotlight();
    }
}
