/*
 * Author Kristin Smith
 * Date Modified June 1, 2019
 */

package com.kristinsmith.wd_webdriver;

import java.util.List;
import java.util.Set;
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
        By post = By.className("post_box");
        List<WebElement> posts = driver.findElements(post);
        WebElement toppost = posts.get(0);
        toppost.click();
        
        //Hit the Donate button. Switch focus to Network for Good Screen and check for submit button using xpath
        By button = By.xpath("//a[@href='https://walkdenver.networkforgood.com/projects/21200-support-our-mission']");
        WebElement donatebutton= driver.findElement(button);
        donatebutton.click();
        
        
        //Working on validating text in new window
        /*String parentWindow = driver.getWindowHandle();
        Set<String> handles =  driver.getWindowHandles();
        for(String windowHandle  : handles)
            {
            if(!windowHandle.equals(parentWindow))
               {
                    driver.switchTo().window(windowHandle);//Script fails here. Add in an explicit wait to make sure the second window is loaded before text search
                    WebElement title = driver.findElement(By.xpath("//h1[contains(text(),'streets for people')]"));
                    if ( title != null){
                        System.out.println("Verified donation button takes user to Network for Good");
                    } else {
                        System.out.println("Donation form not found - investigate");
                    }
               }
            }*/

        //Close the browser
        driver.quit();
    }
    
}
