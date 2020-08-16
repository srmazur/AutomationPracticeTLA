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

public class HomePage extends BasePage {
    protected WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//title")
    public WebElement title;

    @FindBy(id = "title")
    public WebElement mainHeader;

    @FindBy(id = "admin")
    public WebElement usernameField;

    @FindBy(id = "adminPass")
    public WebElement passwordField;

    @FindBy(css = "a.navbar-brand.ml-3")
    public List<WebElement> list_of_elements;

    @FindBy(linkText = "Synchronization")
    public WebElement navBtn_synchronization;





        }


