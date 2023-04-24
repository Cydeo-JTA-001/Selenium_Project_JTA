package com.cydeo.day_01_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverClose {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com");


        // how to close browser
        // 1 driver.close() closes current tab/window
        // 2 driver.quit()

        //Task is try driver.close()

        Thread.sleep(1000);



        //driver.close();

        //Task is try driver.quit();

        driver.quit();






    }
}
