import Pages.MainPage;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

public class QuestionAnswerTest {

    private WebDriver driver = new ChromeDriver();

    @Test
    public void answerPaymentTest() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        Dimension dimension = new Dimension(1920, 1080);
        driver.manage().window().setSize(dimension);

        MainPage objPaymentPage = new MainPage(driver);

        objPaymentPage.questionPaymentClick();
        objPaymentPage.waitForLoadTextAnswerPayment();
        String actualAnswerPayment = objPaymentPage.getTextAnswerPayment();
        String expectedAnswerPayment = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        assertEquals("Должен отображаться текст: Сутки — 400 рублей. Оплата курьеру — наличными или картой.",
                expectedAnswerPayment, actualAnswerPayment);
    }

    @Test
    public void answerSeveralScootersTest() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        Dimension dimension = new Dimension(1920, 1080);
        driver.manage().window().setSize(dimension);

        MainPage objSeveralScootersPage = new MainPage(driver);

        objSeveralScootersPage.questionSeveralScootersClick();
        objSeveralScootersPage.waitForLoadTextAnswerSeveralScooters();
        String actualAnswerSeveralScooters = objSeveralScootersPage.getTextAnswerSeveralScooters();
        String expectedAnswerSeveralScooters = "Пока что у нас так: один заказ — один самокат. Если хотите покататься" +
                " с друзьями, можете просто сделать несколько заказов — один за другим.";
        assertEquals("Должен отображаться текст: Пока что у нас так: один заказ — один самокат. Если хотите " +
                "покататься с друзьями, можете просто сделать несколько заказов — один за другим.",
                expectedAnswerSeveralScooters, actualAnswerSeveralScooters);
    }

    @Test
    public void answerRentalTimeTest() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        Dimension dimension = new Dimension(1920, 1080);
        driver.manage().window().setSize(dimension);

        MainPage objRentalTimePage = new MainPage(driver);

        objRentalTimePage.questionRentalTimeClick();
        objRentalTimePage.waitForLoadTextAnswerRentalTime();
        String actualAnswerRentalTime = objRentalTimePage.getTextAnswerRentalTime();
        String expectedAnswerRentalTime = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение" +
                " дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли" +
                " самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        assertEquals("Должен отображаться текст: Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая" +
                " в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы" +
                " привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.",
                expectedAnswerRentalTime, actualAnswerRentalTime);
    }

    @Test
    public void answerScooterTodayTest() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        Dimension dimension = new Dimension(1920, 1080);
        driver.manage().window().setSize(dimension);

        MainPage objScooterToday = new MainPage(driver);

        objScooterToday.questionScooterTodayClick();
        objScooterToday.waitForLoadTextAnswerScooterToday();
        String actualAnswerScooterToday = objScooterToday.getTextAnswerScooterToday();
        String expectedAnswerScooterToday = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        assertEquals("Должен отображаться текст: Только начиная с завтрашнего дня. Но скоро станем расторопнее.",
                expectedAnswerScooterToday, actualAnswerScooterToday);
    }

    @Test
    public void answerChangeRentalTimeTest() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        Dimension dimension = new Dimension(1920, 1080);
        driver.manage().window().setSize(dimension);

        MainPage objChangeRentalTime = new MainPage(driver);

        objChangeRentalTime.questionChangeRentalTimeClick();
        objChangeRentalTime.waitForLoadTextAnswerChangeRentalTime();
        String actualAnswerChangeRentalTime = objChangeRentalTime.getTextAnswerChangeRentalTime();
        String expectedAnswerChangeRentalTime = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку" +
                " по красивому номеру 1010.";
        assertEquals("Должен отображаться текст: Пока что нет! Но если что-то срочное — всегда можно" +
                        " позвонить в поддержку по красивому номеру 1010.",
                expectedAnswerChangeRentalTime, actualAnswerChangeRentalTime);
    }

    @Test
    public void answerChargerTest() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        Dimension dimension = new Dimension(1920, 1080);
        driver.manage().window().setSize(dimension);

        MainPage objCharger = new MainPage(driver);

        objCharger.questionChargerClick();
        objCharger.waitForLoadTextAnswerCharger();
        String actualAnswerCharger = objCharger.getTextAnswerCharger();
        String expectedAnswerCharger = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток " +
                "— даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        assertEquals("Должен отображаться текст: Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь" +
                        " суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.",
                expectedAnswerCharger, actualAnswerCharger);
    }

    @Test
    public void answerCancelOrderTest() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        Dimension dimension = new Dimension(1920, 1080);
        driver.manage().window().setSize(dimension);

        MainPage objCancelOrder = new MainPage(driver);

        objCancelOrder.questionCancelOrderClick();
        objCancelOrder.waitForLoadTextAnswerCancelOrder();
        String actualAnswerCancelOrder = objCancelOrder.getTextAnswerCancelOrder();
        String expectedAnswerCancelOrder = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки" +
                " тоже не попросим. Все же свои.";
        assertEquals("Должен отображаться текст: Да, пока самокат не привезли. Штрафа не будет, объяснительной" +
                        " записки тоже не попросим. Все же свои.",
                expectedAnswerCancelOrder, actualAnswerCancelOrder);
    }

    @Test
    public void answerPlaceDeliveryTest() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        Dimension dimension = new Dimension(1920, 1080);
        driver.manage().window().setSize(dimension);

        MainPage objPlaceDelivery = new MainPage(driver);

        objPlaceDelivery.questionPlaceDeliveryClick();
        objPlaceDelivery.waitForLoadTextAnswerPlaceDelivery();
        String actualAnswerPlaceDelivery = objPlaceDelivery.getTextAnswerPlaceDelivery();
        String expectedAnswerPlaceDelivery = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        assertEquals("Должен отображаться текст: Да, обязательно. Всем самокатов! И Москве, и Московской области.",
                expectedAnswerPlaceDelivery, actualAnswerPlaceDelivery);
    }

    @After
    public void teardown () {
        driver.quit();
    }


}
