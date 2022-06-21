package steps;

import actions.CommonActions;
import actions.HomePageActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDefinitions {
    CommonActions commonActions;
    HomePageActions homePageActions;

    public StepDefinitions(CommonActions commonActions, HomePageActions homePageActions){
        this.commonActions = commonActions;
        this.homePageActions = homePageActions;
    }

    @Given("I am on Ebay home page")
    public void iAmOnEbayHomePage() {
        commonActions.goToUrl("https://www.ebay.com");
        commonActions.maximizeWindow();
    }

    @When("I click on Advanced Link")
    public void iClickOnAdvancedLink() {
        homePageActions.clickAdvancedLink();
    }

    @Then("I navigate to Advanced Search Page")
    public void iNavigateToAdvancedSearchPage() {
        String expectedUrl = "https://www.ebay.com/sch/ebayadvsearch";
        String actualUrl = commonActions.getCurrentPageUrl();
        if (!expectedUrl.equals(actualUrl)){
            Assert.fail("Page does not navigate to expected page.");
        }
    }
}
