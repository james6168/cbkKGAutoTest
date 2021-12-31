package smokeTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class cbkKGHomePage {
    //Поиск веб-форм при помощи локатора Xpath.
    // Установка значений переменных.
    // Каждый найденный элемент отделён от другого при помощи комментариев.
    // Это сделано для удобства чтения.
    WebDriver driver;
    WebDriverWait driverWait;
    //=================================================================================================
    By cbkHomePageSearchField = By.xpath("//*[@class=\"search-field\"]");
    By cbkHomePageSearchResult = By.xpath("//*[@id=\"search-results\"]/div/h2");
    //==================================================================================================
    By cbkHomePageDropDown1 = By.xpath("//*[@id=\"cbk-navbar-collapse\"]/ul[1]/li[1]/a");
    By cbkHomePageDropDown1Menu = By.xpath("//*[@id=\"cbk-navbar-collapse\"]/ul[1]/li[1]/ul");
    //==================================================================================================
    By cbkHomePageDropDown2 = By.xpath("//*[@id=\"cbk-navbar-collapse\"]/ul[1]/li[2]/a");
    By cbkHomePageDropDown2Menu = By.xpath("//*[@id=\"cbk-navbar-collapse\"]/ul[1]/li[2]/ul");
    //==================================================================================================
    By cbkHomePageDropDown3 = By.xpath("//*[@id=\"cbk-navbar-collapse\"]/ul[1]/li[3]/a");
    By cbkHomePageDropDown3Menu = By.xpath("//*[@id=\"cbk-navbar-collapse\"]/ul[1]/li[3]/ul");
    //===================================================================================================
    By cbkHomePageLink1 = By.xpath("//*[@id=\"cbk-navbar-collapse\"]/ul[1]/li[4]/a");
    By cbkHomePageLink2 = By.xpath("//*[@id=\"cbk-navbar-collapse\"]/ul[1]/li[5]/a");
    By cbkHomePageLink3 = By.xpath("//*[@id=\"cbk-navbar-collapse\"]/ul[1]/li[6]/a");;
    By cbkHomePageLink4 = By.xpath("//*[@id=\"cbk-navbar-collapse\"]/ul[1]/li[7]/a");
    //===================================================================================================
    By cbkHomePageSliderContainer = By.xpath("//*[@id=\"carousel-homepage\"]/ol");
    //===================================================================================================
    By cbkHomePageATMLink = By.xpath("//*[@id=\"top_right_menu\"]/li/a");
    //===================================================================================================
    By cbkHomePageHomePageButton = By.xpath("//*[@id=\"header\"]/div[1]/div[2]/a/img");
    //===================================================================================================
    By cbkHomePageLanguageLinkContainer = By.xpath("//*[@id=\"header\"]/div[1]/div[1]");
    //===================================================================================================
    By cbkHomePageCashRatingTableButton = By.xpath("//*[@id=\"home-switcher\"]/button[1]");
    By cbkHomePageFaresTabButton = By.xpath("//*[@id=\"home-switcher\"]/button[2]");
    By cbkHomePageGoldTabButton = By.xpath("//*[@id=\"home-switcher\"]/button[3]");
    //===================================================================================================


    public cbkKGHomePage (WebDriver driver) {
        this.driver = driver;
    }

    public void cbkHomePageSmokeSearchFieldTesting () {
        driver.findElement(cbkHomePageSearchField).sendKeys("Кредит", Keys.ENTER);
        String searchResultAssertion = driver.findElement(cbkHomePageSearchResult).getText();
        Assert.assertEquals(searchResultAssertion, "РЕЗУЛЬТАТЫ ПОИСКА");
    }

    public void cbkHomePageSearchFieldBoundaryValuesTesting () {
        driver.findElement(cbkHomePageSearchField).sendKeys("Кредиты очень плохо влияют на ваше финсовое здоровье! Беря ипотеку на несколько лет, имейте в виду, что вы сознательно лишаете себя будущего, особенно учитывая тот факт, что проценты в этом банке свирепые.", Keys.ENTER);
        String searchResultAssertion = driver.findElement(cbkHomePageSearchResult).getText();
        Assert.assertEquals(searchResultAssertion, "НИЧЕГО НЕ НАЙДЕНО");
    }

    public void cbkHomePageSearchFieldNegativeValuesTesting () {
        driver.findElement(cbkHomePageSearchField).sendKeys("***///Ты дур**//к, если ты берёшь *-кредит** в этом @банке/*/*/*////?????", Keys.ENTER);
        String searchResultAssertion = driver.findElement(cbkHomePageSearchResult).getText();
        Assert.assertEquals(searchResultAssertion, "НИЧЕГО НЕ НАЙДЕНО");
    }

    public void cbkHomePageDropDown1SmokeTesting () {
        driver.findElement(cbkHomePageDropDown1).click();
        String cbkHomePageDropDown1MenuCountOfElements = driver.findElement(cbkHomePageDropDown1Menu).getAttribute("childElementCount");
        Assert.assertEquals(cbkHomePageDropDown1MenuCountOfElements, "12");
    }

    public void cbkHomePageDropDown2SmokeTesting () {
        driver.findElement(cbkHomePageDropDown2).click();
        String cbkHomePageDropDown2MenuCountOfElements = driver.findElement(cbkHomePageDropDown2Menu).getAttribute("childElementCount");
        Assert.assertEquals(cbkHomePageDropDown2MenuCountOfElements, "14");
    }

    public void cbkHomePageDropDown3SmokeTesting () {
        driver.findElement(cbkHomePageDropDown3).click();
        String cbkHomePageDropDown3MenuCountOfElements = driver.findElement(cbkHomePageDropDown3Menu).getAttribute("childElementCount");
        Assert.assertEquals(cbkHomePageDropDown3MenuCountOfElements, "10");
    }

    public void cbkHomePageLink1SmokeTesting () {
        driver.findElement(cbkHomePageLink1).click();
        String cbkHomePageLink1TitleOfLink = driver.getTitle();
        Assert.assertEquals(cbkHomePageLink1TitleOfLink, "Контакты - Коммерческий банк КЫРГЫЗСТАН");
    }

    public void cbkHomePageLink2SmokeTesting () {
        driver.findElement(cbkHomePageLink2).click();
        String cbkHomePageLink2TitleOfLink = driver.getTitle();
        Assert.assertEquals(cbkHomePageLink2TitleOfLink, "Реализуемое имущество - Коммерческий банк КЫРГЫЗСТАН");
    }

    public void cbkHomePageLink3SmokeTesting () {
        driver.findElement(cbkHomePageLink3).click();
        String cbkHomePageLink3TitleOfLink = driver.getTitle();
        Assert.assertEquals(cbkHomePageLink3TitleOfLink, "Документы - Коммерческий банк КЫРГЫЗСТАН");
    }

    public void cbkHomePageLink4SmokeTesting () {
        driver.findElement(cbkHomePageLink4).click();
        String cbkHomePageLink4TitleOfLink = driver.getTitle();
        Assert.assertEquals(cbkHomePageLink4TitleOfLink, "Коммерческий банк КЫРГЫЗСТАН - кредиты, депозиты, открытие счета, карты VISA и денежные переводы");
    }

    public void cbkHomePageDropDown1LinksOfMenuSmokeTesting () {
        driver.findElement(cbkHomePageDropDown1).click();
        String actualHomePage = driver.getTitle();
        String countOfLinksDropDown1String = driver.findElement(cbkHomePageDropDown1Menu).getAttribute("childElementCount");
        int countOfLinksDropDown1Integer = Integer.parseInt(countOfLinksDropDown1String);
        for (int i = 1; i < countOfLinksDropDown1Integer; i++) {
            if (i == 7) {
                i += 1;
            }
            driver.findElement(By.xpath("//*[@id=\"cbk-navbar-collapse\"]/ul[1]/li[1]/ul/li["+ i +"]/a")).click();
            driver.findElement(cbkHomePageDropDown1).click();
            String nextPage = driver.getTitle();
            boolean pagesComparison = (actualHomePage != nextPage);
            Assert.assertEquals(pagesComparison, true);
        }
    }

    public void cbkHomePageDropDown1LastLinkOfMenuSmokeTesting () {
        driver.findElement(By.xpath("//*[@id=\"cbk-navbar-collapse\"]/ul[1]/li[1]/ul/li[12]/a")).click();
        String titleOfLink = driver.getTitle();
        Assert.assertEquals(titleOfLink, "Авторизация - Кредит за час");
    }

    public void cbkHomePageDropDown2LinksOfMenuSmokeTesting () {
        driver.findElement(cbkHomePageDropDown2).click();
        String actualHomePage = driver.getTitle();
        String countOfLinksDropDown2String = driver.findElement(cbkHomePageDropDown2Menu).getAttribute("childElementCount");
        int countOfLinksDropDown2Integer = Integer.parseInt(countOfLinksDropDown2String);
        for (int i = 1; i < countOfLinksDropDown2Integer; i++) {
            if (i == 6) {
                i += 1;
            }
            driver.findElement(By.xpath("//*[@id=\"cbk-navbar-collapse\"]/ul[1]/li[2]/ul/li["+ i +"]/a")).click();
            if (i == 9) {
                driver.get("https://cbk.kg/");
            }
            if (i == 12) {
                driver.get("https://cbk.kg/");
            }
            if (i == 13) {
                driver.get("https://cbk.kg/");
            }
            driver.findElement(cbkHomePageDropDown2).click();
            String nextPage = driver.getTitle();
            boolean pagesComparison = (actualHomePage != nextPage);
            Assert.assertEquals(pagesComparison, true);
        }
    }

    public void cbkHomePageDropDown2LastLinkOfMenuSmokeTesting () {
        driver.findElement(By.xpath("//*[@id=\"cbk-navbar-collapse\"]/ul[1]/li[2]/ul/li[14]/a")).click();
        String titleOfLink = driver.getTitle();
        Assert.assertEquals(titleOfLink, "Тарифы - Коммерческий банк КЫРГЫЗСТАН");
    }

    public void cbkHomePageDropDown3LinksOfMenuSmokeTesting () {
        driver.findElement(cbkHomePageDropDown3).click();
        String actualHomePage = driver.getTitle();
        String countOfLinksDropDown3String = driver.findElement(cbkHomePageDropDown3Menu).getAttribute("childElementCount");
        int countOfLinksDropDown3Integer = Integer.parseInt(countOfLinksDropDown3String);
        for (int i = 1; i < countOfLinksDropDown3Integer; i++) {
            if (i == 8) {
                i += 1;
            }
            driver.findElement(By.xpath("//*[@id=\"cbk-navbar-collapse\"]/ul[1]/li[3]/ul/li["+ i +"]/a")).click();
            driver.findElement(cbkHomePageDropDown3).click();
            String nextPage = driver.getTitle();
            boolean pagesComparison = (actualHomePage != nextPage);
            Assert.assertEquals(pagesComparison, true);
        }
    }

    public void cbkHomePageDropDown3LastLinkOfMenuSmokeTesting () {
        driver.findElement(By.xpath("//*[@id=\"cbk-navbar-collapse\"]/ul[1]/li[3]/ul/li[10]/a")).click();
        String titleOfLink = driver.getTitle();
        Assert.assertEquals(titleOfLink, "Банкоматы - Коммерческий банк КЫРГЫЗСТАН");
    }

    public void cbkHomePageSliderSmokeTesting () {
        String countOfSliderButtonsString = driver.findElement(cbkHomePageSliderContainer).getAttribute("childElementCount");
        int countOfSliderButtonsInteger = Integer.parseInt(countOfSliderButtonsString);
        String actualHomePage = driver.getTitle();
        for (int i = 1; i <= countOfSliderButtonsInteger; i++) {
            try {
                driver.findElement(By.xpath("//*[@id=\"carousel-homepage\"]/ol/li["+ i +"]")).click();
                driver.findElement(By.xpath("//*[@class=\"item active\"]")).click();
                String nextHomePage = driver.getTitle();
                boolean pagesAssertion = (actualHomePage != nextHomePage);
                Assert.assertEquals(pagesAssertion, true);
                Thread.sleep(1000);
                driver.get("https://cbk.kg/");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void cbkHomePageAtmLinkSmokeTesting () {
        driver.findElement(cbkHomePageATMLink).click();
        String nameOfATMTables = driver.findElement(By.xpath("//*[@id=\"map-items-list\"]/h2")).getText();
        Assert.assertEquals(nameOfATMTables, "БАНКОМАТЫ, ОБСЛУЖИВАЮЩИЕ КАРТЫ ЭЛКАРТ, ЗОЛОТАЯ КОРОНА, VISA, MASTERCARD, МИР И CHINA UNION PAY:");
    }

    public void cbkHomePageHomePageButtonSmokeTesting () {
        driver.findElement(cbkHomePageHomePageButton).click();
        String pageAssertion = driver.getTitle();
        Assert.assertEquals(pageAssertion, "Коммерческий банк КЫРГЫЗСТАН");
    }

    public void cbkHomePageLanguageLinksSmokeTesting () {
        String homePageTitle = driver.getTitle();
        boolean pagesComparisonAssertion;
        String countOfElementsString = driver.findElement(cbkHomePageLanguageLinkContainer).getAttribute("childElementCount");
        int countOfElementsInteger = Integer.parseInt(countOfElementsString);
        for (int i = 1; i <= countOfElementsInteger; i++) {
            driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[1]/a["+i+"]")).click();
            String nextPageTitle = driver.getTitle();
            pagesComparisonAssertion = (homePageTitle != nextPageTitle);
            Assert.assertEquals(pagesComparisonAssertion, true);
        }
    }

    public void cbkHomePageCashRatingTableSmokeTesting () {
        try {
            boolean statusAssertion;
            String buttonStatusInactive = driver.findElement(cbkHomePageCashRatingTableButton).getDomAttribute("class");
            driver.findElement(cbkHomePageCashRatingTableButton).click();
            Thread.sleep(1000);
            String buttonStatusActive = driver.findElement(cbkHomePageCashRatingTableButton).getDomAttribute("class");
            statusAssertion = (buttonStatusInactive != buttonStatusActive);
            Assert.assertEquals(statusAssertion, true);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void cbkHomePageFaresTabTableSmokeTesting () {
        try {
            boolean statusAssertion;
            String buttonStatusInactive = driver.findElement(cbkHomePageFaresTabButton).getDomAttribute("class");
            driver.findElement(cbkHomePageFaresTabButton).click();
            Thread.sleep(1000);
            String buttonStatusActive = driver.findElement(cbkHomePageFaresTabButton).getDomAttribute("class");
            statusAssertion = (buttonStatusInactive != buttonStatusActive);
            Assert.assertEquals(statusAssertion, true);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void cbkHomePageGoldTabTableSmokeTesting () {
        try {
            boolean statusAssertion;
            String buttonStatusInactive = driver.findElement(cbkHomePageGoldTabButton).getDomAttribute("class");
            driver.findElement(cbkHomePageGoldTabButton).click();
            Thread.sleep(1000);
            String buttonStatusActive = driver.findElement(cbkHomePageGoldTabButton).getDomAttribute("class");
            statusAssertion = (buttonStatusInactive != buttonStatusActive);
            Assert.assertEquals(statusAssertion, true);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
