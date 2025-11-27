package Pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Utility {

    public void tearUp (WebDriver driver) {

        MainPage mainPage = new MainPage(driver);
        FAQelements faqElements = new FAQelements(driver);
        driver.get(mainPage.getWEBSITE());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement element = driver.findElement(faqElements.getFaqBlock());
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void tearDown (WebDriver driver) {
        if (driver != null) {
            driver.quit();
        }
    }
}
