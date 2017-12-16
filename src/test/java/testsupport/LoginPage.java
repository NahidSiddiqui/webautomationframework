package testsupport;

import PageObjectRepo.PageObjects;
import core.Methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by amayah on 16/12/2017.
 */
public class LoginPage extends Methods {

    private PageObjects pgobj;
    public WebDriver driver;

    public LoginPage(WebDriver driver2){
        super(driver2);
        this.driver = driver2;
       pgobj = new PageObjects();
       PageFactory.initElements(driver, pgobj);

    }

    public void clickOnLogin(){
        waitForElement(pgobj.loginButton);
        pgobj.loginButton.click();
    }

    public boolean isLoginPageDisplayed(){
        waitForElement(pgobj.barclaysLogoLoginPage);
        waitForElement(pgobj.registerNow);
        return pgobj.surnameField.isDisplayed();
    }
}
