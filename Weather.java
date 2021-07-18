package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Weather {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://weather.com/en-IN/?Goto=Redirected");
        Thread.sleep(5000);
        WebElement textbox = driver.findElement(By.xpath("//*[@id=\"LocationSearch_input\"]"));
        textbox.sendKeys("Delhi");
        Thread.sleep(1000);
        textbox.sendKeys(Keys.ENTER);
        //driver.findElement(By.xpath("//*[@id=\"WxuHeaderLargeScreen-header-9944ec87-e4d4-4f18-b23e-ce4a3fd8a3ba\"]/header/div/div[2]/div[1]/div/div[1]/svg")).click();

    }
}
