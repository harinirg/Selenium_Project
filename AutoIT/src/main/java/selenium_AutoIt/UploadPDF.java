package selenium_AutoIt;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadPDF {
	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://pdf2doc.com/");

		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement file = driver.findElement(By.xpath("//span[text()='UPLOAD FILES']"));
		file.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\User\\Downloads\\AutoItSample\\Upload1.exe");
		Thread.sleep(8000);
		System.out.println("File Uploaded Successfully");

		driver.quit();
	}
}