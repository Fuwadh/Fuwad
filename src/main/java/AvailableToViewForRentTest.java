import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class AvailableToViewForRentTest {
    public static void main(String[] args) {
        // Creating driver object
        String currentDir = System.getProperty("user.dir");
        System.out.println("Current dir using system:" + currentDir);
        System.setProperty("webdriver.chrome.driver", currentDir + "\\src\\main\\resources\\driver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // don't touch the code above this line.

        //Locators
        By acceptAll = By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]");
        By ViewingDropdown = By.xpath("/html/body/app-root/div/header/app-header-container/app-desktop-header/div/nav/div[1]/div[3]/div[1]");
        By AvailableToViewForRent = By.xpath("/html/body/app-root/div/header/app-header-container/app-desktop-header/div/nav/div[1]/div[3]/div[2]/div[2]/a");
        By CountyRegionDropdown = By.xpath("//*[@id=\"sel_region_dropdown\"]/span[2]");
        By Search = By.xpath("//*[@id=\"sel_region_dropdown\"]/div/div/div[1]/input");
        By DublinAll = By.xpath("//*[@id=\"sel_region_dropdown\"]/div/div/div[2]/div[1]");
        By AreasDropdown = By.xpath("//*[@id=\"sel_locality_dropdown\"]");
        By SearchArea = By.xpath("//*[@id=\"searchInput\"]");
        By Dublin4 = By.xpath("//*[@id=\"sel_locality_dropdown\"]/div[1]/div/div[2]/div[2]/div[2]/div[4]/app-mh-check-box/div/div[2]");
        By Done = By.xpath("//*[@id=\"sel_locality_dropdown\"]/div[1]/div/div[1]/app-mh-button[2]/button/span");
        By MaxPriceDropDown = By.xpath("//*[@id=\"sel_max_price_dropdown\"]");
        By Price = By.xpath("//*[@id=\"sel_max_price_dropdown\"]/div/div/div/div[26]");
        By TypeDropDown = By.xpath("//*[@id=\"sel_property_type_dropdown\"]");
        By SearchTypeProperty = By.xpath("//*[@id=\"sel_property_type_dropdown\"]/div/div/div[1]/div[2]/input");
        By Apartment = By.xpath("//*[@id=\"sel_property_type_dropdown\"]/div/div/div[2]/div/app-mh-check-box/div/div[2]");
        By done2 = By.xpath("//*[@id=\"sel_property_type_dropdown\"]/div/div/div[1]/div[1]/app-mh-button[2]/button/span");
        By StartDate = By.xpath("//*[@id=\"sel_start_date\"]");
        By SelectStartDate = By.xpath("//*[@id=\"sel_start_date\"]/div/div/ngb-datepicker/div[2]/div/ngb-datepicker-month/div[3]/div[4]/div");
        By EndDate = By.xpath("//*[@id=\"sel_end_date\"]");
        By SelectEndDate = By.xpath("//*[@id=\"sel_end_date\"]/div/div/ngb-datepicker/div[2]/div/ngb-datepicker-month/div[5]/div[4]/div");
        By Search2 = By.xpath("//*[@id=\"sel_search_button\"]/span");

        try {
           // lunch chrome and go to url
            driver.get("https://myhome.ie");
            driver.findElement(acceptAll).click();
            Thread.sleep(2000);
            driver.findElement(ViewingDropdown).click();
            driver.findElement(AvailableToViewForRent).click();
            driver.findElement(CountyRegionDropdown).click();
            driver.findElement(Search).sendKeys("Dublin");
            driver.findElement(DublinAll).click();
            Thread.sleep(5000);
            driver.findElement(AreasDropdown).click();
            driver.findElement(SearchArea).sendKeys("Dublin");
            driver.findElement(Dublin4).click();
            driver.findElement(Done).click();
            Thread.sleep(2000);
            driver.findElement(MaxPriceDropDown).click();
            driver.findElement(Price).click();
            Thread.sleep(2000);
            driver.findElement(TypeDropDown).click();
            driver.findElement(SearchTypeProperty).sendKeys("Apartment");
            driver.findElement(Apartment).click();
            driver.findElement(done2).click();
            driver.findElement(StartDate).click();
            driver.findElement(SelectStartDate).click();
            Thread.sleep(2000);
            driver.findElement(EndDate).click();
            driver.findElement(SelectEndDate).click();
            driver.findElement(Search2).click();




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
