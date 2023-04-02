package com.cydeo.day01_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigation {
    public static void main(String[] args) throws InterruptedException {

        //1- Setting up the web driver manager
        WebDriverManager.chromedriver().setup();

        //2- Create the instance of Chrome browser driver
        WebDriver driver = new ChromeDriver();

        //3- Test if driver and browser are working as expected
        driver.get("https://www.google.com");  //www.google.com
        Thread.sleep(1000);
        //driver.findElement(By.xpath("//button[@id='L2AGLb']/div")).click();

        driver.get("https://www.tesla.com");
        Thread.sleep(1000);
        //4- Navigate back
        driver.navigate().back();
        Thread.sleep(1000);

        //5- Navigate forward

        driver.navigate().forward();
        Thread.sleep(1000);


        //6- Refresh the page

        driver.navigate().refresh();
        Thread.sleep(1000);

        //7- Maximize the window
        driver.manage().window().maximize();
        Thread.sleep(1000);

        // 8- Fullscreen the window

        driver.manage().window().fullscreen();

        //----------------------------------------------------------

        // 9-- minimize the window

        driver.manage().window().minimize();

        //10-- Get current URL
        // getCurrentURL() returns String
        String currentURL=driver.getCurrentUrl();

        System.out.println("currentURL = " + currentURL);

        //11- navigate to google and get currenturl

        driver.get("https://www.google.com");

        String currentURL2=driver.getCurrentUrl();
        System.out.println("currentURL2 = " + currentURL2);


        //12- get title of the page

        String pageTitle = driver.getTitle();
        System.out.println("pageTitle = " + pageTitle);

        //13- navigate back to Tesla and get page title

        driver.navigate().back();
        String pageTitle2 = driver.getTitle();
        System.out.println("pageTitle2 = " + pageTitle2);

        //14- show navigate to method
        // get page URL and get page title
        // get page source

        //driver.get("")  driver.navigate().to("")

        driver.navigate().to("https://www.nasa.gov/");
        String pageTitle3 = driver.getTitle();
        String currentUrl3 = driver.getCurrentUrl();
        String pageSource = driver.getPageSource();

        System.out.println("pageTitle3 = " + pageTitle3);
        System.out.println("currentUrl3 = " + currentUrl3);
        System.out.println("pageSource = " + pageSource);


    }
}
