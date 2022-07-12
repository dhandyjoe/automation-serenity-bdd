package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Steps;
import starter.step.CreateJobTitleStep;
import starter.step.LoginStep;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/index.php/auth/login")
public class CreateJobTitleStepDef {

    @Steps
    CreateJobTitleStep createJobTitleStep;

    @When("User click admin dashboard")
    public void userClickAdminDashbpard() { createJobTitleStep.clickAdminDashboard(); }

    @And("User click job dashboard")
    public void userClickMyInfo() { createJobTitleStep.clickJobDashboard(); }

    @And("User click Job Title")
    public void userClickJobTitle() {
        createJobTitleStep.clickJobTitle();
    }

    @And("User click Add Button")
    public void userClickAddButton() {
        createJobTitleStep.clickBtnAdd();
    }

    @And("User input Job title")
    public void userInputJobTitle() {
        createJobTitleStep.inputJobTitle();
    }

    @And("User click Save Button")
    public void userClickSaveButton() {
        createJobTitleStep.clickBtnSave();
    }

    @Then("Job title is displayed")
    public void jobTitleIsDisplayed() {
    }
}
