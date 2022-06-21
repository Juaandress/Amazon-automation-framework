package actions;

import org.openqa.selenium.WebDriver;
import steps.CommonSteps;

public class CommonActions {

    private WebDriver driver;

    CommonSteps commonSteps;

    public CommonActions(CommonSteps commonSteps){
        this.driver = commonSteps.getDriver();
    }

    public void goToUrl(String url){
        driver.get(url);
    }

    public String getCurrentPageUrl(){
        return driver.getCurrentUrl();
    }

    public void maximizeWindow(){
        driver.manage().window().maximize();
    }

    public void quitWebDriver(){
        driver.quit();
    }

}
