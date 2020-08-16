package tests;

import base.BaseTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

import java.lang.reflect.Method;

//public class HomePageTest extends BaseTest {
//    HomePage homePage;
//
//    @BeforeMethod(alwaysRun = true)
//    public void setUp(ITestResult result, Method method) {
//        super.setUp(method, result);
//        homePage = new HomePage(getDriver());
//    }
//
//
//    @Test(description = "Testing header of the page")
//    public void verifyMainHeaderText() {
//        extentTest.log(LogStatus.INFO, "Captured title of the page: " + homePage.mainHeader.getText());
//        Assert.assertEquals(homePage.mainHeader.getText(), "Automation with Selenium");
//        screenshot.takeScreenshotAndLog();
//    }
//
//    @Test(testName = "Verify Title", description = "This test validates title of Home page", groups = "smoke")
//    public void verifyTitle() {
//        Assert.assertEquals(getDriver().getTitle(), "TLA Automation");
//    }
//}