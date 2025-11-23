package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    private WebDriver driver;

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
    }

    //МЕТОДЫ:

    //Нажатие верхней кнопки "Заказать"
    public void orderTopButton_Click() {
        driver.findElement(orderTopButton).click();
    }

    //Нажатие нижней кнопки "Заказать"
    public void orderBottomButton_click() {
        driver.findElement(orderBottomButton).click();
    }

    public String getWEBSITE() {
        return WEBSITE;
    }
}
