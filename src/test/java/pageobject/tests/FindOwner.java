package pageobject.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pageobject.pages.FindOwnerPage;
import pageobject.pages.MainPage;

import java.util.concurrent.TimeUnit;

public class FindOwner {
    private static final String URL = " http://localhost:8080/";
    private WebDriver driver;
    private MainPage mainPage;
    private FindOwnerPage findOwnerPage;



    @Before
    public void setUp() {


        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1440, 900));
        mainPage = PageFactory.initElements(driver, MainPage.class);
        findOwnerPage = PageFactory.initElements(driver, FindOwnerPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(URL);


    }

    @Test
    public void findOwner() {

        mainPage.clickFindOwnersbutton();
        findOwnerPage.clickFindOwnerbutton();
        findOwnerPage.clickGeorgeFranklinPerson();

    }



    @After

    public void tearDown() {
        driver.close();
    }
}


