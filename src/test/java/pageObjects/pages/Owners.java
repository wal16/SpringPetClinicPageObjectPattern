package pageObjects.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Owners {


    @FindBy(xpath = "//a[@href='/owners/new']")
    private WebElement buttonToAddOwner;

    @FindBy(xpath = "//button[@class='btn btn-default'][@type='submit']")
    private WebElement addOwnerSubmitted;

    @FindBy(xpath = "//input[@id='firstName']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='lastName']")
    private WebElement lastName;

    @FindBy(xpath= "//input[@id='address']")
    private WebElement addressOwner;

    @FindBy(xpath= "//input[@id='city']")
    private WebElement cityOwner;

    @FindBy(xpath= "//input[@id='telephone']")
    private WebElement telephoneOwner;

    public WebElement getNameOwner() {
        return nameOwner;
    }

    public WebElement getOwnerInformation() {
        return OwnerInformation;
    }

    @FindBy (xpath = "//h2[contains(text(),'Owner Information')]")
    private WebElement OwnerInformation;

    @FindBy(xpath = "//tbody/tr/td/b")
    private WebElement nameOwner;

    public void buttonToAddOwnerClick(){buttonToAddOwner.click();}
    public void addOwnerClick(){ addOwnerSubmitted.click(); }

    public void setDataForNewOwner(String name, String lastname, String address, String city, String telephone){
        firstName.sendKeys(name);
        lastName.sendKeys(lastname);
        addressOwner.sendKeys(address);
        cityOwner.sendKeys(city);
        telephoneOwner.sendKeys(telephone);

    }

}
