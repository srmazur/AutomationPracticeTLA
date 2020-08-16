package tests;

import base.BaseTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.UserManPage;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class UserManPageTest extends BaseTest {
    UserManPage homePage;

    @BeforeMethod(alwaysRun = true)
    public void setUp(ITestResult result, Method method) {
        homePage = new UserManPage(getDriver());
        homePage.user_mgt.click();
    }



    @Test(testName = "Verify Title", description = "Verifying Title Of User Manager page")
    public void titleUser(){

        Assert.assertEquals(getDriver().getTitle(),"Register New User");

    }
    @Test(testName = "Verify Buttons " , description = "Verifing buttons pressents")
    public void VerifyBnt(){

        Assert.assertTrue(homePage.login_btn.isDisplayed());
        Assert.assertTrue(homePage.access_btn.isDisplayed());

    }
    @Test(testName = "Verify input fields" , description = "Verifying input fields")
    public void InpoutFields(){

        Assert.assertEquals(homePage.form_list.size() , 5);

        List<String> actual =new ArrayList<>();
for(WebElement e : homePage.form_list){
    actual.add(e.getText());

}
for (int i = 0 ; i < homePage.form_list.size(); i++){
        Assert.assertEquals(homePage.form_list.get(i).getText() , actual.get(i));
        }
        screenshot.takeScreenshotAndLog();

    }
    @Test(testName = "Verify Table" , description = "verifying data table is empty")
    public void Table(){
      for(int i = 1 ; i<homePage.list_table.size();i++){ Assert.assertEquals(homePage.form_list.get(i).getText(),"");
          screenshot.takeScreenshotAndLog();
      }
    }
    @Test
    public void VerifyFormFill(){
        homePage.fillingFildes();
        screenshot.takeScreenshotAndLog();
        homePage.subb.click();
        for(int i = 0; i<homePage.tableres.size();i++){
           Assert.assertTrue((homePage.tableres.get(i).getText().length()>0));
        }
            screenshot.takeScreenshotAndLog();

    }

}
