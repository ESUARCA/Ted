package com.accenture.runners;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
		features = "src/test/resources/features/buy_in_vivacolombia.feature",
		tags = "@tag1",
		glue = "com.accenture.stepdefinitions",
		snippets = SnippetType.CAMELCASE)

public class BuyInVivacolombia {
	
}
