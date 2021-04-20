package screenplayWeb.ui;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginScreen {
    public static final Target DANGNHAP_FIRST = Target.the("Dang nhap button first")
            .located(By.className("login-btn mz-mr-4"));
    public static final Target USENAME_FIELD = Target.the("Username textbox")
            .located(By.id("auth-block__form-group__email"));
    public static final Target PASSWORD_FIELD = Target.the("Password textbox")
            .located(By.name("password"));
    public static final Target DANGNHAP_BUTTON = Target.the("Dang nhap button")
            .located(By.className("my-btn -btn-pill -btn-grd-bg"));
}
