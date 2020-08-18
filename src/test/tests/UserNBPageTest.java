package tests;

import base.BaseTest;
import helpers.Pojo;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.UserD8Page;
import pages.UserManPage;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Set;

public class UserNBPageTest extends BaseTest {
    Pojo pojo = new Pojo();
    UserD8Page homePage;

    @BeforeMethod(alwaysRun = true)
    public void setUp(ITestResult result, Method method) {
        homePage = new UserD8Page(getDriver());
        homePage.user_mgt.click();
        homePage.DB_btn.click();
        String parent = getDriver().getWindowHandle();
        Set<String> set = getDriver().getWindowHandles();
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String s = (String) iterator.next();
            if (!s.equals(parent)) {
                getDriver().switchTo().window(s);
            }
        }
    }
        @Test(testName = "Verify Title", description = "Verifying Title Of User Manager page")
        public void titleUser () {
            Assert.assertEquals(getDriver().getTitle(), "User DB");
            screenshot.takeScreenshotAndLog();
        }
        @ Test(testName = "Verify Table ", description = "Verifying Table")
    public void VerifyTable(){
        for (int i = 0 ; i <homePage.tablelist.size(); i++) {
            Assert.assertTrue(homePage.tablelist.get(i).isEnabled());
            System.out.println(homePage.tablelist.get(i).getText());
        }
            screenshot.takeScreenshotAndLog();
        }
    @Test(testName = "Verify Btn", description = "Verifying if btn is not present for 3 items")
    public void BntPressent () {

        Assert.assertEquals((homePage.tableresolt.size()-homePage.dellitbnt.size()),3);
        screenshot.takeScreenshotAndLog();
    }

    }

