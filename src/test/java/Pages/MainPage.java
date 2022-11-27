package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MainPage {
    private WebDriver driver;

    // Вопросы в разделе "О важном"

    // 1 Вопрос "Сколько это стоит? И как оплатить?"
    private By questionPayment = By.id("accordion__heading-0");
    // 2 Вопрос "Хочу сразу несколько самокатов! Так можно?"
    private By questionSeveralScooters = By.id("accordion__heading-1");
    // 3 Вопрос "Как рассчитывается время аренды?"
    private By questionRentalTime = By.id("accordion__heading-2");
    // 4 Вопрос "Можно ли заказать самокат прямо на сегодня?"
    private By questionScooterToday = By.id("accordion__heading-3");
    // 5 Вопрос "Можно ли продлить заказ или вернуть самокат раньше?"
    private By questionChangeRentalTime = By.id("accordion__heading-4");
    // 6 Вопрос "Вы привозите зарядку вместе с самокатом?"
    private By questionCharger = By.id("accordion__heading-5");
    // 7 Вопрос "Можно ли отменить заказ?"
    private By questionCancelOrder = By.id("accordion__heading-6");
    // 8 Вопрос "Я жизу за МКАДом, привезёте?"
    private By questionPlaceDelivery = By.id("accordion__heading-7");

    // Ответы в разделе "О важном"

    // 1 Ответ "Сутки — 400 рублей. Оплата курьеру — наличными или картой."
    private By answerPayment = By.xpath(".//div[@class='Home_FAQ__3uVm4']/div/div[1]/div/p");
    // 2 Ответ "Пока что у нас так: один заказ — один самокат.."
    private By answerSeveralScooters = By.xpath(".//div[@class='Home_FAQ__3uVm4']/div/div[2]/div/p");
    // 3 Ответ "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени ..."
    private By answerRentalTime = By.xpath(".//div[@class='Home_FAQ__3uVm4']/div/div[3]/div/p");
    // 4 Ответ "Только начиная с завтрашнего дня. Но скоро станем расторопнее."
    private By answerScooterToday = By.xpath(".//div[@class='Home_FAQ__3uVm4']//div[4]/div/p");
    // 5 Ответ "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."
    private By answerChangeRentalTime = By.xpath(".//div[@class='Home_FAQ__3uVm4']//div[5]/div/p");
    // 6 Ответ "Самокат приезжает к вам с полной зарядкой.."
    private By answerCharger = By.xpath(".//div[@class='Home_FAQ__3uVm4']//div[6]/div/p");
    // 7 Ответ "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."
    private By answerCancelOrder = By.xpath(".//div[@class='Home_FAQ__3uVm4']//div[7]/div/p");
    // 8 Ответ "Да, обязательно. Всем самокатов! И Москве, и Московской области."
    private By answerPlaceDelivery = By.xpath(".//div[@class='Home_FAQ__3uVm4']//div[8]/div/p");

    // Кнопка "Заказать" (вверху страницы)
    private By orderButton = By.xpath(".//div[@class='Header_Header__214zg']//button[text()='Заказать']");

    // Кнопка "Заказать" (внизу страницы)
    private By orderButtonAtTheBottom = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button");

    public MainPage (WebDriver driver) {
        this.driver = driver;
    }


    // Метод для нажатия на стрелку вопроса 1
    public void questionPaymentClick () {
        WebElement element = driver.findElement(questionPayment);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }

    // Метод для нажатия на стрелку вопроса 2
    public void questionSeveralScootersClick () {
        WebElement element = driver.findElement(questionSeveralScooters);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }

    // Метод для нажатия на стрелку вопроса 3
    public void questionRentalTimeClick () {
        WebElement element = driver.findElement(questionRentalTime);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }

    // Метод для нажатия на стрелку вопроса 4
    public void questionScooterTodayClick () {
        WebElement element = driver.findElement(questionScooterToday);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }

    // Метод для нажатия на стрелку вопроса 5
    public void questionChangeRentalTimeClick () {
        WebElement element = driver.findElement(questionChangeRentalTime);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }

    // Метод для нажатия на стрелку вопроса 6
    public void questionChargerClick () {
        WebElement element = driver.findElement(questionCharger);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }

    // Метод для нажатия на стрелку вопроса 7
    public void questionCancelOrderClick () {
        WebElement element = driver.findElement(questionCancelOrder);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }

    // Метод для нажатия на стрелку вопроса 8
    public void questionPlaceDeliveryClick () {
        WebElement element = driver.findElement(questionPlaceDelivery);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }

    //Метод для получения текста ответа на вопрос 1
    public String getTextAnswerPayment () {
        return driver.findElement(answerPayment).getText();
    }

    //Метод для получения текста ответа на вопрос 2
    public String getTextAnswerSeveralScooters () {
        return driver.findElement(answerSeveralScooters).getText();
    }

    //Метод для получения текста ответа на вопрос 3
    public String getTextAnswerRentalTime () {
        return driver.findElement(answerRentalTime).getText();
    }

    // Метод для получения текста ответа на вопрос 4
    public String getTextAnswerScooterToday () {
        return driver.findElement(answerScooterToday).getText();
    }

    // Метод для получения текста ответа на вопрос 5
    public String getTextAnswerChangeRentalTime () {
        return driver.findElement(answerChangeRentalTime).getText();
    }

    // Метод для получения текста ответа на вопрос 6
    public String getTextAnswerCharger () {
        return driver.findElement(answerCharger).getText();
    }

    // Метод для получения текста ответа на вопрос 7
    public String getTextAnswerCancelOrder () {
        return driver.findElement(answerCancelOrder).getText();
    }

    // Метод для получения текста ответа на вопрос 8
    public String getTextAnswerPlaceDelivery () {
        return driver.findElement(answerPlaceDelivery).getText();
    }

    // Метод для нажатия на кнопку "Заказать" вверху страницы
    public void clickOrderButton () {

        driver.findElement(orderButton).click();
    }

    // Метод для нажатия на кнопку "Заказать" внизу страницы
    public void clickOrderButtonAtTheBottom () {
        WebElement element = driver.findElement(orderButtonAtTheBottom);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }

    // Методы для ожидания прогрузки элементов, в которых содержится текст ответов
    public void waitForLoadTextAnswerPayment() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(answerPayment));
    }
    public void waitForLoadTextAnswerSeveralScooters() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(answerSeveralScooters));
    }
    public void waitForLoadTextAnswerRentalTime() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(answerRentalTime));
    }

    public void waitForLoadTextAnswerScooterToday () {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(answerScooterToday));
    }

    public void waitForLoadTextAnswerChangeRentalTime () {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(answerChangeRentalTime));
    }

    public void waitForLoadTextAnswerCharger () {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(answerCharger));
    }

    public void waitForLoadTextAnswerCancelOrder () {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(answerCancelOrder));
    }

    public void waitForLoadTextAnswerPlaceDelivery () {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(answerPlaceDelivery));
    }

}
