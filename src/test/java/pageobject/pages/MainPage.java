package pageobject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {

    @FindBy(xpath = "//*[@id='main-navbar']/ul/li[3]/a/span[2]")
    private WebElement clickOnFindOwnersbutton;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement FindOwnerbutton;

    @FindBy(linkText = "//a[@href='/owners/1']")
    private WebElement GeorgeFranklinName;
}
