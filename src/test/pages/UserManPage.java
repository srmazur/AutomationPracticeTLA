package pages;

import base.BasePage;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class UserManPage extends BasePage {
    protected WebDriver driver;

    public UserManPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



    @FindBy(xpath = "//a[text()='User-Mgt']")
    public WebElement user_mgt;

    @FindBy(xpath = "//a[text()='Login']")
    public WebElement login_btn;

    @FindBy(id = "access-db-btn")
    public WebElement access_btn;

    @FindBy(className = "form-control")
    public List<WebElement> form_list;

    @FindBy(xpath = "//table[@id = 'list-table']//tr")
    public List <WebElement >list_table;

    @FindBy(xpath = "//*[@id='submit-btn']")
    public WebElement subb;

    @FindBy(xpath = "//*[@id='list-table']/tbody/tr/td")
    public  List<WebElement> tableresolt;

    @FindBy(xpath = "/*[@id='list-table']/thead/tr/th")
    public  List<WebElement> tableheader;

    @FindBy(xpath = "//*[@id='clear-btn']")
    public WebElement clearbnt;

    @FindBy(xpath = "//*[@id='submit-table-btn']")
    public WebElement subbtn;

    public void fillingFildes(){
        Faker faker = new Faker();

       form_list.get(0).sendKeys(faker.name().firstName());
       form_list.get(1).sendKeys(faker.name().lastName());
       form_list.get(2).sendKeys(faker.phoneNumber().cellPhone());
       form_list.get(3).sendKeys(faker.internet().emailAddress());
        Select role = new Select(form_list.get(4));
       role.selectByIndex(1);
    }

    //a[text()='Login']






}


