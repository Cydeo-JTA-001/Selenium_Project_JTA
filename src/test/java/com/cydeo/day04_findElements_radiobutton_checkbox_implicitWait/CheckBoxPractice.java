package com.cydeo.day04_findElements_radiobutton_checkbox_implicitWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CheckBoxPractice {
    public static void main(String[] args) {

        //   TC#3: Checkboxes

        //setup chrome driver
        WebDriverManager.chromedriver().setup();
        //open a browser,
        WebDriver driver=new ChromeDriver();

        //browser window maximize
        driver.manage().window().maximize();

        //implicitly wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //   1. Go to https://practice.cydeo.com/checkboxes
        driver.get("https://practice.cydeo.com/checkboxes");
     //   2. Confirm checkbox #1 is NOT selected by default
        WebElement checkbox1=driver.findElement(By.name("checkbox1"));
        System.out.println("checkbox1.isSelected() confirm false= " + checkbox1.isSelected());

        //    3. Confirm checkbox #2 is SELECTED by default.
        WebElement checkbox2=driver.findElement(By.id("box2"));
        System.out.println("checkbox2.isSelected() confirm true= " + checkbox2.isSelected());

        //   4. Click checkbox #1 to select it.
        //    5. Click checkbox #2 to deselect it.
        //    6. Confirm checkbox #1 is SELECTED.
        //    7. Confirm checkbox #2 is NOT selected.


        driver.quit();

    }
}
