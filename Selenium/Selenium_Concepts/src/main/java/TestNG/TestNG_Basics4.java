package TestNG;

import Locators.BaseClass;
import org.testng.annotations.Test;

public class TestNG_Basics4 extends BaseClass {

    @Test
    public void webLoginHome() {
        System.out.println("webloginhome");
    }

    @Test
    public void mobileLoginHome() {
        System.out.println("mobileloginhome");
    }

    @Test
    public void loginAPIHomeLoan() {
        System.out.println("APIloginhome");
    }

}