import Pageobjects.MainPage;
import Pageobjects.OrderPage;
import Pageobjects.SecondOrderPage;
import Pageobjects.Utility;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)

    public class OrderTests {

        private final String name;
        private final String lastName;
        private final String address;
        private final String phoneNumber;
        private final String comment;
        private final boolean useTopButton;

    private WebDriver driver;
    private MainPage mainPage;
    private OrderPage orderPage;
    private WebDriverWait wait;
    private SecondOrderPage secondOrderPage;
    private Utility utility;

        public OrderTests(String name,
                          String lastName,
                          String address,
                          String phoneNumber,
                          String comment,
                          boolean useTopButton) {
            this.name = name;
            this.lastName = lastName;
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.comment = comment;
            this.useTopButton = useTopButton;
        }

@Parameterized.Parameters(name = "Пользователь: {0} {1}")
        public static Object[][] getValues() {
            return new Object[][] {
                    {"Борис", "Джонсон", "г.Лондон, ул. Ленина, д.1",
                            "+71234567890", "Тут комментарий 1", true},
                    {"Александр", "Пушкин", "Нью-Йорк, мост 2",
                            "+70987654321", "Тут комментарий 2", false},
            }; }


    @Before
    public void setUp () {
            driver = new ChromeDriver();
            utility = new Utility();
            mainPage = new MainPage(driver);
            orderPage = new OrderPage(driver);
            secondOrderPage = new SecondOrderPage(driver);
            utility.tearUp(driver);
    }

    @Test
    public void orderTest () {

        //Первый массив - верхняя кнопка, второй - нижняя
            if (useTopButton)
                mainPage.orderTopButtonClick();
            else mainPage.orderBottomButtonClick();

        // Заполнение полей Имя, Фамилия, адрес, телефон
        orderPage.fillAllFields (this.name,
                                this.lastName,
                                this.address,
                                this.phoneNumber);

        //Выбор станции (Митино)
        orderPage.metroStationFill();

        //Переход на след форму
        orderPage.nextButtonClick();

        //Выбираем дату
        secondOrderPage.dateFieldFill();

        //Раскрываем список и выбираем срок
        secondOrderPage.timeFieldFill();

        //Выбираем цвет (черный)
        secondOrderPage.colourFieldClick();

        //Пишем комментарий
        secondOrderPage.commentFieldFill(this.comment);

        //Нажать кнопку Заказать
        secondOrderPage.orderButtonClick();

        //Ожидание загрузки всплывающего окна
        secondOrderPage.asseptButtonCheck();

        //Нажать кнопку Да
        secondOrderPage.asseptButtonClick();

        //Проверка окна Заказ сделан
        secondOrderPage.checkOrderSuccessModal();
        assertTrue("Окно подтверждения заказа не отобразилось!", secondOrderPage.modal.isDisplayed());
        String modalText = secondOrderPage.modal.getText();
        assertTrue("Текст окна не содержит 'Заказ оформлен'!", modalText.contains("Заказ оформлен"));
        System.out.println("✅ Заказ успешно оформлен! Текст: " + modalText);
    }

    @After
    public void tearDown () {
        utility.tearDown(driver);
    }
}
