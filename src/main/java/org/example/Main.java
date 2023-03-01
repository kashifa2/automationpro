package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Main {
    WebDriver driver=null;
    String expectedZipCodeErrorMsg;
    @Test
    public void stateFarmHomePage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.statefarm.com");
    }
    @Test
    public void ValidateInsurancePage56()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.statefarm.com");
        driver.quit();

    }
    @Test
    public void Validate()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.quit();
    }
    @Test
    public void validate78()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.ilovepdf.com");
        driver.quit();//driver.close();
    }
    @Test
    public void ValidateErrorMsg()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.statefarm.com");
        String errorMessage=driver.findElement(By.cssSelector("#qoute-error-alert")).getText();
        System.out.println(errorMessage);
        driver.quit();

    }
    @Test
    public void ValidateInsaurancePagezp()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.statefarm.com");
        driver.findElement(By.id("qoute-main-zip-code-input")).sendKeys( "19047");
        int LengthofZipCode=driver.findElement(By.id("qoute-main-zip-code-input")).getText().length();
        System.out.println(LengthofZipCode);
        Assert.assertEquals(LengthofZipCode, 5);
        driver.quit();

    }
    @Test
    public void validatecarinsurance()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.statefarm.com");
        driver.findElement(By.xpath("//*[@id=\"oneX-header\"]/nav/section[3]/div[1]/div[1]/ul/li[1]/div/button/span"));
        driver.quit();
    }
    @Test
    public void validateCds()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.statefarm.com");
        driver.findElement(By.xpath("//*[@id=\"oneX-submenu-banking\"]/div/div[2]/div[1]/section/ul[1]/li[4]/a"));
        driver.quit();
    }


    @AfterTest
    public void teardown()
    {

    }





}