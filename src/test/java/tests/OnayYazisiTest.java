package tests;

import org.testng.annotations.Test;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class OnayYazisiTest {

    @Test
    public void onayYazisiTesti (){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        UserHomePage userHomePage=new UserHomePage();
        userHomePage.regname.sendKeys(ConfigReader.getProperty("isim"));
        userHomePage.regmail.sendKeys(ConfigReader.getProperty("mail"));
        userHomePage.regpass.sendKeys(ConfigReader.getProperty("pass"));
        userHomePage.regbutton.click();
        userHomePage.regonay.isDisplayed();








    }

}
