package pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = ".rz-header-search-input-text.passive")
    public WebElement searchFiled;

    public  void searchProduct(String article){
        searchFiled.sendKeys(article, Keys.ENTER) ;
    }


}
