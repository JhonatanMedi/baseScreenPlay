package com.orange.stepDefinitions;


import io.cucumber.java.Before;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class Configuration {

    @Managed
    WebDriver theBrowser;

    @Before
    public void init() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActor("user");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(theBrowser));
        OnStage.theActorInTheSpotlight().attemptsTo(Open.browserOn().thePageNamed("pages.OrangeHrm"));
    }
}
