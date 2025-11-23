package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderPage {

    private WebDriver driver;
    private WebDriverWait wait;

    //Локаторы страницы заказа

    //Поле имя
    private By nameField = By.xpath(".//*[@class='Input_Input__1iN_Z Input_Responsible__1jDKN' and @placeholder='* Имя']");

    //Поле фамилия
    private By lastNameField = By.xpath(".//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN' and @placeholder='* Фамилия']");

    //Поле адрес
    private By addressField = By.xpath(".//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN' and @placeholder='* Адрес: куда привезти заказ']");

    //Поле станция
    private By metroStation = By.className("select-search__input");

    //Выбор станции Митино
    private By mitinoStation = By.xpath(".//button[@value='46']");

    //Поле телефон
    private By phoneField = By.xpath(".//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN' and @placeholder='* Телефон: на него позвонит курьер']");

    //Кнопка Далее
    private By nextButton1 = By.cssSelector(".Button_Button__ra12g.Button_Middle__1CSJM");


    //КОНСТРУКТОР
    public OrderPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    //МЕТОДЫ:

    //Нажатие на поле имя
    public void nameField_click () {
        driver.findElement(nameField).click();
    }

    //Нажатие на поле фамилия
    public void lastNameField_click () {
        driver.findElement(lastNameField).click();
    }

    //Нажатие на поле адрес
    public void addressField_click () {
        driver.findElement(addressField).click();
    }

    //Выбор станции (Митино)
    public void mitinoStation_click() {
        WebElement element = driver.findElement(mitinoStation);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }

    //Нажатие на поле станция
    public void metroStation_click () {
        driver.findElement(metroStation).click();
    }

    //Нажатие на поле телефон
    public void phoneField_click () {
        driver.findElement(phoneField).click();
    }

    //Нажатие на кнопку Далее
    public void nextButton1_click () {
        driver.findElement(nextButton1).click();
    }

    //Ожидание загрузки элемента для новой страницы
    public void nameFieldCheckVisibility() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(nameField));
    }

    public By getNameField() {
        return nameField;
    }

    public By getLastNameField () {
        return lastNameField;
    }

    public By getAddressField() {
        return addressField;
    }

    public By getPhoneField () {
        return phoneField;
    }

}
