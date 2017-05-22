package tests;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;
import pages.HomePage;
import utils.Convert;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class BaseTest {
     protected static WebDriver driver;
     protected BasePage page;
     protected HomePage homePage;
     protected WebDriverWait wait = new WebDriverWait(driver,10);
     protected double courseUSD;

    protected static String baseUrl = "http://rozetka.com.ua";


    @BeforeClass
        public static void beforeClass() {
            initialization();
        }

       @Before
        public void before() {
           //courseUSD = Convert.currentUSD();
           courseUSD = Convert.setCurrentUSD(26.5);
           open(baseUrl);
           page = new BasePage(driver);
           homePage = page.createPage(HomePage.class);

       }

        @AfterClass
        public static void after() {
            driver.quit();
        }

    private static void initialization() {
        System.setProperty("webdriver.gecko.driver",
                "C:\\RozetkaTask-master\\RozetkaTask-master\\src\\resource\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

        public static void open(String url){
            driver.get(url);
        }


    }



