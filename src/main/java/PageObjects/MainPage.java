package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {

    private WebDriver driver;
    private WebDriverWait wait;

    //ЛОКАТОРЫ:

    //Сайт
    private static final String WEBSITE = "https://qa-scooter.praktikum-services.ru/";

    //Кнопка верхняя "Заказать"
    private By orderTopButton = By.className("Button_Button__ra12g");

    //Кнопка нижняя "Заказать"
    private By orderBottomButton = By.cssSelector(".Button_Button__ra12g.Button_Middle__1CSJM");


    //КОНСТРУКТОР
    public MainPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    //МЕТОДЫ:

    //Верхняя кнопка Заказать: ожидание, появление, прокрутка, нажатие
    public void orderTopButtonClick() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(orderTopButton));
        WebElement button = driver.findElement(orderTopButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", button);
        driver.findElement(orderTopButton).click();
    }

    //Нажатие нижней кнопки "Заказать"
    public void orderBottomButtonClick() {
        driver.findElement(orderBottomButton).click();
    }

    public String getWEBSITE() {
        return WEBSITE;
    }
}
