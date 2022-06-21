package actions;

import elements.HomePageElements;
import org.openqa.selenium.WebDriver;
import steps.CommonSteps;

public class HomePageActions {

    WebDriver driver;
    HomePageElements homePageElements;

    public HomePageActions(CommonSteps commonSteps){
        this.driver = commonSteps.getDriver();
        homePageElements = new HomePageElements(driver);
    }


    public void clickAdvancedLink(){
        homePageElements.advancedSearchButton.click();
    }
}
