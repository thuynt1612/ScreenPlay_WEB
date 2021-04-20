package screenplayWeb.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import screenplayWeb.tasks.HomePage;
import screenplayWeb.tasks.LoginAction;

@RunWith(SerenityRunner.class)
public class Login {
    @Managed(uniqueSession = true)
    public WebDriver herBrowser;
    Actor anna = Actor.named("Anna");
    @Before
    public void openBrowse(){
        anna.can(BrowseTheWeb.with(herBrowser));
    }
    @Test
    public void annaLogin(){
        anna.attemptsTo(LoginAction.withUsername("annhien@gmail.com").andPassword("0983951445"));
        anna.attemptsTo();
    }
}