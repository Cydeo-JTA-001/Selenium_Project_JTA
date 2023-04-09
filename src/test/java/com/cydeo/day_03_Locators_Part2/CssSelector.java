package com.cydeo.day_03_Locators_Part2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("https://login1.nextbasecrm.com/");

        driver.manage().window().maximize();

        WebElement userNameInput = driver.findElement(By.cssSelector("input[type='text']"));
        userNameInput.sendKeys("incorrectUsername");

        WebElement passwordinput = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        passwordinput.sendKeys("incorrectPassword");

        WebElement rememberMeCheckBox = driver.findElement(By.cssSelector("input#USER_REMEMBER"));
        rememberMeCheckBox.click();

        Thread.sleep(2000);
        WebElement logInButton = driver.findElement(By.cssSelector("input.login-btn"));
        logInButton.click();

        String expaectederrorMessage = "Incorrect login or password";

        WebElement errorMessage = driver.findElement(By.cssSelector(".errortext"));
        String actualErrorMessage = errorMessage.getText();
        System.out.println("actualErrorMessage = " + actualErrorMessage);

        if (actualErrorMessage.equals(expaectederrorMessage)){
            System.out.println("Login credentials validation error message PASS!!");
        }else{
            System.out.println("Login credentials validation error message Fail!!");
        }


    }

}
