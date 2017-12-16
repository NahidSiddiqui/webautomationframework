package testsupport;

import PageObjectRepo.PageObjects;
import core.Methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by amayah on 16/12/2017.
 */
public class RegistrationPage extends Methods {

    private PageObjects pgobj;
    public WebDriver driver;

    public RegistrationPage(WebDriver driver2){
        super(driver2);
        this.driver = driver2;
        pgobj = new PageObjects();
        PageFactory.initElements(driver, pgobj);

    }

}
