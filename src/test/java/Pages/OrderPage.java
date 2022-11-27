package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderPage {

    private WebDriver driver;

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    // Надпись для кого самокат (для ожидания прогрузки страницы)
    private By labelScooter = By.className("Order_Header__BZXOb");


    // Надпись "Про аренду" (для ожидания прогрузки страницы)
    private By labelRental = By.className("Order_Header__BZXOb");

    // Надпись "Хотите оформить заказ?" (для ожидания прогрузки страницы)
    private By labelQuestionOrder = By.className("Order_ModalHeader__3FDaJ");

    // Текст подтверждения заказа (для ожидания прогрузки страницы)
    private By textConfirmOrder = By.className("Order_ModalHeader__3FDaJ");


    // Поле "Имя"
    private By nameField = By.xpath(".//div[@class='Order_Form__17u6u']/div[1]/input");

    // Поле "Фамилия"
    private By surnameField = By.xpath(".//div[@class='Order_Form__17u6u']/div[2]/input");

    // Поле "Адрес: куда привезти заказ"
    private By addressField = By.xpath(".//div[@class='Order_Form__17u6u']/div[3]/input");

    // Поле "Станция метро"
    private By metroStationField = By.className("select-search__input");

    // Выбор элемента из списка станций метро
    private By metroStationEl1 = By.xpath(".//div[@class='select-search__select']/ul/li[1]");

    // Поле "Телефон: на него позвонит курьер"
    private By telephoneField = By.xpath(".//div[@class='Order_Form__17u6u']/div[5]/input");

    // Кнопка "Далее"
    private By nextButton = By.xpath(".//div[@class='Order_NextButton__1_rCA']/button");

    // Поле "Когда привезти самокат"
    private By whenBringScooterField = By.xpath(".//div[@class='Order_MixedDatePicker__3qiay']//input");

    // Выбранная дата в поле "Когда привезти самокат"
    private By selectedDataInBringScooterField = By.cssSelector(".react-datepicker__day--selected");

    // Поле "Срок аренды"
    private By rentalPeriodField = By.xpath(".//div[@class='Order_Form__17u6u']/div[2]/div[1]");

    // Выбор срока аренды = 1 сутки
    private By rentalPeriodOneDay = By.xpath(".//div[@class='Dropdown-menu']/div[1]");

    // Чекбокс "Цвет самоката", "Черный жемчуг"
    private By blackColourScooter = By.xpath(".//div[@class='Order_Checkboxes__3lWSI']/label[1]/input");
    // Чекбокс "Цвет самоката", "Серая безысходность"
    private By greyColourScooter = By.xpath(".//div[@class='Order_Checkboxes__3lWSI Order_FilledContainer__2MKAk']/label[2]/input");

    // Поле "Комментарий для курьера"
    private By courierCommentField = By.xpath(".//div[@class='Order_Form__17u6u']/div[4]/input");

    // Кнопка "Заказать"
    private By orderButton = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[2]");

    // Кнопка подтверждения заказа ("Да")
    private By confirmButton = By.xpath(".//div[@class='Order_Modal__YZ-d3']/div[2]/button[2]");


    // Метод для ввода имени
    public void enterName(String newName) {
        driver.findElement(nameField).sendKeys(newName);
    }

    // Метод для ввода фамилии
    public void enterSurname(String newSurname) {
        driver.findElement(surnameField).sendKeys(newSurname);
    }

    // Метод для ввода адреса
    public void enterAddress(String newAddress) {
        driver.findElement(addressField).sendKeys(newAddress);
    }

    // Метод для выбора станции метро
    public void chooseMetroStation(String newMetroStation) {
        driver.findElement(metroStationField).sendKeys(newMetroStation);
        driver.findElement(metroStationEl1).click();
    }

    // Метод для ввода номера телефона
    public void enterTelephone(String newTelephone) {
        driver.findElement(telephoneField).sendKeys(newTelephone);
    }

    // Метод нажатия на кнопку "Далее"
    public void clickNextButton() {
        driver.findElement(nextButton).click();
    }

    // Метод для ожидания прогрузки надписи "Для кого самокат"
    public void waitForLoadForWhomScooter() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(labelScooter));
    }

    // Метод для ожидания прогрузки надписи "Про аренду"
    public void waitForLoadAboutRent() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(labelRental));
    }

    // Метод для ожидания прогрузки надписи "Хотите оформить заказ?"
    public void waitForLoadQuestionOrder() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(labelQuestionOrder));
    }

    // Общий метод для ввода информации для кого самокат и нажатие на кнопку "Далее"
    public void enterInfoForWhomScooter(String name, String surname, String address, String metroStation, String telephone) {
        waitForLoadForWhomScooter();
        enterName(name);
        enterSurname(surname);
        enterAddress(address);
        chooseMetroStation(metroStation);
        enterTelephone(telephone);
        clickNextButton();
    }

    // Метод для выбора даты когда привезти самокат
    public void enterDataBringScooter(String dataBringScooter) {
        driver.findElement(whenBringScooterField).sendKeys(dataBringScooter);
        driver.findElement(selectedDataInBringScooterField).click();
    }

    // Метод для выбора срока аренды
    public void chooseRentalPeriod() {
        driver.findElement(rentalPeriodField).click();
        driver.findElement(rentalPeriodOneDay).click();
    }

    // Метод для выбора цвета самоката
    public void chooseColourScooter() {
        driver.findElement(blackColourScooter).click();
        driver.findElement(greyColourScooter).click();
    }

    // Метод для ввода комментария для курьера
    public void enterCourierComment(String courierComment) {
        driver.findElement(courierCommentField).sendKeys(courierComment);
    }

    // Метод для нажатия на кнопку "Заказать"
    public void clickOrderButton() {
        driver.findElement(orderButton).click();
    }


    // Общий метод для ввода информации про аренду и нажатие на кнопку "Заказать"
    public void enterInfoAboutRental(String dataBringScooter, String courierComment) {
        waitForLoadAboutRent();
        enterDataBringScooter(dataBringScooter);
        chooseRentalPeriod();
        chooseColourScooter();
        enterCourierComment(courierComment);
        clickOrderButton();
    }

    // Метод для нажатия на кнопку подтверждения заказа "Да"
    public void clickConfirmButton() {
        driver.findElement(confirmButton).click();
    }

    // Общий метод для ожидания прогрузки надписи "Хотите оформить заказ?" и нажатие на кнопку "Да"
    public void waitAndClickConfirmButton() {
        waitForLoadQuestionOrder();
        clickConfirmButton();
    }

    // Метод для проверки подтверждения текста, что заказ оформлен
    public void waitForTextConfirmOrder(String textConfirm) {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.textToBePresentInElementLocated(textConfirmOrder, textConfirm));
    }
}
