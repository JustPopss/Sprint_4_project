package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class FAQelements {

    private WebDriver driver;

    //ЛОКАТОРЫ FAQ с текстом:

    //Блок FAQ
    private final By faqBlock = By.className("Home_FourPart__1uthg");

    //КОНСТРУКТОР
    public FAQelements(WebDriver driver) {
        this.driver = driver;
    }

    //МЕТОДЫ:

    //Геттер для FAQ блока
    public By getFaqBlock () {
        return faqBlock;
    }

    public void clickQuestionByIndex(int index) {
        By questionLocator = By.id("accordion__heading-" + index);
        driver.findElement(questionLocator).click();
    }

    public String getAnswerTextByIndex(int index) {
        By answerLocator = By.id("accordion__panel-" + index);
        return driver.findElement(answerLocator).getText();
    }
}

