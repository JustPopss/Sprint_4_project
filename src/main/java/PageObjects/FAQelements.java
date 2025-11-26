package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class FAQelements {

    private WebDriver driver;

    //ЛОКАТОРЫ FAQ с текстом:

    //Блок FAQ
    private final By faqBlock = By.className("Home_FourPart__1uthg");

    // 1: Вопрос про цену
    private final By costQuestion = By.id("accordion__heading-0");
    private final String costAnswerExpected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    private By costAnswerActual = By.id("accordion__panel-0");

    // 2: Вопрос про несколько самокатов
    private final By multipleScootersQuestion = By.id("accordion__heading-1");
    private final String multipleScootersAnswerExpected = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    private final By multipleScootersAnswerActual = By.id("accordion__panel-1");

    // 3: Вопрос про время аренды
    private final By rentalTimeQuestion = By.id("accordion__heading-2");
    private final String rentalTimeAnswerExpected = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    private final By rentalTimeAnswerActual = By.id("accordion__panel-2");

    // 4: Вопрос про заказ на сегодня
    private final By todayOrderQuestion = By.id("accordion__heading-3");
    private final String todayOrderAnswerExpected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    private final By todayOrderAnswerActual = By.id("accordion__panel-3");

    // 5: Вопрос про продлевание заказа
    private final By extendRentalQuestion = By.id("accordion__heading-4");
    private final String extendRentalAnswerExpected = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    private final By extendRentalAnswerActual = By.id("accordion__panel-4");

    // 6: Вопрос про зарядку
    private final By chargingQuestion = By.id("accordion__heading-5");
    private final String chargingAnswerExpected = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    private final By chargingAnswerActual = By.id("accordion__panel-5");

    // 7: Вопрос про отмену заказа
    private final By cancelOrderQuestion = By.id("accordion__heading-6");
    private final String cancelOrderAnswerExpected = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    private final By cancelOrderAnswerActual = By.id("accordion__panel-6");

    // 8: Вопрос про доставку в область
    private final By deliveryAreaQuestion = By.id("accordion__heading-7");
    private final String deliveryAreaAnswerExpected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
    private final By deliveryAreaAnswerActual = By.id("accordion__panel-7");

    //КОНСТРУКТОР
    public FAQelements(WebDriver driver) {
        this.driver = driver;
    }

    //МЕТОДЫ:

    //Нажатие элементов FAQ

    public void costQuestionClick() {
        driver.findElement(costQuestion).click();
    }

    public void multipleScootersQuestionClick() {
        driver.findElement(multipleScootersQuestion).click();
    }

    public void rentalTimeQuestionClick() {
        driver.findElement(rentalTimeQuestion).click();
    }

    public void todayOrderQuestionClick() {
        driver.findElement(todayOrderQuestion).click();
    }

    public void extendRentalQuestionClick() {
        driver.findElement(extendRentalQuestion).click();
    }

    public void chargingQuestionClick() {
        driver.findElement(chargingQuestion).click();
    }

    public void cancelOrderQuestionClick() {
        driver.findElement(cancelOrderQuestion).click();
    }

    public void deliveryAreaQuestionClick() {
        driver.findElement(deliveryAreaQuestion).click();
    }

    //Геттеры для получения текста Expected

    public String getCostAnswerExpected() {
        return costAnswerExpected;
    }

    public String getMultipleScootersAnswerExpected() {
        return multipleScootersAnswerExpected;
    }

    public String getRentalTimeAnswerExpected() {
        return rentalTimeAnswerExpected;
    }

    public String getTodayOrderAnswerExpected() {
        return todayOrderAnswerExpected;
    }

    public String getExtendRentalAnswerExpected() {
        return extendRentalAnswerExpected;
    }

    public String getChargingAnswerExpected() {
        return chargingAnswerExpected;
    }

    public String getCancelOrderAnswerExpected() {
        return cancelOrderAnswerExpected;
    }

    public String getDeliveryAreaAnswerExpected() {
        return deliveryAreaAnswerExpected;
    }

    //Геттеры для получения текста Actual

    public String getCostAnswerActual() {
        return driver.findElement(costAnswerActual).getText();
    }

    public String getMultipleScootersAnswerActual() {
        return driver.findElement(multipleScootersAnswerActual).getText();
    }

    public String getRentalTimeAnswerActual() {
        return driver.findElement(rentalTimeAnswerActual).getText();
    }

    public String getTodayOrderAnswerActual() {
        return driver.findElement(todayOrderAnswerActual).getText();
    }

    public String getExtendRentalAnswerActual() {
        return driver.findElement(extendRentalAnswerActual).getText();
    }

    public String getChargingAnswerActual() {
        return driver.findElement(chargingAnswerActual).getText();
    }

    public String getCancelOrderAnswerActual() {
        return driver.findElement(cancelOrderAnswerActual).getText();
    }

    public String getDeliveryAreaAnswerActual() {
        return driver.findElement(deliveryAreaAnswerActual).getText();
    }

    //Геттер для FAQ блока
    public By getFaqBlock () {
        return faqBlock;
    }
}

