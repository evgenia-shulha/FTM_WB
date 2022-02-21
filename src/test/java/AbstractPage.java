import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class AbstractPage {
    protected final int WAIT_TIMEOUT_SECOND = 50;
    protected WebDriver driver;

    protected AbstractPage(WebDriver element) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    protected void waitForElementVisibility(WebElement element) {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECOND).until(ExpectedConditions.visibilityOf(element));
    }
    protected List<WebElement> waitForVisibilityOfAllElements(List<WebElement>element) {
        return new WebDriverWait(driver, WAIT_TIMEOUT_SECOND).until(ExpectedConditions.visibilityOfAllElements(element));
    }
    protected abstract AbstractPage openPage(String text);

    public abstract Object clickOnLoupeImage();
}
