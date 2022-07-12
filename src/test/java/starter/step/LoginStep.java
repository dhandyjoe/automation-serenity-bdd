package starter.step;

import net.thucydides.core.annotations.Step;
import starter.pages.Login;
import starter.pages.Login;

import static org.junit.Assert.assertTrue;

public class LoginStep {

    Login login;

    @Step
    public void openLoginPage(){ login.open(); }

    @Step
    public void InputUsername(){
        login.InputUsername();
    }

    @Step
    public void InputPassword(){
        login.InputPassword();
    }

    @Step
    public void clickLoginButton(){ login.btnLogin(); }

    public void verifyLandingPage(){
        assertTrue(login.verifyLandingHomePage());
    }
}
