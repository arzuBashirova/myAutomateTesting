import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testAmazon {

    public static void main(String[] args) {

        //believe in yourself. we will do it ins!

        WebDriver driver= new ChromeDriver();

        driver.get("https://www.amazon.com/");


        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

        String searchTerm ="kids toys";
        String expectedTitle="Amazon.com : "+ searchTerm;

        searchBox.sendKeys(searchTerm, Keys.ENTER);

        String actualTitle = driver.getTitle();

        if(actualTitle.equalsIgnoreCase(expectedTitle)){

            System.out.println("PASSED.");
        }else{
            System.out.println("Test Failed. The current Title is "+actualTitle);
        }
    }
}
