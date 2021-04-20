package screenplayWeb.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import screenplayWeb.ui.LoginScreen;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HomePage implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url("https://fado.vn"),
        Click.on(LoginScreen.DANGNHAP_FIRST));
    }
    public HomePage homePage(){
        return instrumented(HomePage.class);
    }
}
