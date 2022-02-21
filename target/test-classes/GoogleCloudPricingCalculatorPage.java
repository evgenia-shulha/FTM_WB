import javafx.scene.layout.Region;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleCloudPricingCalculatorPage extends AbstractPage {

    public static Region get;
    @FindBy(xpath = "//div[text()='Compute Engine']")
    private WebElement computerEngineSection;

    @FindBy(xpath = "//h2[text()='Instances']");
    private WebElement numberOfInstanceField;

    public GoogleCloudPricingCalculatorPage(WebDriver driver) {
        super(driver);

    }
    protected GoogleCloudPricingCalculatorPage(WebDriver element) {
        super(element);
    }

    @Override
    protected AbstractPage openPage(String text) {
        return null;
    }
    public GoogleCloudPricingCalculatorPage clickComputeEngineSection(){
        waitForElementVisibility(numberOfInstanceField);
        numberOfInstanceField.click();
        numberOfInstanceField.sendKeys("4");
        return this
    }
}
