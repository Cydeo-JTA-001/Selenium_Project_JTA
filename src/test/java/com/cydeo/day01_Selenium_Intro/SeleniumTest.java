package com.cydeo.day01_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {

        //1- Setting up the web driver manager
        WebDriverManager.chromedriver().setup();

        //2- Create the instance of Chrome browser driver
        WebDriver driver = new ChromeDriver();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("disable-infobars");

        //3- Test if driver and browser are working as expected
        driver.get("https://www.google.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='L2AGLb']/div")).click();
    }
}
