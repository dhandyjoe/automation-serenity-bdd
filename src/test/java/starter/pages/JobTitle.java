package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/index.php/auth/login")
public class JobTitle extends PageObject {

    @FindBy(id ="menu_admin_viewAdminModule")
    WebElement adminDashboard;

    @FindBy(id = "menu_admin_Job")
    WebElement jobDashboard;

    @FindBy(id = "menu_admin_viewJobTitleList")
    WebElement jobTitle;

    @FindBy(id = "btnAdd")
    WebElement btnAdd;

    @FindBy(id = "jobTitle_jobTitle")
    WebElement editTextJobTitle;

    @FindBy(id = "btnSave")
    WebElement btnSave;

    public void clickAdminDashboard() { adminDashboard.click(); }

    public void clickJobDashboard() { jobDashboard.click(); }

    public void clickJobTitle() { jobTitle.click(); }

    public void clickBtnAdd() { btnAdd.click(); }

    public void inputJobTitle() { editTextJobTitle.sendKeys("try-this-job"); }

    public void clickBtnSave() { btnSave.click(); }

}
