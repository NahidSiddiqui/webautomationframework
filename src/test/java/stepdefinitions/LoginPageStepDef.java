package stepdefinitions;
import com.sun.org.apache.xerces.internal.dom.DeferredEntityReferenceImpl;
import core.SetDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.springframework.util.Assert;
import testsupport.HomePage;
import testsupport.LoginPage;

/**
 * Created by amayah on 16/12/2017.
 */
public class LoginPageStepDef extends SetDriver{

    public HomePage homePage;
    public LoginPage loginPage;
    public WebDriver DRIVER;

    @Before
    public void setUp(){
        DRIVER = beforeHook();
        homePage = new HomePage(DRIVER);
        loginPage = new LoginPage(DRIVER);
    }

    @Given("^I am on the home page$")
    public void I_am_on_the_home_page(){
        homePage.verifyHomePageisLoaded();
    }

    @When("^I click on the login button$")
    public void I_click_on_the_login_button(){
        loginPage.clickOnLogin();
    }

    @Then("the login page is displayed")
    public void the_new_user_registration_page_is_displayed(){
        Assert.isTrue(loginPage.isLoginPageDisplayed(), "Login page is displayed?");
    }
}
