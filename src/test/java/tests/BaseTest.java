package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    static final String URL = "http://localhost:8080/owners/find";
    WebDriver driver;

    public void CreateWebdriver (){
        System.setProperty("webdriver.chrome.driver", "/home/waldemar/Downloads/NewDeal/infoshare_spring_petclinic/src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get(URL);

    }

    public void closeSession(){
        driver.close();
    }
}
