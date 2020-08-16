package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    //a[text()='Login']






}


