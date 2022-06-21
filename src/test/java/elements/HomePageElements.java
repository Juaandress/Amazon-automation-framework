package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageElements {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"gh-as-a\"]")
    public WebElement advancedSearchButton;


    public HomePageElements(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


}
