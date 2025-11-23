import PageObjects.MainPage;
import PageObjects.OrderPage;
import PageObjects.SecondOrderPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@RunWith(Parameterized.class)

    public class OrderTestValues {

        private final String name;
        private final String lastName;
        private final String address;
        private final String phoneNumber;
        private final String comment;

    private WebDriver driver;
    private MainPage mainPage;
    private OrderPage orderPage;
    private WebDriverWait wait;
    private SecondOrderPage secondOrderPage;

        public OrderTestValues(String name,
                               String lastName,
                               String address,
                               String phoneNumber,
                               String comment) {
            this.name = name;
            this.lastName = lastName;
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.comment = comment;
        }

@Parameterized.Parameters
        public static Object[][] getValues() {
            return new Object[][] {
                    {"Борис", "Джонсон", "г.Лондон, ул. Ленина, д.1",
                            "+71234567890", "Тут комментарий 1"},
                    {"Александр", "Пушкин", "Нью-Йорк, мост 2",
                            "+70987654321", "Тут комментарий 2"},
            }; }


    @Before
    public void tearUp () {
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        mainPage = new MainPage(driver);
        orderPage = new OrderPage(driver);
        secondOrderPage = new SecondOrderPage(driver);
        driver.get(mainPage.getWEBSITE());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void orderTest () {

    //Нажать на верхнюю кнопку Заказать
    mainPage.orderTopButton_Click();
    // Ожидание появление элемента
    orderPage.nameFieldCheckVisibility();

    // Заполнение полей
        orderPage.nameField_click();
        driver.findElement(orderPage.getNameField()).sendKeys(this.name);

        orderPage.lastNameField_click();
        driver.findElement(orderPage.getLastNameField()).sendKeys(this.lastName);

        orderPage.addressField_click();
        driver.findElement(orderPage.getAddressField()).sendKeys(this.address);

        orderPage.phoneField_click();
        driver.findElement(orderPage.getPhoneField()).sendKeys(this.phoneNumber);

        orderPage.metroStation_click();
        orderPage.mitinoStation_click();
        //Переход на след форму
        orderPage.nextButton1_click();

        //Выбираем дату
        secondOrderPage.dateField_click();
        secondOrderPage.chooseDateTable_click();

        //Раскрываем список
        secondOrderPage.timeField_click();

        //Выбираем срок
        secondOrderPage.dropList_click();

        //Выбираем цвет (черный)
        secondOrderPage.colourField_click();

        //Пишем комментарий
        secondOrderPage.commentField_click();
        driver.findElement(secondOrderPage.getCommentField()).sendKeys(this.comment);

        //Нажать кнопку Заказать
        secondOrderPage.orderButton_click();

        //Ожидание загрузки всплывающего окна
        secondOrderPage.asseptButtonCheck();

        //Нажать кнопку Да
        secondOrderPage.asseptButton_click();
    }

    @After
    public void tearDown() {
            driver.quit();
    }
}
