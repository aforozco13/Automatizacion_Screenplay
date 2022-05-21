package com.afoc.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue= { "com.afoc.stepdefinitions","com.afoc.hooks"},
        features = "src/test/resources/features/guru_login.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class GuruLogin {
}
