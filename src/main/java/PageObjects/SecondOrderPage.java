package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SecondOrderPage {

    private WebDriver driver;
    private WebDriverWait wait;
    private OrderPage orderPage;

    //Локаторы второй страницы заказа

    //Поле Когда привезти самокат
    private final By dateField = By.xpath(".//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN' and @placeholder='* Когда привезти самокат']");
    //Поле выбора даты
    private final By chooseDateTable = By.xpath(".//div[contains(@class, 'react-datepicker__month')]//div[text()='29' and contains(@aria-label, 'ноября')]");
    //Поле Срок аренды
    private final By timeField = By.className("Dropdown-placeholder");
    //Выпадающий список
    private final By dropList = By.xpath(".//*[@class='Dropdown-option' and text()='двое суток']");
    //Чек-бокс выбора цвета (черный)
    private final By colourField = By.id("black");
    //Поле для комментария
    private final By commentField = By.xpath(".//input [@class='Input_Input__1iN_Z Input_Responsible__1jDKN' and @placeholder='Комментарий для курьера']");
    //Кнопка Заказать
    private final By orderButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    //Кнопка Да
    private final By asseptButton = By.xpath(".//button[text()='Да']");
    //Окно Заказ сделан
    private final By finalWindow = By.xpath("//div[contains(@class, 'Order_ModalHeader') and contains(text(), 'Заказ оформлен')]");
    public SecondOrderPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    //Методы (клики, выбор, ожидания):

    //Нажатие на поле Когда привезти самокат
    public void dateFieldFill() {
        wait.until(ExpectedConditions.elementToBeClickable(dateField));
        driver.findElement(dateField).click();
        wait.until(ExpectedConditions.elementToBeClickable(chooseDateTable));
        driver.findElement(chooseDateTable).click();
    }

    //Нажатие на выбор срока аренды
    public void timeFieldFill() {
        driver.findElement(timeField).click();
        wait.until(ExpectedConditions.elementToBeClickable(dropList));
        driver.findElement(dropList).click();
    }

    //Выбор чек-бокса
    public void colourFieldClick() {
        driver.findElement(colourField).click();
    }

    //Нажатие на поле для комментариев
    public void commentFieldFill(String comment) {
        driver.findElement(commentField).click();
        driver.findElement(getCommentField()).sendKeys(comment);
    }

    //Нажатие кнопки Заказать
    public void orderButtonClick() {
        driver.findElement(orderButton).click();
    }

    //Нажатие кнопки ДА
    public void asseptButtonClick() {
        driver.findElement(asseptButton).click();
    }

    public void checkOrderSuccessModal() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(finalWindow));
    }

    //Ожидание загрузки всплывающего окна
    public void asseptButtonCheck() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(asseptButton));
    }

    //Геттеры

    public By getCommentField() {
        return commentField;
    }

    public By getFinalWindow() {
        return finalWindow;
    }
}
