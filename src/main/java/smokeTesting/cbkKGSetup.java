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
    cbkKGibankPage objcbkKGibankPage;

    @BeforeTest
    public void setup () {
        System.setProperty("webdriver.chrome.driver", "/home/aizhan/.m2/repository/webdriver/chromedriver/linux64/86.0.4240.22/chromedriver");//Здесь понятное дело: Вам тут нужно указать свой путь до драйвера SeleniumChromeDriver
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://cbk.kg/");
    }

    @Test   // Smoke-тестирование поля поиска на главной странице cbk.kg
    public void cbkHomePageSmokeSearchFieldTesting () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePageSmokeSearchFieldTesting();
    }

    @Test   //Тест на граничные значения поля поиска (search field).
            // Данный автотест вводит определённый текст и проверяет корректность работы поиска на сайте cbk.kg
    public void cbkHomePageSearchFieldBoundaryValuesTesting () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePageSearchFieldBoundaryValuesTesting();
    }

    @Test   //Тест на ввод негативных значений поля потска.
            // Данный автотест проверяет работу поискового поля (search field) в условиях ввода некорректных данных.
    public void cbkHomePageSearchFieldNegativeValuesTesting () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePageSearchFieldNegativeValuesTesting();
    }

    @Test   //Тест на Smoke-тестирование дропдауна "Юридичсеким лицам" на главной странице cbk.kg.
            // Данный автотест проверяет количество прогруженных элементов дропдауна "Юридическим лицам", элементов в списке дропдауна должно быть 12.
    public void cbkHomePageDropDown1SmokeTesting () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePageDropDown1SmokeTesting();
    }

    @Test   //Тест на Smoke-тестирование дропдауна "Частным лицам" на главной странице cbk.kg.
            // Данный автотест проверяет количество прогруженных элементов дропдауна "Частным лицам", элементов в списке дропдауна должно быть 14.
    public void cbkHomePageDropDown2SmokeTesting () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePageDropDown2SmokeTesting();
    }

    @Test   //Тест на Smoke-тестирование дропдауна "О банке" на главной странице cbk.kg.
            // Данный автотест проверяет количество прогруженных элементов дропдауна "О банке", элементов в списке дропдауна должно быть 10.
    public void cbkHomePageDropDown3SmokeTesting () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePageDropDown3SmokeTesting();
    }

    @Test   // Smoke тестирование ссылки "Контакты" на главной странице cbk.kg.
            // Данный автотест проверяет переход по ссылке на страницу "Контакты - Коммерческий банк КЫРГЫЗСТАН".
    public void cbkHomePageLink1SmokeTesting () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePageLink1SmokeTesting();
    }

    @Test   // Smoke тестирование ссылки "Реализация имущества" на главной странице cbk.kg.
            // Данный автотест проверяет переход по ссылке на страницу "Реализуемое имущество - Коммерческий банк КЫРГЫЗСТАН".
    public void cbkHomePageLink2SmokeTesting () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePageLink2SmokeTesting();
    }

    @Test   // Smoke тестирование ссылки "Документы" на главной странице cbk.kg.
            // Данный автотест проверяет переход по ссылке на страницу "Документы - Коммерческий банк КЫРГЫЗСТАН".
    public void cbkHomePageLink3SmokeTesting () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePageLink3SmokeTesting();
    }


    @Test   // Smoke тестирование ссылки "Тендеры" на главной странице cbk.kg.
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

    @Test   //Smoke-тестирование ссылки "Карта банкоматов".
            //Данный автотест проверяет переход по ссылке на страницу с картой банкоматов.
    public void cbkHomePageATMLinkSmokeTesting () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePageAtmLinkSmokeTesting();
    }

    @Test   //Smoke-тестирование кнопки домашней страницы в виде логотипа банка "Коммерческий банк - КЫРГЫЗСТАН".
            //Данный автотест проверяет переход на главную страницу при нажатии на кнопку.
    public void cbkHomePageHomePageButtonSmokeTesting () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePageHomePageButtonSmokeTesting();
    }

    @Test   //Smoke-тестирование кнопок смены языков домашней страницы сайта cbk.kg
            //Данный автотест проверяет сменяемость языков при нажатии на ссылки языков на домашней странице сайта cbk.kg
    public void cbkHomePageLanguageLinkSmokeTesting () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePageLanguageLinksSmokeTesting();
    }

    @Test   //Smoke-тестирование кнопки "Курсы валют" домашней страницы cbk.kg.
            //Данный автотест проверяет обновление элементов талицы при нажатии на кнопку "Курсы валют".
    public void cbkHomePageCashRatingTableSmokeTesting () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePageCashRatingTableSmokeTesting();
    }

    @Test   //Smoke-тестирование кнопки "Обезналичивание" домашней страницы cbk.kg.
            //Данный автотест проверяет обновление элементов талицы при нажатии на кнопку "Обезналичивание".
    public void cbkHomePageFaresTabTableSmokeTesting () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePageFaresTabTableSmokeTesting();
    }

    @Test   //Smoke-тестирование кнопки "Золото" домашней страницы cbk.kg.
            //Данный автотест проверяет обновление элементов талицы при нажатии на кнопку "Золото".
    public void cbkHomePageGoldTabTableSmokeTesting () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePageGoldTabTableSmokeTesting();
    }

    @Test   //Smoke-тестирование ссылки "Кредиты" домашней страницы cbk.kg.
            //Данный автотест проверяет переход по ссылке при нажатии на ссылку "Кредиты".
    public void cbkHomePageLoanLinkSmokeTesing () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePageLoanLinkSmokeTesting();
    }

    @Test   //Smoke-тестирование ссылки "Переводы из России" домашней страницы cbk.kg.
            //Данный автотест проверяет переход по ссылке при нажатии на ссылку "Переводы из России".
    public void cbkHomePageSberBankSmokeLinkTesting () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePageSberBankLinkSmokeTesting();
    }

    @Test   //Smoke-тестирование ссылки "Платёжные карты" домашней страницы cbk.kg.
            //Данный автотест проверяет переход по ссылке при нажатии на ссылку "Платёжные карты".
    public void cbkHomePagePaymentsCardsLinkSmokeTesting () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePagePaymentsCardsLinkSmokeTesting();
    }

    @Test   //Smoke-тестирование ссылки "Рассрочка" домашней страницы cbk.kg.
            //Данный автотест проверяет переход по ссылке при нажатии на ссылку "Рассрочка".
    public void cbkHomePagePaymentByInstallmentsLinkSmokeTesing () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePagePaymentByInstallmentsLinkSmokeTesting();
    }

    @Test   //Smoke-тестирование ссылки "MBANK ONLINE" домашней страницы cbk.kg.
            //Данный автотест проверяет переход по ссылке при нажатии на ссылку "MBANK ONLINE".
    public void cbkHomePageMBankOnlineLinkSmokeTesting () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePageMBankOnlineLinkSmokeTesting();
    }

    @Test   //Smoke-тестирование ссылки "С карты на карту" домашней страницы cbk.kg.
            //Данный автотест проверяет переход по ссылке при нажатии на ссылку "С карты на карту".
    public void cbkHomePageTransferLinkSmokeTesting () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePageTransferLinkSmokeTesting();
    }

    @Test   //Smoke-тестирование ссылок раздела "Новости" домашней страницы cbk.kg.
            //Данный автотест проверяет переходы по каждой ссылке новостей при нажатии.
    public void cbkHomePageNewsListSmokeTesting () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePageNewsListSmokeTesting();
        objcbkKGHomePage.cbkHomePageNewsListMoreLinkSmokeTesting();
    }

    @Test   //Smoke-тестирование ссылок раздела "Вакансии" домашней страницы cbk.kg.
            //Данный автотест проверяет переходы по каждой ссылке новостей при нажатии.
    public void cbkHomePageVacanciesListSmokeTesting () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePageVacanciesListSmokeTesting();
        objcbkKGHomePage.cbkHomePageVacanciesListAllVacanciesLinkSmokeTesting();
    }

    @Test   //Smoke-тестирование анимации кнопки WhatsApp на главной странице cbk.kg.
            //Данный автотест проверяет работу анимации при наведении курсора мыши на кнопку. Кнопка должна раскрыться.
    public void cbkHomePageWhatsAppAnimatedButtonAnimationSmokeTesting () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePageWhatsAppAnimatedButtonAnimationSmokeTesting();
    }

    @Test   //Smoke-тестирование анимации кнопки Telegram на главной странице cbk.kg.
            //Данный автотест проверяет работу анимации при наведении курсора мыши на кнопку. Кнопка должна раскрыться.
    public void cbkHomePageTelegramAnimatedButtonAnimationSmokeTesting () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePageTelegramAnimatedButtonAnimationSmokeTesting();
    }

    @Test   //Smoke-тестирование кнопки WhatsApp на главной странице cbk.kg.
            //Данный автотест проверяет переход на страницу WhatsApp при нажатии на кнопку WhatsApp.
    public void cbkHomePageWhatsAppButtonSmokeTesting () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePageWhatsAppButtonSmokeTesting();
    }

    @Test   //Smoke-тестирование кнопки Telegram на главной странице cbk.kg.
            //Данный автотест проверяет переход на страницу Telegram при нажатии на кнопку Telegram.
    public void cbkHomePageTelegramButtonSmokeTesting () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePageTelegramButtonSmokeTesting();
    }

    @Test   //Smoke-тестирование кнопок чата на главной странице cbk.kg.
            //Данный автотест проверяет работу кнопок чата.
    public void cbkHomePageChatButtonSmokeTesting () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePageChatButtonSmokeTesting();
    }

    @Test   //Smoke-тестирование кнопок социальных сетей.
            //Данный автотест провряет переход на страницы социальных сетей при нажатии на кнопки.
    public void cbkHomePageSocialButtonsSmokeTesting () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePageSocialButtonsSmokeTesting();
    }

    @Test   //Smoke-тестирование кнопки "Рассрочка товаров и услуг" на главной странице cbk.kg.
            //Данный автотест проверяет переход на страницу рассчрочек при нажатии на кнопку.
    public void cbkHomePageInstallmentsButtonSmokeTesting () {
        objcbkKGHomePage = new cbkKGHomePage(driver);
        objcbkKGHomePage.cbkHomePageInstallmentsButtonSmokeTesting();
    }

    @Test   //Smoke-тестирование полей логина и пароля сайта ibank.cbk.kg.
            //Данный автотест вводит стандартные значения в поля "Логин" и "Пароль".
            // Вводимые значения для логина: "james18q", для пароля: "156236qZart".
    public void cbkibankLoginPasswordSmokeTesting () {
        objcbkKGibankPage = new cbkKGibankPage(driver);
        objcbkKGibankPage.cbkibankLoginPasswordSmokeTesting();
    }

    @Test   //Тестирование граничных значений полей логина и пароля сайта ibank.cbk.kg.
            //Данный автотест вводит граничные значения в поля "Логин" и "Пароль".
            // Вводимые значения превышают максимально допустимое количество символов.
    public void cbkibankLoginPasswordBoundaryValuesTesting1() {
        objcbkKGibankPage = new cbkKGibankPage(driver);
        objcbkKGibankPage.cbkibankLoginPasswordBoundaryValuesTesting1();
    }

    @Test   //Тестирование граничных значений полей логина и пароля сайта ibank.cbk.kg.
            //Данный автотест вводит граничные значения в поля "Логин" и "Пароль".
            // Вводимые значения содержат пустое количество количество символов.
    public void cbkibankLoginPasswordBoundaryValuesTesting2() {
        objcbkKGibankPage = new cbkKGibankPage(driver);
        objcbkKGibankPage.cbkibankLoginPasswordBoundaryValuesTesting2();
    }

    @Test   //Тестирование некорректных значений полей логина и пароля сайта ibank.cbk.kg.
            //Данный автотест вводит некорректные значения в поля "Логин" и "Пароль".
            // Вводимые значения содержат специальные символы.
    public void cbkibankLoginPasswordNegativeTesting() {
        objcbkKGibankPage = new cbkKGibankPage(driver);
        objcbkKGibankPage.cbkibankLoginPasswordNegativeValuesTesting();
    }

    @Test   //Smoke-тестирование ссылки "Помощь" сайта ibank.cbk.kg.
    public void cbkibankHelpLinkSmokeTesting () {
        objcbkKGibankPage = new cbkKGibankPage(driver);
        objcbkKGibankPage.cbkibankHelpLinkSmokeTesting();
    }

    @Test   //Smoke-тестирование ссылки "Языки" сайта ibank.cbk.kg.
            //Данный автотест проверяет работу анимации отображения блока с языками при нажатии на ссылку "Языки".
    public void cbkibankLanguagesLinkSmokeTesting () {
        objcbkKGibankPage = new cbkKGibankPage(driver);
        objcbkKGibankPage.cbkibankLanguagesLinkSmokeTesting();
    }

    @Test   //Smoke-тестирование ссылки "Языки" сайта ibank.cbk.kg.
            //Данный автотест проверяет работу смены языка сайта ibank.cbk.kg с русского на кыргызский при нажатии на ссылку "Кыргызский".
    public void cbkibankLanguagesLinkKyrgyzLinkSmokeTesting () {
        objcbkKGibankPage = new cbkKGibankPage(driver);
        objcbkKGibankPage.cbkibankLanguagesLinkEnglishLinkSmokeTesting();
    }


}
