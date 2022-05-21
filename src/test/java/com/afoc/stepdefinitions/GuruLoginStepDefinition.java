package com.afoc.stepdefinitions;


import com.afoc.tasks.LoginGuru;
import com.afoc.utils.Errors;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.afoc.userinterface.HomeGuruPage.TITLE;
import static com.afoc.userinterface.LoginGuruPage.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class GuruLoginStepDefinition {

    @Before
    public void setup() {
        setTheStage(new OnlineCast());
    }

    @Given("{string} desea ir a la pagina de {string}")
    public void deseaIrALaPaginaDe(String actorName, String url) {
        theActorCalled(actorName).wasAbleTo(Open.url(url));
    }

    @When("Ingresa nombre de usuario {string} y password {string}")
    public void ingresaNombreDeUsuarioYPassword(String user, String password) {
        theActorInTheSpotlight().attemptsTo(LoginGuru.in(user, password, USER_NAME, PASSWORD, BTN_LOGIN));
    }

    @Then("Valida que el titulo sea {string}")
    public void validaQueElTituloSea(String titulo) {
        Errors.setErrors(TITLE, titulo);
    }

}
