package com.accenture.stepdefinitions;

import org.junit.Before;
import org.openqa.selenium.WebDriver;

import com.accenture.tasks.Open2;
import com.accenture.ui.vivacolombiaHomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;

public class BuyInVivacolombia {
	Actor tati = Actor.named("Admin");
	private vivacolombiaHomePage mainPage;

	@Managed(driver = "chrome")
	public WebDriver hisBrowser;

	
	@Before
	public void configuracionInicial() {tati.can(BrowseTheWeb.with(hisBrowser));
	
	}
	
	@Given("^I am on the page of vivacolombia$")
	public void iAmOnThePageOfVivacolombia() {
		tati.wasAbleTo(Open2.on(mainPage));
	  
	}

	@When("^I buy a ticket to (.*)")
	public void iBuyATicketToCanocristales(String place) {
	    
	}


	@Then("^To travel this weekend$")
	public void toTravelThisWeekend() {
	    
	}
}
