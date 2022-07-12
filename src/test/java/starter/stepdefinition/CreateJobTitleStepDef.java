package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Steps;
import starter.step.CreateJobTitleStep;
import starter.step.LoginStep;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/index.php/auth/login")
public class CreateJobTitleStepDef {

    @Steps
    CreateJobTitleStep createJobTitleStep;

    @When("User click dashboard admin")
    public void userClickAdminDashbpard() { createJobTitleStep.verifyDashboard(); }

    @And("Click MyInfo dashboard")
    public void userClickMyInfo() { createJobTitleStep.clickMyInfo(); }
}
