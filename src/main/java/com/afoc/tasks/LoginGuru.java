package com.afoc.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class LoginGuru implements Task {

    private String user;
    private String password;
    private Target fieldUser;
    private Target fieldPassword;
    private Target btnLogin;

    public LoginGuru(String user, String password, Target fieldUser, Target fieldPassword, Target btnLogin) {
        this.user = user;
        this.password = password;
        this.fieldUser = fieldUser;
        this.fieldPassword = fieldPassword;
        this.btnLogin = btnLogin;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user).into(fieldUser),
                Enter.theValue(password).into(fieldPassword),
                Click.on(btnLogin)
                );
    }

    public static Performable in(String user, String password, Target fieldUser, Target fieldPassword, Target btnLogin ) {
        return Tasks.instrumented(LoginGuru.class, user, password, fieldUser, fieldPassword, btnLogin);
    }
}
