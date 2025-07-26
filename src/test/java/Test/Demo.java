package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo
{
    public static void main(String[] args) throws InterruptedException {
        //driver initiated
        WebDriver driver = new ChromeDriver();
        //impl wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        //launch URL
        driver.get("https://demo.automationtesting.in/Frames.html");
        //sleep method
        Thread.sleep(100);
        //click on multi frame button
        driver.findElement(By.linkText("Iframe with in an Iframe")).click();
        //Nested frame switch
        WebElement nestedFrame=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
        driver.switchTo().frame(nestedFrame);
         //child frame switch
        WebElement childFrame=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
        driver.switchTo().frame(childFrame);//switch by web element
        //text box web element
        WebElement textBox=driver.findElement(By.xpath("//input[@type='text']"));
       //sending value to text box
        textBox.sendKeys("Kunal");
        Thread.sleep(300);
        System.out.println("Text entered successfully");
    }
}
