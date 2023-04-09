package com.cydeo.day_03_Locators_Part2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextGetAttribute {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("https://login1.nextbasecrm.com/");

        driver.manage().window().maximize();
        String expectedText = "Remember me on this computer";
        WebElement rememberText = driver.findElement(By.className("login-item-checkbox-label"));


        //String actualtext = driver.findElement(By.className("login-item-checkbox-label")).getText();

        String actualtext = rememberText.getText();

        System.out.println("actualtext = " + actualtext);

        if (actualtext.equals(expectedText)){
            System.out.println("Text verification Passed!!");
        }else{
            System.out.println("Text verification failed!!");
        }


        System.out.println("value of class attribute= "+rememberText.getAttribute("class"));


    }

}
