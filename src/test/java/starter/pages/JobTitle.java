package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/index.php/auth/login")
public class JobTitle extends PageObject {

    @FindBy(id ="mainMenuFirstLevelUnorderedList")
    WebElement dashboard;

    @FindBy(id = "menu_pim_viewMyDetails")
    WebElement myInfo;

    public Boolean verifyDashboard() {return dashboard.isDisplayed(); }

    public void clickMyInfo() { myInfo.click(); }

}
