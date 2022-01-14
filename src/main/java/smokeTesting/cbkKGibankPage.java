package smokeTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.testng.Assert;

public class cbkKGibankPage {
    WebDriver driver;
    By cbkibankLoginInput = By.xpath("//*[@id=\"consumerForm\"]/li[1]/div/input");
    By cbkibankPasswordInput = By.xpath("//*[@id=\"consumerForm\"]/li[2]/div/input");
    By cbkibankLoginButton = By.xpath("//*[@id=\"consumerForm\"]/li[3]/table/tbody/tr/td[2]/input");
    By cbkibankHelpLink = By.xpath("//*[@id=\"languageOnlyHeader\"]/div/a[1]");
    By cbkibankLanguagesLink = By.xpath("//*[@id=\"switchLanguageLink\"]");

    public cbkKGibankPage(WebDriver driver) {
        this.driver = driver;
    }

    public void cbkibankLoginPasswordSmokeTesting () {
        driver.get("https://ibank.cbk.kg/portal/login;jsessionid=2B50C138CB7953A0BC5D4DDA5C8E5C41");
        driver.findElement(cbkibankLoginInput).sendKeys("james18q");
        driver.findElement(cbkibankPasswordInput).sendKeys("156236qZart");
        driver.findElement(cbkibankLoginButton).click();
        String loginPasswordValidation = driver.findElement(By.xpath("//*[@id=\"consumerForm\"]/li[4]/div/span/div/ul/li/span")).getText();
        Assert.assertEquals(loginPasswordValidation, "Неудачная авторизация. Пожалуйста проверьте логин и пароль");
    }

    public void cbkibankLoginPasswordBoundaryValuesTesting1 () {
        driver.get("https://ibank.cbk.kg/portal/login;jsessionid=2B50C138CB7953A0BC5D4DDA5C8E5C41");
        driver.findElement(cbkibankLoginInput).sendKeys("james18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18q");
        driver.findElement(cbkibankPasswordInput).sendKeys("156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart");
        driver.findElement(cbkibankLoginButton).click();
        String loginPasswordValidation = driver.findElement(By.xpath("//*[@id=\"id3\"]/div[2]/div/div/div[1]")).getText();
        Assert.assertEquals(loginPasswordValidation, "Возникла техническая ошибка. Приносим извинения за временные неудобства.");
    }

    public void cbkibankLoginPasswordBoundaryValuesTesting2 () {
        driver.get("https://ibank.cbk.kg/portal/login;jsessionid=2B50C138CB7953A0BC5D4DDA5C8E5C41");
        driver.findElement(cbkibankLoginInput).sendKeys("          ");
        driver.findElement(cbkibankPasswordInput).sendKeys("          ");
        driver.findElement(cbkibankLoginButton).click();
        String loginValidation = driver.findElement(By.xpath("//*[@id=\"consumerForm\"]/li[4]/div/span/div/ul/li[1]/span")).getText();
        String passwordValidation = driver.findElement(By.xpath("//*[@id=\"consumerForm\"]/li[4]/div/span/div/ul/li[2]/span")).getText();
        Assert.assertEquals(passwordValidation, "Введите пароль");
        Assert.assertEquals(loginValidation, "Введите логин");
    }

    public void cbkibankLoginPasswordNegativeValuesTesting () {
        driver.get("https://ibank.cbk.kg/portal/login;jsessionid=2B50C138CB7953A0BC5D4DDA5C8E5C41");
        driver.findElement(cbkibankLoginInput).sendKeys("james@//**--");
        driver.findElement(cbkibankPasswordInput).sendKeys("FuckYou@@@)))___1488");
        driver.findElement(cbkibankLoginButton).click();
        String loginPasswordValidation = driver.findElement(By.xpath("//*[@id=\"consumerForm\"]/li[4]/div/span/div/ul/li/span")).getText();
        Assert.assertEquals(loginPasswordValidation, "Неудачная авторизация. Пожалуйста проверьте логин и пароль");
    }

    public void cbkibankHelpLinkSmokeTesting () {
        driver.get("https://ibank.cbk.kg/portal/login;jsessionid=2B50C138CB7953A0BC5D4DDA5C8E5C41");
        String actualPageTitle = driver.getTitle();
        boolean pagesComparison;
        driver.findElement(cbkibankHelpLink).click();
        String nextPageTitle = driver.getTitle();
        pagesComparison = (actualPageTitle != nextPageTitle);
        Assert.assertEquals(pagesComparison, true);
    }

    public void cbkibankLanguagesLinkSmokeTesting () {
        driver.get("https://ibank.cbk.kg/portal/login;jsessionid=2B50C138CB7953A0BC5D4DDA5C8E5C41");
        driver.findElement(cbkibankLanguagesLink).click();
        String blockOfLanguagesStatus = driver.findElement(By.xpath("//*[@id=\"languageSelector\"]")).getCssValue("display");
        Assert.assertEquals(blockOfLanguagesStatus, "block");
    }

    public void cbkibankLanguagesLinkKyrgyzLinkSmokeTesting () {
        driver.get("https://ibank.cbk.kg/portal/login;jsessionid=2B50C138CB7953A0BC5D4DDA5C8E5C41");
        String actualPageTitle = driver.getTitle();
        boolean pagesComparison;
        driver.findElement(cbkibankLanguagesLink).click();
        driver.findElement(By.xpath("//*[@id=\"language-select\"]/li[1]/a")).click();
        String nextPageTitle = driver.getTitle();
        pagesComparison = (actualPageTitle != nextPageTitle);
        Assert.assertEquals(pagesComparison, true);
    }

    public void cbkibankLanguagesLinkEnglishLinkSmokeTesting () {
        driver.get("https://ibank.cbk.kg/portal/login;jsessionid=2B50C138CB7953A0BC5D4DDA5C8E5C41");
        String actualPageTitle = driver.getTitle();
        boolean pagesComparison;
        driver.findElement(cbkibankLanguagesLink).click();
        driver.findElement(By.xpath("//*[@id=\"language-select\"]/li[3]/a")).click();
        String nextPageTitle = driver.getTitle();
        pagesComparison = (actualPageTitle != nextPageTitle);
        Assert.assertEquals(pagesComparison, true);
    }

}
