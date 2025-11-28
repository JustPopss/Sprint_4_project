import Pageobjects.FAQelements;
import Pageobjects.Utility;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FAQTests {

    private WebDriver driver;
    private Utility utility;
    private final int questionIndex;
    private final String questionText;
    private final String expectedText;
    private FAQelements faqElements;

    public FAQTests(int questionIndex, String questionText, String expectedText) {
        this.questionIndex = questionIndex;
        this.questionText = questionText;
        this.expectedText = expectedText;
    }

    @Parameterized.Parameters(name = "{1}")
    public static Object[][] getFAQData() {
        return new Object[][] {
                {0, "Стоимость аренды", "Сутки — 400 рублей. Оплата курьеру — наличными или картой."},
                {1, "Несколько самокатов", "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."},
                {2, "Время аренды", "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."},
                {3, "Заказ на сегодня", "Только начиная с завтрашнего дня. Но скоро станем расторопнее."},
                {4, "Продление заказа", "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."},
                {5, "Зарядка самоката", "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."},
                {6, "Отмена заказа", "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."},
                {7, "Доставка в область", "Да, обязательно. Всем самокатов! И Москве, и Московской области."}
        };
    }


    @Before
    public void setUp() {
        driver = new ChromeDriver();
        utility = new Utility();
        utility.tearUp(driver);
        faqElements = new FAQelements(driver);
    }

    @Test
    public void faqTextTest() {
        faqElements.clickQuestionByIndex(questionIndex);
        String actualText = faqElements.getAnswerTextByIndex(questionIndex);
        assertEquals("Текст FAQ '" + questionText + "' не совпадает!", expectedText, actualText);
    }

    @After
            public void tearDown () {
        utility.tearDown(driver);
    }
}
