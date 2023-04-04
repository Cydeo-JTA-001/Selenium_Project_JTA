package com.cydeo.day_02_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cydeo.com/");
        driver.manage().window().maximize();


        // driver.findElement(By.linkText("A/B Testing")).click();

        WebElement abTest = driver.findElement(By.linkText("A/B Testing"));
        abTest.click();

        if (driver.getTitle().contains("A/B")) {
            System.out.println("title verification PASS!!");
        } else {
            System.out.println("title verification FAIL!!");
        }

// Go bak to main page again
        driver.navigate().back();
// print and see the title is "Practice"
        System.out.println(driver.getTitle());

// we are using part of the link text, not all of it.
        driver.findElement(By.partialLinkText("A/B")).click();

//verify the title has changed--means that we wer able to click successfully
        if (driver.getTitle().contains("A/B")) {
            System.out.println("title verification PASS!!");
        } else {
            System.out.println("title verification FAIL!!");
        }

    }

}
