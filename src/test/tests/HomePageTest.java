package tests;

import base.BaseTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

import java.lang.reflect.Array;
import java.lang.reflect.Method;

public class HomePageTest extends BaseTest {
    HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void setUp(ITestResult result, Method method) {
        super.setUp(method, result);
        homePage = new HomePage(getDriver());
    }


    @Test(testName = "Verify Title", description = "This test validates title of Home page")
    public void verifyTitle() {
        Assert.assertEquals(getDriver().getTitle(), "TLA Automation");
        screenshot.takeScreenshotAndLog();
    }
    @Test(testName = "Verify Vesability" , description = "This test validating vesability")
    public void VerefVes() {
        for (int i = 0; i < homePage.list_of_elements.size(); i++) {
            Assert.assertTrue(homePage.list_of_elements.get(i).isDisplayed());
            screenshot.takeScreenshotAndLog();
        }
    }
        @Test(testName = "Verify Title", description = "Verifing Title Of User Maneger page")
                public void titleUser(){
        homePage.user_mgt.click();
        Assert.assertEquals(getDriver().getTitle(),"Register New User");

        }

    }
