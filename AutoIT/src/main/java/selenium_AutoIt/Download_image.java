package selenium_AutoIt;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Download_image {
	public static void main(String[] args) throws Exception {

		String downloadPath =System.getProperty("user.dir")+ File.separator + "downloads";
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<>();

		prefs.put("download.default_directory", downloadPath);
		prefs.put("download.prompt_for_download", false);
		prefs.put("plugins.always_open_pdf_externally", true);

		options.setExperimentalOption("prefs", prefs);

		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.get("https://demoqa.com/upload-download");

		Thread.sleep(3000);

		driver.findElement(By.id("downloadButton")).click();

		Thread.sleep(5000);

		File file = new File(downloadPath + "\\sampleFile.jpeg" );

		if (file.exists()) {
			System.out.println("File Downloaded Successfully");
		} 
		else {
			System.out.println("Download Failed");
		}

		driver.quit();

	}
}	
