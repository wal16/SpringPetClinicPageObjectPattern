package tests;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.pages.Owners;
import pageObjects.pages.Waits;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(DataProviderRunner.class)
public class AddOwners extends tests.BaseTest {

    private Owners owners;
    private Waits wait;

    @DataProvider
    public static Object[][] testDataforAddOwners() {
        return new String[][] {
                new String[]{"John", "Kennedy", "88888", "White House", "Washington D.C", "777777"},
                new String[]{"Boris", "Jelcyn", "Kremlin", "Moscow", "777777"},
                new String[]{"Winston", "Churchil", "Downing Street", "London", "333333"},
                new String[]{"Ronald", "Regan", "White House", "Washington D.C", "55555"}
        };
    }

    @Before
    public void setUp(){

        CreateWebdriver();
        wait = new Waits();
        owners = PageFactory.initElements(driver, Owners.class);
    }

    @Test
    @UseDataProvider("testDataforAddOwners")
    public void addeddOwnerstest(String Name, String lastName, String address, String city, String telephone){
        owners.buttonToAddOwnerClick();
        owners.setDataForNewOwner(Name, lastName, address,city,telephone);
        owners.addOwnerClick();
        wait.waitForElementToBeVisible(driver, owners.getOwnerInformation());
        assertThat(owners.getNameOwner().getText().contains(Name + " " + lastName));
    }

    @After
    public void tearDown( ){
        closeSession();
    }

}
