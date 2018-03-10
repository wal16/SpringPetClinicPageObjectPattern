package tests;
import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.loader.LoaderType;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.pages.Owners;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = { "/home/waldemar/Downloads/NewDeal/infoshare_spring_petclinic/src/test/resources/AddOwnersFromFile.xml" }, loaderType = LoaderType.XML, writeData = false)

public class AddOwnersFromFile extends BaseTest{

    private Owners owner;

    @Before
    public void setUp(){

        CreateWebdriver();
        owner = PageFactory.initElements(driver, Owners.class);
    }

    @Test
    public void AddOwnerFromFile(@Param(name="firstName") String name,
                                 @Param(name="lastName") String lastName,
                                 @Param(name="address")String address,
                                 @Param(name="city")String city,
                                 @Param(name="telephone")String telephone,
                                 @Param(name="nameField") String nameField){

        owner.buttonToAddOwnerClick();
        owner.setDataForNewOwner(name,lastName,address,city,telephone);
        owner.addOwnerClick();
        assertThat(owner.getNameOwner().getText().contains(nameField));
    }
    @After
    public void tearDown(){
        closeSession();
    }

}
