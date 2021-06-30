package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.List;
import java.io.PrintWriter;
import java.io.IOException;

public class LinkScraper {

    public static void main(String[] args) throws IOException {


        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);

        WebDriver driver = new ChromeDriver(options);
        driver.get("http://eli.am");
        driver.manage().window().maximize();

        int linkCounter = 1;
        List<WebElement> Links = driver.findElements(By.tagName("a"));
        PrintWriter output = new PrintWriter("links.txt");

        for(WebElement link:Links){
            output.println(linkCounter + " " + link.getText() + "\n" + link.getAttribute("href"));
            output.println("-----------------------");
            linkCounter ++;
        }
        output.close();
        driver.quit();

    }


}
