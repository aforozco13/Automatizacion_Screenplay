package com.afoc.userinterface;


import net.serenitybdd.screenplay.targets.Target;

public class LoginGuruPage {

    public static final Target USER_NAME = Target.the("el nombre de usuario").locatedBy("name:uid");
    public static final Target PASSWORD = Target.the("el password del usuario").locatedBy("name:password");
    public static final Target BTN_LOGIN = Target.the("el nombre de usuario").locatedBy("//*[@value='LOGIN']");

}
