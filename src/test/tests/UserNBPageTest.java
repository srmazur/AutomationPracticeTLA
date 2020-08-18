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

        }
    }

