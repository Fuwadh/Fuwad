import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class MyhomeLogin {
    public static void main(String[] args) throws InterruptedException {

        // creating driver object
        String currentDir = System.getProperty("user.dir");
        System.out.println("Current dir using System:" + currentDir);
        System.setProperty("webdriver.chrome.driver", currentDir + "\\src\\main\\resources\\driver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Locators
        By cookiePopUpLocator = By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]");
        By logInDropDown = By.xpath("/html/body/app-root/div/header/app-header-container/app-desktop-header/div/nav/div[2]/div[1]");
        By loginLinkLocator = By.xpath("//*[@id=\"sel_sign_in_nav_link\"]/span");
        By loginUserNameInputLocator = By.xpath("//input[@type='email']");
        By loginPasswordInputLocator = By.xpath("//*[@id=\"sel_sign_in_password\"]");
        By loginButtonLocator = By.xpath("//*[@id=\"sel_sign_in_button\"]/span");


        try {
            //setting up url
            String baseUrl = "https://www.myhome.ie/";
            // launch chrome and execute the test steps
            driver.get(baseUrl);
            driver.findElement(cookiePopUpLocator).click();
            driver.findElement(logInDropDown).click();
            driver.findElement(loginLinkLocator).click();
            Thread.sleep(4000);
            driver.findElement(loginUserNameInputLocator).sendKeys("tipugo@yahoo.com");
            driver.findElement(loginPasswordInputLocator).sendKeys("Dublin6054#");
            driver.findElement(loginButtonLocator).click();


            // Don't touch the code below this line
            System.out.println("Your Test Passed");
            // sleeping the execution for 4000 milly sec
        } catch (Exception e) {
            System.out.println("Your Test Failed");
        }
        //close chrome
        //driver.close();

    }
}

