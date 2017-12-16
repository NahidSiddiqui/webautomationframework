package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by amayah on 16/12/2017.
 */
public class Methods {

    public WebDriver driver;

    public Methods(WebDriver driver2){
        this.driver = driver2;
    }

    //Method to wait
    public void waitFor(int milliseconds){
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //Method to wait for a url to be displayed
    public void waitForUrl(final String Url){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        ExpectedCondition<Boolean> e = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return (d.getCurrentUrl().contains(Url));
            }
        };
        wait.until(e);
    }

    //Method to wait for an element
    public void waitForElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
