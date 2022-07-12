package starter.step;

import starter.pages.JobTitle;

import static org.junit.Assert.assertTrue;

public class CreateJobTitleStep {

    JobTitle jobTitle;

    public void clickAdminDashboard(){
        jobTitle.clickAdminDashboard();
    }

    public void clickJobDashboard(){
        jobTitle.clickJobDashboard();
    }

    public void clickJobTitle(){
        jobTitle.clickJobTitle();
    }

    public void clickBtnAdd(){
        jobTitle.clickBtnAdd();
    }

    public void inputJobTitle(){
        jobTitle.inputJobTitle();
    }

    public void clickBtnSave(){
        jobTitle.clickBtnSave();
    }
}
