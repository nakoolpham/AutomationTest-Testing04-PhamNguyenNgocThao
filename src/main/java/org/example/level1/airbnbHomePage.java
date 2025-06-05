package org.example.level1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class airbnbHomePage {
    static Logger logger = LogManager.getLogger("Cấp độ 1 - Bài tập 2");
    private By loca1 = By.xpath("//span[normalize-space()='airbnb']");
    private By loca2 = By.xpath("//a[normalize-space()='Home']");
    private By loca3 = By.xpath("//a[normalize-space()='About']");
    private By loca4 =  By.xpath("//img[contains(@class,'h-10')]");
    private By loca5 =  By.xpath("//div[contains(@class,'py-3 flex flex-col justify-center items-center cursor-pointer')]");
    private By loca6 =  By.xpath("//div[contains(@class,'flex-col justify-center items-center cursor-pointer relative')]");
    private By loca7 = By.xpath("//div[contains(@class,'relative gap-3')]");
    private By loca8 =  By.xpath("//button[normalize-space()='+']");
    private By loca9 = By.xpath("//button[normalize-space()='-']");
    private By loca10 =  By.xpath("//a[@href='/rooms/ho-chi-minh']//div[contains(@class,'ant-card-hoverable w-full flex ')]");
    private By loca11 = By.xpath("//h2[contains(text(),'Cần Thơ')]");
    private By loca12 = By.xpath("//button[contains(text(),'Loại nơi ở')]");
    private By loca13 = By.xpath("//button[normalize-space()='Giá']");
    private By loca14 = By.xpath("//a[@href='/rooms/nha-trang']//p[@class='text-gray-700 text-sm']");
    public void Prac2() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions actions = new Actions(driver);

        try {
            Thread.sleep(1000);
            driver.get(Constants.LINK_PRAC_2);
            logger.info("Đã truy cập vào website: " + Constants.LINK_PRAC_2);
            logger.info("✅ " + Constants.LOGIN_SUCCESS);

            WebElement element = driver.findElement(By.xpath("//div[@class='container py-10 relative ']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            Thread.sleep(500);

            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(loca1))).click();
            logger.info( Constants.LOCATOR_1 + loca1.toString());
            Thread.sleep(1000);

            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(loca2))).click();
            logger.info( Constants.LOCATOR_2 + loca2.toString());
            Thread.sleep(1000);

            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(loca3))).click();
            logger.info( Constants.LOCATOR_3 + loca3.toString());
            Thread.sleep(1000);

            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(loca4))).click();
            logger.info( Constants.LOCATOR_4 + loca4.toString());
            Thread.sleep(1000);

            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(loca5))).click();
            logger.info( Constants.LOCATOR_5 + loca5.toString());
            Thread.sleep(1000);

            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(loca6))).click();
            logger.info( Constants.LOCATOR_6 + loca6.toString());
            Thread.sleep(1000);

            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(loca7))).click();
            logger.info( Constants.LOCATOR_7 + loca7.toString());
            Thread.sleep(1000);

            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(loca8))).click();
            logger.info( Constants.LOCATOR_8 + loca8.toString());
            Thread.sleep(1000);

            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(loca9))).click();
            logger.info( Constants.LOCATOR_9 + loca9.toString());
            Thread.sleep(1000);

            WebElement HoChiMinhCard = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(loca10)));
            actions.moveToElement(HoChiMinhCard);
            actions.perform();
            logger.info( Constants.LOCATOR_10 + loca10.toString());
            Thread.sleep(1000);

            WebElement titleCard = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(loca11)));
            actions.moveToElement(titleCard);
            actions.perform();
            logger.info( Constants.LOCATOR_11 + loca11.toString());
            Thread.sleep(1000);

            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(loca12))).click();
            logger.info( Constants.LOCATOR_12 + loca12.toString());
            Thread.sleep(1000);

            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(loca13))).click();
            logger.info( Constants.LOCATOR_13 + loca13.toString());
            Thread.sleep(1000);

            WebElement aboutTime = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(loca14)));
            actions.moveToElement(aboutTime);
            actions.perform();
            logger.info( Constants.LOCATOR_14 + loca14.toString());
            Thread.sleep(1000);

            //driver.close();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            driver.quit();
        }
    }
}
