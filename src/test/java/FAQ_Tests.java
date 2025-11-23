import PageObjects.FAQ_elements;
import PageObjects.MainPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import static org.junit.Assert.assertEquals;


public class FAQ_Tests {

    private WebDriver driver;
    private MainPage mainPage;
    private FAQ_elements faq_elements;

    @Before
    public void tearUp () {
        driver = new ChromeDriver();
        mainPage = new MainPage(driver);
        faq_elements = new FAQ_elements(driver);
        driver.get(mainPage.getWEBSITE());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement element = driver.findElement(faq_elements.getFaqBlock());
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    @Test
    public void faqTextEqualsFirst() {

        // FAQ 1
        faq_elements.faqElementFirst_Click();
        assertEquals("Текст FAQ 1 не совпадает!",
                faq_elements.getFaqElementFirstTextExpected(),
                faq_elements.getFaqElementFirstTextActual());
    }
    @Test
    public void faqTextEqualsSecond () {

        // FAQ 2
        faq_elements.faqElementSecond_Click();
        assertEquals("Текст FAQ 2 не совпадает!",
                faq_elements.getFaqElementSecondTextExpected(),
                faq_elements.getFaqElementSecondTextActual());
    }

    @Test
    public void faqTextEqualsThird () {

        // FAQ 3
        faq_elements.faqElementThird_Click();
        assertEquals("Текст FAQ 3 не совпадает!",
                faq_elements.getFaqElementThirdTextExpected(),
                faq_elements.getFaqElementThirdTextActual());
    }

    @Test
    public void faqTextEqualsFourth () {

        // FAQ 4
        faq_elements.faqElementFourth_Click();
        assertEquals("Текст FAQ 4 не совпадает!",
                faq_elements.getFaqElementFourthTextExpected(),
                faq_elements.getFaqElementFourthTextActual());
    }

    @Test
    public void faqTextEqualsFifth () {

        // FAQ 5
        faq_elements.faqElementFifth_Click();
        assertEquals("Текст FAQ 5 не совпадает!",
                faq_elements.getFaqElementFifthTextExpected(),
                faq_elements.getFaqElementFifthTextActual());
    }

    @Test
    public void faqTextEqualsSixth () {

        // FAQ 6
        faq_elements.faqElementSixth_Click();
        assertEquals("Текст FAQ 6 не совпадает!",
                faq_elements.getFaqElementSixthTextExpected(),
                faq_elements.getFaqElementSixthTextActual());
        }

    @Test
    public void faqTextEqualsSeventh () {

        // FAQ 7
        faq_elements.faqElementSeventh_Click();
        assertEquals("Текст FAQ 7 не совпадает!",
                faq_elements.getFaqElementSeventhTextExpected(),
                faq_elements.getFaqElementSeventhTextActual());
    }

    @Test
    public void faqTextEqualsEighth () {
        // FAQ 8
        faq_elements.faqElementEighth_Click();
        assertEquals("Текст FAQ 8 не совпадает!",
                faq_elements.getFaqElementEighthTextExpected(),
                faq_elements.getFaqElementEighthTextActual());
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
