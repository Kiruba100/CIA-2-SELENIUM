package QES3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ex3 {
public static void main(String args[]) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.navigate().to("https://www.trivago.in/");
		driver.manage().window().maximize();
		WebElement hotel=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/ul/li[2]/span/label"));
		hotel.click();
		WebElement img=driver.findElement(By.xpath("//*[@id=\"tab-list119822-destination\"]/span"));
		img.click();
		WebElement click=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/article/div[4]/div/div/ul/li/div/ul/li/a/span/span[1]/span[1]"));
		click.click();
		WebElement inside=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section/div/div/ol/li[1]/div/article/div[2]/div[2]/div[1]/div/div[3]/div[2]/button/span/span[1]"));
		inside.click();
		WebElement ion=driver.findElement(By.xpath("//*[@id=\"room0\"]/div[2]/div[1]/div[2]/div/div/div[2]/a"));
		ion.click();
		WebElement ion1=driver.findElement(By.xpath(""));
		ion1.click();
		
		
}
}
