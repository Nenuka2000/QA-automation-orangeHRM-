package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class Main {
    public static void main(String[] args) {
        // Set the system property for ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\v.com\\Downloads\\chromedriver-win32\\chromedriver.exe");

        // 1. Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        //maximize window
        driver.manage().window().maximize();

        // 2. Mention URL
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //wait in login page
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);



        // 3. Find username textbox
        WebElement usernametextbox = driver.findElement(By.name("username"));

        // 4. Enter value
        usernametextbox.sendKeys("Admin");

        // 5. Find password textbox
        WebElement passwordtextbox = driver.findElement(By.name("password"));

        // 6. Enter value
        passwordtextbox.sendKeys("admin123");

        // 7. Find login button
        WebElement loginbtn = driver.findElement(By.xpath("//button[@type='submit']"));

        // 8. Click the button
        loginbtn.click();
    }
}