package com.cydeo.day_01_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {

        //1- Setting up the web driver manager
        WebDriverManager.chromedriver().setup();

        //2- Create the instance of Chrome browser driver
        WebDriver driver = new ChromeDriver();

        //3- Test if driver and browser are working as expected
          driver.get("https://www.google.com/");//goto www.google.com    https://www.google.com/    WebDriver class has .get("URL")
//        Thread.sleep(5000);
        //driver.findElement(By.xpath("//button[@id='L2AGLb']/div")).click();

        // https://www.tesla.com/   driver get("URL")
        driver.get("https://www.tesla.com/");

    }
}
