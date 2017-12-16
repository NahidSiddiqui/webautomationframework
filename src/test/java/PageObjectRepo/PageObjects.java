package PageObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by amayah on 16/12/2017.
 */
public class PageObjects {

    @FindBy(className = "icon-barclays-eagle")
    public WebElement barclaysLogo;

    @FindBy(id="logo")
    public WebElement barclaysLogoLoginPage;

    @FindBy(xpath = ".//*/a[contains(text(),\"Log in\")]")
    public WebElement loginButton;

    @FindBy(xpath = ".//*/a[contains(text(),\"Register now\")]")
    public WebElement registerNow;

    @FindBy(id="surname0")
    public WebElement surnameField;


}
