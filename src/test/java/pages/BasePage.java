package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;


    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public  <T> T createPage(Class<T> pageClass){
        return PageFactory.initElements(driver,pageClass);
    }


    public String getTextByJavascript( WebElement element) {
        String script = "var element = arguments[0]; " + "return element.getAttribute('content');";
        return (String) ((JavascriptExecutor)driver).executeScript(script, element);
}
}
