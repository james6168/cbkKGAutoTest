package smokeTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

//С этого класса будет осуществляться запуск отдельных тестов.
public class cbkKGSetup {
    WebDriver driver;
    cbkKGHomePage objcbkKGHomePage;

    @BeforeTest
    public void setup () {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://cbk.kg/");
    }

    @Test // Smoke-тестирование поля поиска на главной странице cbk.kg
    public void cbkHomePageSmokeSearchFieldTesting () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePageSmokeSearchFieldTesting();
    }

    @Test //Тест на граничные значения поля поиска (search field).
    // Данный автотест вводит определённый текст и проверяет корректность работы поиска на сайте cbk.kg
    public void cbkHomePageSearchFieldBoundaryValuesTesting () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePageSearchFieldBoundaryValuesTesting();
    }

    @Test //Тест на ввод негативных значений поля потска.
    // Данный автотест проверяет работу поискового поля (search field) в условиях ввода некорректных данных.
    public void cbkHomePageSearchFieldNegativeValuesTesting () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePageSearchFieldNegativeValuesTesting();
    }

    @Test //Тест на Smoke-тестирование дропдауна "Юридичсеким лицам" на главной странице cbk.kg.
    // Данный автотест проверяет количество прогруженных элементов дропдауна "Юридическим лицам", элементов в списке дропдауна должно быть 12.
    public void cbkHomePageDropDown1SmokeTesting () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePageDropDown1SmokeTesting();
    }

    @Test //Тест на Smoke-тестирование дропдауна "Частным лицам" на главной странице cbk.kg.
    // Данный автотест проверяет количество прогруженных элементов дропдауна "Частным лицам", элементов в списке дропдауна должно быть 14.
    public void cbkHomePageDropDown2SmokeTesting () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePageDropDown2SmokeTesting();
    }

    @Test //Тест на Smoke-тестирование дропдауна "О банке" на главной странице cbk.kg.
    // Данный автотест проверяет количество прогруженных элементов дропдауна "О банке", элементов в списке дропдауна должно быть 10.
    public void cbkHomePageDropDown3SmokeTesting () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePageDropDown3SmokeTesting();
    }

    @Test // Smoke тестирование ссылки "Контакты" на главной странице cbk.kg.
    // Данный автотест проверяет переход по ссылке на страницу "Контакты - Коммерческий банк КЫРГЫЗСТАН".
    public void cbkHomePageLink1SmokeTesting () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePageLink1SmokeTesting();
    }

    @Test // Smoke тестирование ссылки "Реализация имущества" на главной странице cbk.kg.
    // Данный автотест проверяет переход по ссылке на страницу "Реализуемое имущество - Коммерческий банк КЫРГЫЗСТАН".
    public void cbkHomePageLink2SmokeTesting () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePageLink2SmokeTesting();
    }

    @Test // Smoke тестирование ссылки "Документы" на главной странице cbk.kg.
    // Данный автотест проверяет переход по ссылке на страницу "Документы - Коммерческий банк КЫРГЫЗСТАН".
    public void cbkHomePageLink3SmokeTesting () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePageLink3SmokeTesting();
    }


    @Test // Smoke тестирование ссылки "Тендеры" на главной странице cbk.kg.
    // Данный автотест проверяет переход по ссылке на страницу "Коммерческий банк КЫРГЫЗСТАН - кредиты, депозиты, открытие счета, карты VISA и денежные переводы".
    public void cbkHomePageLink4SmokeTesting () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePageLink4SmokeTesting();
    }

    @Test   //Smoke-тестирование ссылок дропдауна "Юридическим лицам".
            // Данный автотест кликает по всем ссылкам, находящимся в дропдауне.
    public void cbkHomePageDropDown1ListChecking () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePageDropDown1LinksOfMenuSmokeTesting();
        objcbkKGHomePage.cbkHomePageDropDown1LastLinkOfMenuSmokeTesting();
    }

    @Test   //Smoke-тестирование ссылок дропдауна "Частным лицам".
            // Данный автотест кликает по всем ссылкам, находящимся в дропдауне.
    public void cbkHomePageDropDown2ListChecking () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePageDropDown2LinksOfMenuSmokeTesting();
        objcbkKGHomePage.cbkHomePageDropDown2LastLinkOfMenuSmokeTesting();
    }

    @Test   //Smoke-тестирование ссылок дропдауна "О банке".
    // Данный автотест кликает по всем ссылкам, находящимся в дропдауне.
    public void cbkHomePageDropDown3ListChecking () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePageDropDown3LinksOfMenuSmokeTesting();
        objcbkKGHomePage.cbkHomePageDropDown3LastLinkOfMenuSmokeTesting();
    }

    @Test   //Smoke-тестирование кнопок слайдера на главной странице cbk.kg.
            //Данный автотест нажимает на все кнопки слайдера, и переходит по ссылкам контейнера слайдера.
    public void cbkHomePageSliderButtonsSmokeTesting () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePageSliderSmokeTesting();
    }

    @Test
    public void cbkHomePageATMLinkSmokeTesting () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePageAtmLinkSmokeTesting();
    }
}
