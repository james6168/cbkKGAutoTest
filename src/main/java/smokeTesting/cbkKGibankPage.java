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
    By cbkibankHeaderLogo = By.xpath("//*[@id=\"logoHeader\"]");
    By cbkibankHelpLink = By.xpath("//*[@id=\"languageOnlyHeader\"]/div/a[1]");
    By cbkibankLanguagesLink = By.xpath("//*[@id=\"switchLanguageLink\"]");
    By cbkibankAboutServiceLink = By.xpath("//*[@id=\"id1\"]/div[4]/div[1]/a");

    public cbkKGibankPage(WebDriver driver) {
        this.driver = driver;
    }

    public void cbkibankLoginPasswordSmokeTesting () {
        try {
            driver.get("https://ibank.cbk.kg/portal/login;jsessionid=2B50C138CB7953A0BC5D4DDA5C8E5C41");
            driver.findElement(cbkibankLoginInput).sendKeys("james18q");
            driver.findElement(cbkibankPasswordInput).sendKeys("156236qZart");
            Thread.sleep(1000);
            driver.findElement(cbkibankLoginButton).click();
            Thread.sleep(1000);
            String loginPasswordValidation = driver.findElement(By.xpath("//*[@id=\"consumerForm\"]/li[4]/div/span/div/ul/li/span")).getText();
            Assert.assertEquals(loginPasswordValidation, "Неудачная авторизация. Пожалуйста проверьте логин и пароль");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    public void cbkibankLoginPasswordBoundaryValuesTesting1 () {
        try {
            driver.get("https://ibank.cbk.kg/portal/login;jsessionid=2B50C138CB7953A0BC5D4DDA5C8E5C41");
            driver.findElement(cbkibankLoginInput).sendKeys("james18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18qjames18q");
            driver.findElement(cbkibankPasswordInput).sendKeys("156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart156236qZart");
            Thread.sleep(1000);
            driver.findElement(cbkibankLoginButton).click();
            Thread.sleep(1000);
            String loginPasswordValidation = driver.findElement(By.xpath("//*[@id=\"id3\"]/div[2]/div/div/div[1]")).getText();
            Assert.assertEquals(loginPasswordValidation, "Возникла техническая ошибка. Приносим извинения за временные неудобства.");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    public void cbkibankLoginPasswordBoundaryValuesTesting2 () {
        try {
            driver.get("https://ibank.cbk.kg/portal/login;jsessionid=2B50C138CB7953A0BC5D4DDA5C8E5C41");
            driver.findElement(cbkibankLoginInput).sendKeys("          ");
            driver.findElement(cbkibankPasswordInput).sendKeys("          ");
            Thread.sleep(1000);
            driver.findElement(cbkibankLoginButton).click();
            Thread.sleep(1000);
            String loginValidation = driver.findElement(By.xpath("//*[@id=\"consumerForm\"]/li[4]/div/span/div/ul/li[1]/span")).getText();
            String passwordValidation = driver.findElement(By.xpath("//*[@id=\"consumerForm\"]/li[4]/div/span/div/ul/li[2]/span")).getText();
            Assert.assertEquals(passwordValidation, "Введите пароль");
            Assert.assertEquals(loginValidation, "Введите логин");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    public void cbkibankLoginPasswordNegativeValuesTesting () {
        try {
            driver.get("https://ibank.cbk.kg/portal/login;jsessionid=2B50C138CB7953A0BC5D4DDA5C8E5C41");
            driver.findElement(cbkibankLoginInput).sendKeys("james@//**--");
            driver.findElement(cbkibankPasswordInput).sendKeys("FuckYou@@@)))___1488");
            Thread.sleep(1000);
            driver.findElement(cbkibankLoginButton).click();
            Thread.sleep(1000);
            String loginPasswordValidation = driver.findElement(By.xpath("//*[@id=\"consumerForm\"]/li[4]/div/span/div/ul/li/span")).getText();
            Assert.assertEquals(loginPasswordValidation, "Неудачная авторизация. Пожалуйста проверьте логин и пароль");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    public void cbkibankHelpLinkSmokeTesting () {
        try {
            driver.get("https://ibank.cbk.kg/portal/login;jsessionid=2B50C138CB7953A0BC5D4DDA5C8E5C41");
            driver.findElement(cbkibankHelpLink).click();
            String nextPageH1 = driver.findElement(By.xpath("//*[@id=\"mbank\"]/div[2]/div/div/div[2]/h3")).getText();
            Assert.assertEquals(nextPageH1, "Простой и удобный сервис позволяющий управлять своими денежными средствами, оплачивать около 300 услуг, совершать переводы между счетами, получать информацию об операциях по Вашим счетам и многое другое с помощью мобильного телефона в любое время, в любом месте!");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
