package pageobject.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindOwnerPage
{
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement click0nFindOwnerbutton;

    @FindBy(linkText = "//a[@href='/owners/1']")
    private WebElement GeorgeFranklinName;

    public void clickFindOwnerbutton()
    {
        click0nFindOwnerbutton.click();
    }
}






