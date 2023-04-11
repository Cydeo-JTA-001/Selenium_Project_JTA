package com.cydeo.day04_findElements_radiobutton_checkbox_implicitWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsPractice {
    public static void main(String[] args) {
        //setup chrome driver
        WebDriverManager.chromedriver().setup();
        //open a browser,
        WebDriver driver=new ChromeDriver();

        //browser window maximize
        driver.manage().window().maximize();
        // navigate to Cydeo Practice page
        driver.get("https://practice.cydeo.com/abtest");
        // locate the links
        List<WebElement> links= driver.findElements(By.xpath("//body//a"));
        //find out how many links are there?
        System.out.println("links.size() = " + links.size());

        //get the text of the links
        for (WebElement link : links) {
            System.out.println("link = " + link.getText());
            System.out.println("link.getAttribute(\"href\") = " + link.getAttribute("href"));
        }
        driver.quit();

    }
}
