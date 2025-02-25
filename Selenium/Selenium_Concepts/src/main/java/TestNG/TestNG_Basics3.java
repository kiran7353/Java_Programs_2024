package TestNG;

import Locators.BaseClass;
import org.testng.annotations.Test;

public class TestNG_Basics3 extends BaseClass {

    @Test
    public void webLoginCar() {
        System.out.println("weblogincar");
    }

    @Test
    public void mobileLoginCar() {
        System.out.println("mobilelogincar");
    }

    @Test
    public void mobileSignInCar() {
        System.out.println("mobilesignincar");
    }

    @Test
    public void mobileSignOutCar() {
        System.out.println("mobilesiginoutcar");
    }

    @Test
    public void loginAPIcarLoan() {
        System.out.println("APIlogincar");
    }

}