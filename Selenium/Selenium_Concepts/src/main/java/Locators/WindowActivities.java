package Locators;

import org.openqa.selenium.WebDriver;

public class WindowActivities extends BaseClass {

public static void main(String[] args) {
    WebDriver driver = launchBrowser();
    driver.manage().window().maximize();
    driver.get("http://google.com");
    driver.navigate().to("https://rahulshettyacademy.com");
    driver.navigate().back();
    driver.navigate().forward();
    driver.quit();
}
}

