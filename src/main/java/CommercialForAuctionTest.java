import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class CommercialForAuctionTest {
    public static void main(String[] args) {
        // creating driver object
        String currentDir = System.getProperty("user.dir");
        System.out.println("Current dir using System:" + currentDir);
        System.setProperty("webdriver.chrome.driver", currentDir + "\\src\\main\\resources\\driver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // don't touch the code above this line.

        // Locators
        By acceptAll =  By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]");
        By Commercial = By.xpath("/html/body/app-root/div/header/app-header-container/app-desktop-header/div/nav/div[1]/div[4]/div[1]");
        By CommercialForAuction = By.xpath("/html/body/app-root/div/header/app-header-container/app-desktop-header/div/nav/div[1]/div[4]/div[2]/div[3]/a");
        By countyRegionDropDown = By.xpath("//*[@id=\"sel_region_dropdown\"]");
        By searchRegion  = By.xpath("//*[@id=\"sel_region_dropdown\"]/div/div/div[1]/input");
        By Limerick = By.xpath("//*[@id=\"sel_region_dropdown\"]/div/div/div[2]/div[1]");
        By areasDropdown = By.xpath("//*[@id=\"sel_locality_dropdown\"]");
        By searchAreas = By.xpath("//*[@id=\"searchInput\"]");
        By LimerickCity = By.xpath("//*[@id=\"sel_locality_dropdown\"]/div[1]/div/div[2]/div[1]/div[2]/div/app-mh-check-box/div/div[2]");
        By Done = By.xpath("//*[@id=\"sel_locality_dropdown\"]/div[1]/div/div[1]/app-mh-button[2]/button/span");
        By priceDropdown = By.xpath("//*[@id=\"sel_max_price_dropdown\"]");
        By price = By.xpath("//*[@id=\"sel_max_price_dropdown\"]/div/div/div/div[21]");
        By type = By.xpath("//*[@id=\"sel_property_type_dropdown\"]");
        By searchProperty = By.xpath("//*[@id=\"sel_property_type_dropdown\"]/div/div/div[1]/div[2]/input");
        By allProperties = By.xpath("//*[@id=\"sel_property_type_dropdown\"]/div/div/div[2]/div[1]/app-mh-check-box/div/div[2]");
        By done2 = By.xpath("//*[@id=\"sel_property_type_dropdown\"]/div/div/div[1]/div[1]/app-mh-button[2]/button/span");
        By search = By.xpath("//*[@id=\"sel_search_button\"]/span");


        try {
            // launch chrome and go to url
            driver.get("https://myhome.ie");
            driver.findElement(acceptAll).click();
            Thread.sleep(2000);
            driver.findElement(Commercial).click();
            driver.findElement(CommercialForAuction).click();
            driver.findElement(countyRegionDropDown).click();
            driver.findElement(searchRegion).sendKeys("Limerick");
            driver.findElement(Limerick).click();
            Thread.sleep(5000);
            driver.findElement(areasDropdown).click();
            driver.findElement(searchAreas).sendKeys("Limerick City");
            driver.findElement(LimerickCity).click();
            driver.findElement(Done).click();
            Thread.sleep(2000);
            driver.findElement(priceDropdown).click();
            driver.findElement(price).click();
            Thread.sleep(1000);
            driver.findElement(type).click();
            driver.findElement(searchProperty).sendKeys("All Properties");
            driver.findElement(allProperties).click();
            driver.findElement(done2).click();
            Thread.sleep(2000);
            driver.findElement(search).click();







            // Don't touch the code below this line
            System.out.println("Your Test Passed");
            // sleeping the execution for 4000 milly sec

        }
        catch (Exception e) {
            System.out.println("Your Test Failed");
        }
        //close chrome
        //driver.close();
    }
}









