/*
 * Author Kristin Smith
 * Date Modified June 1, 2019
 */

package com.kristinsmith.wd_webdriver;

import org.openqa.selenium.By;
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
        
        //Close the browser
        driver.quit();
    }
    
}
