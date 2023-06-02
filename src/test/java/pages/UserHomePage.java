package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserHomePage {

    public UserHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    //Registration Name Textbox
    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement regname;

    //Registration Email Textbox
    @FindBy(xpath="//input[@type='email']")
    public WebElement regmail;

    //Registration pass Textbox
    @FindBy(xpath="//input[@type='password']")
    public WebElement regpass;

    //Registration button
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement regbutton;

    //Registration Onay
    @FindBy(xpath ="//*[contains(text(), 'Please check your email to verify your registration. Check your spam folder too.')]")
    public WebElement regonay;





    //Home--> Destination/Bangkok experience




}
