package pageobject.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddOwnerPage {

    @FindBy(xpath = "//a[@class='btn btn-default']")
    private WebElement click0nAddOwnerbutton;

    public void clickAddOwnerbutton()
    {
        click0nAddOwnerbutton.click();
    }
}






