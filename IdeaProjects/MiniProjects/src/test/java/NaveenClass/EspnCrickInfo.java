package NaveenClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EspnCrickInfo {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://www.espncricinfo.com/series/dang-cricket-league-2023-24-1422693/deukhuri-warriors-vs-ghorahi-tigers-6th-match-1422702/full-scorecard");
        String batsman = driver.findElement(By.xpath("//span[starts-with(@class,'ds-text-tight-s')]//child::span[text()='Deepak Bohara']")).getText();
        WebElement wiketerName = driver.findElement(By.xpath("//span[starts-with(@class,'ds-text-tight-s')]//child::span[text()='Deepak Bohara']//ancestor::td//following-sibling::td[1]"));
        System.out.println("Batsman is " + batsman +"\n"+ "WiketerName is " + wiketerName.getText());
        driver.quit();

    }
}
