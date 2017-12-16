package testsupport;

import PageObjectRepo.PageObjects;
import core.Methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by amayah on 16/12/2017.
 */
public class HomePage extends Methods {

    private PageObjects pgobj;
    public WebDriver driver;

    public HomePage(WebDriver driver2){
        super(driver2);
        this.driver = driver2;
        pgobj = new PageObjects();
        PageFactory.initElements(driver, pgobj);

    }

    public void verifyHomePageisLoaded(){
        driver.get("https://www.barclays.co.uk/");
        waitForUrl("https://www.barclays.co.uk/");
        waitForElement(pgobj.barclaysLogo);
        waitFor(10000);
    }
}
