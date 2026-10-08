import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.opencart.com/");
        WebElement loginLink= driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/div/a[1]"));
        loginLink.click();
        WebElement emailField = driver.findElement(By.xpath("//*[@id='input-email']"));
        WebElement passwordField = driver.findElement(By.xpath("//*[@id='input-password']"));
        emailField.sendKeys("anjumafia678@yopmail.com");
        passwordField.sendKeys("jk890");
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"account-login\"]/div[2]/div/div[1]/form/div[3]/div[1]/button[1]"));
        loginButton.click();
        WebElement pinField=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/form/div[1]/div/input"));
        pinField.sendKeys("0839");
        WebElement continueButton=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/form/div[2]/button"));
        continueButton.click();

    }
}