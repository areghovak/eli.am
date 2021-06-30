package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.DriverCreator;

public class BasePage {
    BasePage() {
        PageFactory.initElements(DriverCreator.getDriver(), this); }

        boolean isElementDisplayed(WebElement element) {
        boolean result = true;
        try {
            element.isDisplayed();
        } catch (NoSuchElementException e) {
            result = false;
            e.printStackTrace();
        }
        return result;
        }
        void sleep(int sec) {
        try{
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }

}
