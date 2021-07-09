

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test1 {
    @Test(priority=1)
    public void print(){
        System.out.println("\nMy name is Birhanu");
    }

          @Test(description = "Login with Admin- browser + browserNameVariable")
        public void test(){
            for (int i=1;i<=10;i++){
                System.out.println(i);
            }
            WebDriver driver= new ChromeDriver();
            driver.get("https://www.google.com");
            String x=driver.getTitle();
            System.out.println(x);
            driver.close();
        }
    }

