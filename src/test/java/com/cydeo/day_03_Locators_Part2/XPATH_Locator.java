package com.cydeo.day_03_Locators_Part2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPATH_Locator {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");

        driver.manage().window().maximize();

        WebElement usernameInput = driver.findElement(By.xpath("//input[@id='user_login']"));
        usernameInput.sendKeys("wrongUsername");

        WebElement passwordInput = driver.findElement(By.xpath("//input[@id='user_password']"));
passwordInput.sendKeys("somePassword");

        WebElement loginButton = driver.findElement(By.xpath("//input[contains(@name,\"submit\")]"));
        loginButton.click();


        WebElement warmingMessage = driver.findElement(By.xpath("//*[contains(text(), \"Login and/or password are wrong\")]"));
        System.out.println("warning message = "+warmingMessage.getText());


        if(warmingMessage.isDisplayed()){
            System.out.println("user entered smth wrong");
        }else{
            System.out.println("User logged in");
        }


    }

}
