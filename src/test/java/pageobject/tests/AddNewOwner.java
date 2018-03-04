package pageobject.tests;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;




public class AddNewOwner {

    private static final String URL = " http://localhost:8080/";
    private WebDriver driver;



    @Before
    public void setUp() {


        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1440, 900));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(URL);


    }

    @Test
    public void addToSearch_bb() {


    }



    @After

    public void tearDown() {
        driver.close();
    }
}
