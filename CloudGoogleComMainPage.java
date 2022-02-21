import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.naming.directory.SearchResult;
import javax.swing.*;

public class CloudGoogleComMainPage extends AbstractPage{
    @FindBy(xpath = "//input[@class='devsite-search-field devsite-search-query']" )
    private WebElement loupeimage;

    @FindBy(xpath = "//div[@class='devsite-searchbox']/input" )
    private WebElement searchField;

    public CloudGoogleComMainPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected static AbstractPage openPage(String text) {
        driver.get(page);
        return this;
    }
    public CloudGoogleComMainPage clickOnLoupeImage(){
        waitForElementVisibility(searchField);
        searchField.sendKeys(text);
        new Actions(driver)
                .sendKeys(Keys.ENTER)
                .click()
                .build()
                .perform();
        return new SearchResultsForPage(driver);
    }
}

