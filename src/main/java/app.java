import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class app {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        
       
        driver.navigate().to("https://github.com/MaryamKhan67");
    }
}