
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {

 public static void main(String [] args) {
  System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");

  WebDriver driver = new ChromeDriver();


  WebElement element1 = driver.findElement(By.id("user_1_"));
  element1.click();

  WebElement element2 = driver.findElement(By.cssSelector(" .login-form__link[data-tracking-label=\"ÜyeOl\"]"));
  element2.click();

  WebElement element3 = driver.findElement(By.cssSelector("#RegisterFormView_RegisterEmail"));
  String username="murat";
  element3.sendKeys(username);

  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// ilgili işlemin tamamlanmasını bekler.


  WebElement element4 = driver.findElement(By.cssSelector("#RegisterForm > div > div.input-text.invalid > span.field-validation-error"));

  String gecersizemail = element4.getText();



  System.out.println(gecersizemail);


  WebElement element5 = driver.findElement(By.cssSelector("#RegisterFormView_Password"));
  String password="Murat123";
  element5.sendKeys(password);

  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// ilgili işlemin tamamlanmasını bekler.



  WebElement element6 = driver.findElement(By.cssSelector("#RegisterForm > div > div:nth-child(7) > span.field-validation-error"));


  String gecersizparola=element6.getText();
  System.out.println(gecersizparola);


  WebElement element7 = driver.findElement(By.cssSelector("#RegisterForm > div > div.input-helper"));
  String parolakriteri = element7.getText();
  System.out.println(parolakriteri);


 }
}
