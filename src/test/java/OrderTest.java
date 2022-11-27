import pages.MainPage;
import pages.OrderPage;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Parameterized.class)
public class OrderTest {
    private WebDriver driver = new ChromeDriver();

    private final String name;

    private final String surname;

    private final String address;

    private final String metroStation;

    private final String telephone;

    private final String dataBringScooter;

    private final String courierComment;

    private final String textConfirmOrder;

    public OrderTest (String name, String surname, String address, String metroStation, String telephone, String dataBringScooter, String courierComment, String textConfirmOrder) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.metroStation = metroStation;
        this.telephone = telephone;
        this.dataBringScooter = dataBringScooter;
        this.courierComment = courierComment;
        this.textConfirmOrder = textConfirmOrder;
    }

    @Parameterized.Parameters(name = "Тестовые данные: {0} {1} {2} {3} {4} {5} {6} {7}")
    public static Object[][] getInfo () {
        return new Object[][] {
                {"Дмитрий", "Кадысев", "Нагатинская 25", "Черкизовская", "89273121212", "27.11.2022", "Тест1", "Заказ оформлен"},
                {"Александр", "Панкратов", "Вавилова 14", "Сокольники", "89342314432", "26.11.2022", "Тест2", "Заказ оформлен"},
        };
    }

    @Test
    public void orderTest() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        Dimension dimension = new Dimension(1920, 1080);
        driver.manage().window().setSize(dimension);

        OrderPage objOrderPage = new OrderPage(driver);
        MainPage objMainPage = new MainPage(driver);

        objMainPage.clickOrderButton();
        objOrderPage.enterInfoForWhomScooter(name, surname, address, metroStation, telephone);
        objOrderPage.enterInfoAboutRental(dataBringScooter, courierComment);
        objOrderPage.waitAndClickConfirmButton();
        objOrderPage.waitForTextConfirmOrder(textConfirmOrder);
    }

    @Test
    public void orderAtTheBottomTest() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        Dimension dimension = new Dimension(1920, 1080);
        driver.manage().window().setSize(dimension);

        OrderPage objOrderPage = new OrderPage(driver);
        MainPage objMainPage = new MainPage(driver);

        objMainPage.clickOrderButtonAtTheBottom();
        objOrderPage.enterInfoForWhomScooter(name, surname, address, metroStation, telephone);
        objOrderPage.enterInfoAboutRental(dataBringScooter, courierComment);
        objOrderPage.waitAndClickConfirmButton();
        objOrderPage.waitForTextConfirmOrder(textConfirmOrder);
    }

    @After
    public void teardown () {
        driver.quit();
    }
}
