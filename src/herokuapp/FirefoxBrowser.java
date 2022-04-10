package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxBrowser {
    public static void main(String[] args) {
        //store the url in String datatype
        String baseUrl = "http://the-internet.herokuapp.com/login";

        //set the property from edgebrowser
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");

        //creating object of webdriver interface
        WebDriver driver = new FirefoxDriver();

        //launch URl
        driver.get(baseUrl);

        //maximize the window
        driver.manage().window().maximize();

        //give the implicity time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //print the title of the page
        System.out.println("Title : " + driver.getTitle());

        //print the current URL
        System.out.println("current url : " + driver.getCurrentUrl());

        //print the page source
        System.out.println("Page source is: " + driver.getPageSource());

        //enter the email to email field
        WebElement emailfield = driver.findElement(By.id("username"));
        emailfield.sendKeys("tomsmith");

        //enter the pssword to password ield
        WebElement passwordfield = driver.findElement(By.name("password"));
        passwordfield.sendKeys("SuperSecretPassword");

        //close browser
        driver.close();
    }
}