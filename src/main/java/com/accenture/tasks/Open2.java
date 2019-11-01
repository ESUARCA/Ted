package com.accenture.tasks;

import com.accenture.ui.vivacolombiaHomePage;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Open2 implements Task{
	
	PageObject mainPage;

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(mainPage));
	}

	public static Open2 on(PageObject mainPage) {
		return Tasks.instrumented(Open2.class, mainPage);
	}

}
