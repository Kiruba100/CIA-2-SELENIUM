package QES1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ex1 {
public static void main(String args[]) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.navigate().to("https://www.trivago.in/");
		driver.manage().window().maximize();
		WebElement loc=driver.findElement(By.xpath("//*[@id=\"input-auto-complete\"]"));
		loc.click();
		Thread.sleep(2000);
		WebElement u2=driver.findElement(By.xpath("//*[@id=\"suggestion-list\"]/ul/li[1]/div/div/div[2]/span[1]/span"));
		u2.click();
		WebElement click=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[1]/fieldset/button[1]/span/span[2]/span[2]"));
		click.click();
		WebElement checkin=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[1]/fieldset/button[1]/span/span[2]/span[2]"));
		checkin.click();
		Thread.sleep(1000);
		WebElement rooms=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[1]/button/span/span[2]/span[2]"));
		rooms.click();
		Thread.sleep(1000);
		WebElement u3=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[1]/fieldset/button[2]/span/span/span[2]"));
		u3.click();
		WebElement u4=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/div[2]/div[2]/button[17]/time"));
		u4.click();
		WebElement u5=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[1]/button/span/span[2]/span[2]"));
		u5.click();
		WebElement search=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/button"));
		search.click();
		WebElement rating=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[2]/div[2]/div/div/div/div[3]/div/button/span/span[1]"));
		rating.click();
		driver.navigate().to("https://www.trivago.in/en-IN/lm/hotels-pondicherry-india?search=200-64948;dr-20230506-20230614");
		WebElement hotel=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[2]/div[2]/div/div/div/div[2]/div/ul/li[2]/div/label"));
		hotel.click();
		Thread.sleep(36000);
		WebElement sort=driver.findElement(By.xpath("//*[@id=\"sorting-selector\"]"));
		sort.click();
		WebElement sort1=driver.findElement(By.xpath("//*[@id=\"sorting-selector\"]"));
		sort1.click();
		Thread.sleep(2000);
		WebElement sort3=driver.findElement(By.xpath("//*[@id=\"topOfPage\"]/div[4]/div/hotel-info/div/div[3]/h1"));
		sort3.click();
		
		WebElement hote3=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/ul/li[2]/span/label"));
		hote3.click();
		WebElement img=driver.findElement(By.xpath("//*[@id=\"tab-list119822-destination\"]/span"));
		img.click();
		WebElement clicks=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/article/div[4]/div/div/ul/li/div/ul/li/a/span/span[1]/span[1]"));
		clicks.click();
		WebElement inside=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section/div/div/ol/li[1]/div/article/div[2]/div[2]/div[1]/div/div[3]/div[2]/button/span/span[1]"));
		inside.click();
		WebElement ion=driver.findElement(By.xpath("//*[@id=\"room0\"]/div[2]/div[1]/div[2]/div/div/div[2]/a"));
		ion.click();
		
}
}