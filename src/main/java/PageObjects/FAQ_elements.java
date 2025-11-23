package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class FAQ_elements {

    private WebDriver driver;

    //ЛОКАТОРЫ FAQ с текстом:

    //Блок FAQ
    private By faqBlock = By.className("Home_FourPart__1uthg");

    // 1:
    private By faqElementFirst = By.id("accordion__heading-0");
    private String faqElementFirstTextExpected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    private By faqElementFirstTextActual = By.id("accordion__panel-0");

    // 2:
    private By faqElementSecond = By.id("accordion__heading-1");
    private String faqElementSecondTextExpected = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    private By faqElementSecondTextActual = By.id("accordion__panel-1");

    // 3:
    private By faqElementThird = By.id("accordion__heading-2");
    private String faqElementThirdTextExpected = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    private By faqElementThirdTextActual = By.id("accordion__panel-2");

    // 4:
    private By faqElementFourth = By.id("accordion__heading-3");
    private String faqElementFourthTextExpected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    private By faqElementFourthTextActual = By.id("accordion__panel-3");

    // 5:
    private By faqElementFifth = By.id("accordion__heading-4");
    private String faqElementFifthTextExpected = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    private By faqElementFifthTextActual = By.id("accordion__panel-4");

    // 6:
    private By faqElementSixth = By.id("accordion__heading-5");
    private String faqElementSixthTextExpected = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    private By faqElementSixthTextActual = By.id("accordion__panel-5");

    // 7:
    private By faqElementSeventh = By.id("accordion__heading-6");
    private String faqElementSeventhTextExpected = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    private By faqElementSeventhTextActual = By.id("accordion__panel-6");

    // 8:
    private By faqElementEighth = By.id("accordion__heading-7");
    private String faqElementEighthTextExpected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
    private By faqElementEighthTextActual = By.id("accordion__panel-7");

    //КОНСТРУКТОР
    public FAQ_elements(WebDriver driver) {
        this.driver = driver;
    }

    //МЕТОДЫ:

    //Нажатие элементов FAQ

    public void faqElementFirst_Click() {
        driver.findElement(faqElementFirst).click();
    }

    public void faqElementSecond_Click() {
        driver.findElement(faqElementSecond).click();
    }

    public void faqElementThird_Click() {
        driver.findElement(faqElementThird).click();
    }

    public void faqElementFourth_Click() {
        driver.findElement(faqElementFourth).click();
    }

    public void faqElementFifth_Click() {
        driver.findElement(faqElementFifth).click();
    }

    public void faqElementSixth_Click() {
        driver.findElement(faqElementSixth).click();
    }

    public void faqElementSeventh_Click() {
        driver.findElement(faqElementSeventh).click();
    }

    public void faqElementEighth_Click() {
        driver.findElement(faqElementEighth).click();
    }

    //Геттеры для получения текста Expected

    public String getFaqElementFirstTextExpected() {
        return faqElementFirstTextExpected;
    }

    public String getFaqElementSecondTextExpected() {
        return faqElementSecondTextExpected;
    }

    public String getFaqElementThirdTextExpected() {
        return faqElementThirdTextExpected;
    }

    public String getFaqElementFourthTextExpected() {
        return faqElementFourthTextExpected;
    }

    public String getFaqElementFifthTextExpected() {
        return faqElementFifthTextExpected;
    }

    public String getFaqElementSixthTextExpected() {
        return faqElementSixthTextExpected;
    }

    public String getFaqElementSeventhTextExpected() {
        return faqElementSeventhTextExpected;
    }

    public String getFaqElementEighthTextExpected() {
        return faqElementEighthTextExpected;
    }

    //Геттеры для получения текста Actual

    public String getFaqElementFirstTextActual() {
        return driver.findElement(faqElementFirstTextActual).getText();
    }

    public String getFaqElementSecondTextActual() {
        return driver.findElement(faqElementSecondTextActual).getText();
    }

    public String getFaqElementThirdTextActual() {
        return driver.findElement(faqElementThirdTextActual).getText();
    }

    public String getFaqElementFourthTextActual() {
        return driver.findElement(faqElementFourthTextActual).getText();
    }

    public String getFaqElementFifthTextActual() {
        return driver.findElement(faqElementFifthTextActual).getText();
    }

    public String getFaqElementSixthTextActual() {
        return driver.findElement(faqElementSixthTextActual).getText();
    }

    public String getFaqElementSeventhTextActual() {
        return driver.findElement(faqElementSeventhTextActual).getText();
    }

    public String getFaqElementEighthTextActual() {
        return driver.findElement(faqElementEighthTextActual).getText();
    }

    //Геттер для FAQ блока
    public By getFaqBlock () {
        return faqBlock;
    }
}

