package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver","C:\\FirefoxDriver\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");

        /*
        Chrome a testy v ňom.
         */
        WebDriver chrome = new ChromeDriver();

        Thread.sleep(2000);

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("-private");

        Thread.sleep(2000);

        chrome.navigate().to("https://czechitas-shopizer.azurewebsites.net/shop/");

        Thread.sleep(2000);

        chrome.manage().window().maximize();

        Thread.sleep(2000);

        chrome.quit();


        /*
        FireForx a testy v ňom.
         */
        WebDriver firefox = new FirefoxDriver();

        Thread.sleep(2000);

        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("-private");

        Thread.sleep(2000);

        firefox.navigate().to("https://czechitas-shopizer.azurewebsites.net/shop/");

        Thread.sleep(2000);

        firefox.manage().window().maximize();
        
        Thread.sleep(2000);

        firefox.quit();
    }
}
