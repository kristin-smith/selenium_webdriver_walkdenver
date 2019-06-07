/*
 * Author Kristin Smith
 * Date Modified June 1, 2019
 */

package com.kristinsmith.wd_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {
    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver","/Users/user/Documents/Develop/automation_expert/chromedriver");
        WebDriver driver = new ChromeDriver();
        
        driver.get("http://www.walkdenver.org/");
        
        //Search for "Little Saigon"
        By search = By.id("s");
        WebElement searchbox = driver.findElement(search);
        searchbox.sendKeys("Little Saigon" + Keys.ENTER);
        
        //Click on the First article in the list
        
        //Hit the Donate button
        
        //Switch focus to Network for Good Screen and check for submit button using xpath
        
        //Close the browser
        driver.quit();
    }
    
}
