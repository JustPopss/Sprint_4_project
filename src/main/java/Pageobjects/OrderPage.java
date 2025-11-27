package Pageobjects;

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
    private final By nameField = By.xpath(".//*[@class='Input_Input__1iN_Z Input_Responsible__1jDKN' and @placeholder='* Имя']");

    //Поле фамилия
    private final By lastNameField = By.xpath(".//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN' and @placeholder='* Фамилия']");

    //Поле адрес
    private final By addressField = By.xpath(".//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN' and @placeholder='* Адрес: куда привезти заказ']");

    //Поле станция
    private final By metroStation = By.className("select-search__input");

    //Выбор станции Митино
    private final By mitinoStation = By.xpath(".//button[@value='46']");

    //Поле телефон
    private final By phoneField = By.xpath(".//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN' and @placeholder='* Телефон: на него позвонит курьер']");

    //Кнопка Далее
    private final By nextButton = By.cssSelector(".Button_Button__ra12g.Button_Middle__1CSJM");

    //КОНСТРУКТОР
    public OrderPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    //МЕТОДЫ:

    //Нажатие на кнопку Далее
    public void nextButtonClick() {
        driver.findElement(nextButton).click();
    }

    // Заполнение поля Имя
        public void nameFieldFill(String name) {
            wait.until(ExpectedConditions.elementToBeClickable(nameField));
            WebElement field = driver.findElement(nameField);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", field);
            driver.findElement(nameField).click();
            driver.findElement(getNameField()).sendKeys(name);
        }

    // Заполнение поля Фамилия
    public void lastNameFieldFill(String lastName) {
        driver.findElement(lastNameField).click();
        driver.findElement(getLastNameField()).sendKeys(lastName);
    }

    // Заполнение поля адрес
    public void addressFieldFill(String address) {
        driver.findElement(addressField).click();
        driver.findElement(getAddressField()).sendKeys(address);
    }

    //Выбор станции (Митино)
    public void metroStationFill() {
        driver.findElement(metroStation).click();
        wait.until(ExpectedConditions.elementToBeClickable(mitinoStation));
        WebElement element = driver.findElement(mitinoStation);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }

    //Заполнение поля телефон
    public void phoneFieldFill(String phoneNumber) {
        driver.findElement(phoneField).click();
        driver.findElement(getPhoneField()).sendKeys(phoneNumber);
    }

    // Заполнение полей Имя, Фамилия, адрес, телефон
    public void fillAllFields (String name,
                               String lastName,
                               String address,
                               String phoneNumber) {

        nameFieldFill (name);
        lastNameFieldFill(lastName);
        addressFieldFill(address);
        phoneFieldFill(phoneNumber);
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
