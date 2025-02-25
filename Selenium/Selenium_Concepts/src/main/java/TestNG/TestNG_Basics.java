package TestNG;

import Locators.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestNG_Basics extends BaseClass {

    @Test
    public void Demo() {
        System.out.println("Hello");
    }

    @Test
    public void secondTest() {
        System.out.println("Bye");
    }

}