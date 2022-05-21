package com.afoc.utils;

import com.afoc.enums.MsgError;
import com.afoc.exceptions.ExceptionError;
import com.afoc.questions.GetText;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class Errors {

    public static void setErrors(Target target, String text) {
        theActorInTheSpotlight().
                should(seeThat(GetText.field(target), equalTo(text)).
                        orComplainWith(ExceptionError.class, String.format(MsgError.MSG_ERROR_TEXT.getMsg(), text, GetText.field(target).answeredBy(theActorInTheSpotlight()))));
    }

}
