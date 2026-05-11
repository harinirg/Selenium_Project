package selenium_AutoIt;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Download_PDF {
	public static void main(String[] args) throws InterruptedException {
		String downloadFilePath = System.getProperty("user.dir") + File.separator + "downloads";
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("plugins.always_open_pdf_externally", true);
		prefs.put("download.default_directory", downloadFilePath);
		options.setExperimentalOption("prefs", prefs);
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		WebElement downloadlink = driver.findElement(By.xpath("//a[@type='button']"));
		downloadlink.click();
		File downloadFile = new File(downloadFilePath + File.separator + "samplefile.pdf");
		Thread.sleep(3000);
		if (downloadFile.exists()) {
			System.out.println("File is downloaded!");
		} else {
			System.out.println("File is not downloaded");
		}
		driver.quit();
	}
}


