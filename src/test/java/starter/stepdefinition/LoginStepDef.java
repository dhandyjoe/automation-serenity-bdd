package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Steps;
import starter.step.LoginStep;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/index.php/auth/login")
public class LoginStepDef {

    @Steps
    LoginStep loginStep;

    @Given("Already on the website login")
    public void goToTheWebsiteLogin() { loginStep.openLoginPage();
    }

    @When("User input valid username")
    public void userInputValidUsername() { loginStep.InputUsername();
    }

    @And("User input valid password")
    public void userInputValidPassword() { loginStep.InputPassword();
    }

    @And("User click login button")
    public void userClickLoginButton() { loginStep.clickLoginButton();
    }

    @Then("User can landing on home page")
    public void userCanLandingOnHomePage() { loginStep.verifyLandingPage();
    }
}