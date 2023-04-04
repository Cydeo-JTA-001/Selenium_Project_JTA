package com.cydeo.day_02_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class idClassNameTagNameLocators {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://library2.cydeo.com/login.html");
        driver.manage().window().maximize();


        //locate username inputbox with className locator
        driver.findElement(By.className("form-control")).sendKeys("student11@library");

        //locate password inputbox with id locator
        driver.findElement(By.id("inputPassword")).sendKeys("libraryUser");
        //wait a little
        Thread.sleep(5000);

        //locate logIn button with tagName locator
        driver.findElement(By.tagName("button")).click();


    }
}
