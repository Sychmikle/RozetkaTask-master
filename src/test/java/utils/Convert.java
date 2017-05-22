package utils;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tests.BaseTest;

public class Convert extends BaseTest {

    public static double getPriceForConvert(WebElement webElement){
        String currentPrice = webElement.getText();
        double value = Double.parseDouble(currentPrice);
        return value;

    }
    public static double  currentUSD() {
        open("http://minfin.com.ua/currency/banks/usd/");
        String currentUSDs = driver.findElement(By.cssSelector(".mfcur-nbu-full-wrap")).getText();
        double a = Double.parseDouble(currentUSDs );
        return a;

}
    public static double  setCurrentUSD(double courseUSD){
        double a = courseUSD;
        return a;
    }
    public static double priceUA(WebElement webElement){
        double a = Convert.getPriceForConvert(webElement);
        return a;
    }
    public static double priceUSA(WebElement price, double courseUSD){
        double a = Convert.priceUA(price) / courseUSD;
        double b = Math.round(a * 100.0) / 100.0;
        return b;
    }

}

