package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends BasePage {
    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#price_label")
    public WebElement price;

    @FindBy(css = ".g-rating-reviews .hidden meta:nth-child(1)")
    public WebElement starCount;

    @FindBy(css = ".g-rating-reviews .hidden meta:nth-child(5)")
    public WebElement reviewCount;

}
