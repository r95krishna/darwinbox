package TestBase;

import TestUtils.TestUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class TestBase {

    public static WebDriver driver;
    public static Properties prop;

    {
        prop = new Properties();
        FileInputStream fi = null;
        try {
            fi = new FileInputStream("//home//rahul//IdeaProjects//darwinboxAssignment//src//main//java//Properties//config.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            prop.load(fi);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @BeforeSuite(alwaysRun = true)
    public void initialisation() {
        String browserName = prop.getProperty("browserName");
        String url = prop.getProperty("url");
        System.out.println(browserName+" "+" "+url);

        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "//home//rahul//Downloads//chromedriver_linux64//chromedriver");

            driver = new ChromeDriver();

            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(TestUtils.implicit_wait, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(TestUtils.page_load_time, TimeUnit.SECONDS);
            driver.get("https://www.cleartrip.com/");

        }
    }
}