package com.cydeo.day04_findElements_radiobutton_checkbox_implicitWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RadioButton_Practice {
    public static void main(String[] args) throws InterruptedException {
        //setup chrome driver
        WebDriverManager.chromedriver().setup();
        //open a browser,
        WebDriver driver=new ChromeDriver();

        //browser window maximize
        driver.manage().window().maximize();
        // navigate to Cydeo Practice page
        driver.get("https://practice.cydeo.com/radio_buttons");

        //implicitly wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement blue_radio_btn=driver.findElement(By.xpath("//input[@id='blue']"));
        blue_radio_btn.click();
        Thread.sleep(3000);

        //click another radio button-- lets make it red
        WebElement red_radio_btn=driver.findElement(By.xpath("//input[@id='red']"));
        red_radio_btn.click();
        Thread.sleep(1000);
        //check blue is clicked or not?
        // isSelected()  --- true   if not selected false

        System.out.println("blue_radio_btn.isSelected() expected false = " + blue_radio_btn.isSelected());

        Thread.sleep(1000);


        //close the driver
        driver.quit();
    }
}
