package selenium_AutoIt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadDirectly_Selenium {
	 public static void main(String[] args) throws Exception {

	        WebDriver driver = new ChromeDriver();
	        driver.get("https://pdf2doc.com/");
	        driver.manage().window().maximize();

	        Thread.sleep(3000);
	        WebElement upload = driver.findElement(By.xpath("//input[@type='file']"));
	        upload.sendKeys("C:\\Users\\User\\Downloads\\Plagiarism_Reduction_Report.pdf");

	        Thread.sleep(8000);

	        System.out.println("File Uploaded Successfully");

	        driver.quit();
	    }
	}