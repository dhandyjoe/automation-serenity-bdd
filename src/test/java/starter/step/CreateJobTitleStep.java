package starter.step;

import starter.pages.JobTitle;

import static org.junit.Assert.assertTrue;

public class CreateJobTitleStep {

    JobTitle jobTitle;

    public void verifyDashboard(){
        assertTrue(jobTitle.verifyDashboard());
    }

    public void clickMyInfo(){
        jobTitle.clickMyInfo();
    }

}
