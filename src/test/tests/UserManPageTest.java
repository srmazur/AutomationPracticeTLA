package tests;

import base.BaseTest;
import com.relevantcodes.extentreports.LogStatus;
import helpers.Pojo;
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
    Pojo pojo = new Pojo();
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
    @Test(testName = "Verify Fill" , description = "verifying data table is  not empty")
    public void VerifyFormFill(){
        homePage.fillingFildes();
        screenshot.takeScreenshotAndLog();
        homePage.subb.click();
        for(int i = 0; i<homePage.tableresolt.size();i++){
           Assert.assertTrue((homePage.tableresolt.get(i).getText().length()>0));
        }
            screenshot.takeScreenshotAndLog();

    }
    @Test(testName = "verify fields are added  column" , description = "verifying fields are added to corresponding column")
    public void AddedToColumn(){
        homePage.fillingFildes();
        homePage.subb.click();

        for (int i = 0 ; i < homePage.tableheader.size(); i++){
            if (homePage.tableheader.get(i).getText().contains("First name")){
               Assert.assertTrue( homePage.tableresolt.get(i).equals(pojo.getFirstName()));
            }
            if (homePage.tableheader.get(i).getText().contains("Last name")){
                Assert.assertTrue( homePage.tableresolt.get(i).equals(pojo.getLastName()));
            }
            if (homePage.tableheader.get(i).getText().contains("Phone Number")){
                Assert.assertTrue( homePage.tableresolt.get(i).equals(pojo.getPhoneNumber()));
            }
            if (homePage.tableheader.get(i).getText().contains("Email")){
                Assert.assertTrue( homePage.tableresolt.get(i).equals(pojo.getEmail()));
            }
            if (homePage.tableheader.get(i).getText().contains("Role")){
                Assert.assertTrue( homePage.tableresolt.get(i).getText().contains("Student"));
            }
        }
        screenshot.takeScreenshotAndLog();

    }
    @Test(testName = "Verify Clear Button " , description = "Verifying clear button will clear column")
    public void VerifyClearButton(){
        homePage.fillingFildes();
        homePage.clearbnt.click();
        for(int i = 1 ; i<homePage.list_table.size();i++) {
            Assert.assertEquals(homePage.form_list.get(i).getText(), "");
        }
        screenshot.takeScreenshotAndLog();

    }
    @Test(testName = "Verify Submit Button " , description = "Verifying submit button will clear column")
    public void VerifySubmitButton(){
        homePage.fillingFildes();
        homePage.subbtn.click();
        for(int i = 1 ; i<homePage.list_table.size();i++) {
            Assert.assertEquals(homePage.form_list.get(i).getText(), "");
        }
        screenshot.takeScreenshotAndLog();

    }

}
