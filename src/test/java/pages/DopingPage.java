package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DopingPage {
    public DopingPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "/html/body/header/div[4]/div/nav/ul/li[3]/a")
    public WebElement yorumlarVeBasarilarimiz;
    @FindBy(xpath = "/html/body/header/div[4]/div/nav/ul/li[1]/a")
    public WebElement paketlerimiz;
    @FindBy(xpath = "/html/body/main/section[1]/div[1]/div[2]/div[1]")
    public WebElement paketlerBody;
    @FindBy(xpath = "/html/body/div[8]/div[2]/div/div/main/h3")
    public WebElement yorumlarVeBasarilarimizHeader;
}
