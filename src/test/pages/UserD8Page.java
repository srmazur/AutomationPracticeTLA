package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UserD8Page extends BasePage {
    protected WebDriver driver;

    public UserD8Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='User-Mgt']")
    public WebElement user_mgt;

    @FindBy(xpath = "//*[text()='Access DB']")
    public WebElement DB_btn;

    @FindBy(xpath = "//*[@id='list-table']/thead/tr/th")
    public List<WebElement> tablelist;

}
