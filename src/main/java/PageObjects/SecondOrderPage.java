package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SecondOrderPage {

    private WebDriver driver;
    private WebDriverWait wait;

    //Локаторы второй страницы заказа

    //Поле Когда привезти самокат
    private final By dateField = By.xpath(".//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN' and @placeholder='* Когда привезти самокат']");
    //Поле выбора даты
    private final By chooseDateTable = By.xpath(".//div[contains(@class, 'react-datepicker__month')]//div[text()='27' and contains(@aria-label, 'ноября')]");
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
    //private final By asseptButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Да']");
    private final By asseptButton = By.xpath(".//button[text()='Да']");


    public SecondOrderPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    //Методы (клики, выбор):

    //Нажатие на поле Когда привезти самокат
    public void dateField_click() {
        driver.findElement(dateField).click();
    }

    //Нажатие на Выбор даты
    public void chooseDateTable_click() {
        driver.findElement(chooseDateTable).click();
    }

    //Нажатие на выбор срока аренды
    public void timeField_click() {
        driver.findElement(timeField).click();
    }

    //Выбор срока аренды
    public void dropList_click() {
        driver.findElement(dropList).click();
    }

    //Выбор чек-бокса
    public void colourField_click() {
        driver.findElement(colourField).click();
    }

    //Нажатие на поле для комментариев
    public void commentField_click() {
        driver.findElement(commentField).click();
    }

    //Нажатие кнопки Заказать
    public void orderButton_click() {
        driver.findElement(orderButton).click();
    }

    //Нажитие кнопки ДА
    public void asseptButton_click() {
        driver.findElement(asseptButton).click();
    }

    //Геттеры

    public By getCommentField() {
        return commentField;
    }

    //Ожидание загрузки всплывающего окна
    public void asseptButtonCheck() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(asseptButton));
    }
}
