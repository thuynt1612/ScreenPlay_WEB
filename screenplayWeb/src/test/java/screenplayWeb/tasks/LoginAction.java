package screenplayWeb.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import screenplayWeb.ui.LoginScreen;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginAction implements Task {
    private String username;
    private String password;
    public LoginAction(String username,String password){
        this.username=username;
        this.password = password;
    };

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("https://fado.vn"),
                Click.on(LoginScreen.DANGNHAP_FIRST),
                Enter.theValue(username).into(LoginScreen.USENAME_FIELD),
                Enter.theValue(password).into(LoginScreen.PASSWORD_FIELD),
                Click.on(LoginScreen.DANGNHAP_BUTTON)
        );
    }
    public static LoginBuilder withUsername(String username) {
        return new LoginBuilder(username);
    }
    public static class LoginBuilder
    {
        private String username;
        public LoginBuilder(String username)
        {
            this.username = username;
        }

        public LoginAction andPassword(String password) {
            return instrumented(LoginAction.class, this.username, password);
        }
    }
}


