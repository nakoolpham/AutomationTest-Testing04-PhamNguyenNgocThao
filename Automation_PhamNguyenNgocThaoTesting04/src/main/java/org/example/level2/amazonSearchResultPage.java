package org.example.level2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class amazonSearchResultPage {
    static Logger logger = LogManager.getLogger("Cấp độ 2 - Bài tập 3");
    String paramSearch = "adidas";
    public void Prac3(){

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions actions = new Actions(driver);

        try {
            Thread.sleep(1000);
            driver.get(Constants.LINK_PRAC_3);
            logger.info(Constants.LOGIN_SUCCESS);

            //Xác định logo
            WebElement elementLogo = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(
                    By.xpath("//a[@id='nav-logo-sprites']"))));

            boolean isLogoDisplayed = elementLogo.isDisplayed();
            if (isLogoDisplayed) {
                elementLogo.click();
                Thread.sleep(2000);
            } else {
                WebElement elementLogoBK = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(
                        By.xpath("//a[@id='nav-bb-logo']"))));
                elementLogoBK.click();
                Thread.sleep(2000);
            }

            WebElement loca4 = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(
                    By.xpath("//input[@id='twotabsearchtextbox']"))));
            loca4.sendKeys(paramSearch);
            loca4.submit();
            logger.info( Constants.LOCATOR_4 + loca4.toString());
            Thread.sleep(2000);

            WebElement moveToResult = driver.findElement(By.xpath("//h2[normalize-space()='Results']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", moveToResult);
            Thread.sleep(500);

            WebElement loca1 = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(
            By.xpath("(//div[contains(@data-cy,'image-container')])[3]"))));
            logger.info( Constants.LOCATOR_1 + loca1.toString());
            Thread.sleep(1000);

            WebElement loca2 = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(
                    By.xpath("(//div[@data-cy='price-recipe']//following::div[@class='a-section aok-inline-block'])[5]"))));
            logger.info( Constants.LOCATOR_2 + loca2.toString() + loca2.getText());
            Thread.sleep(1000);

            WebElement loca3 = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(
                    By.xpath("(//span[@class='a-price'])[5]"))));
            //(//div[@data-cy='price-recipe']//following::span[@class='a-price'])[5]
            logger.info(Constants.LOCATOR_3 + loca3.toString() + loca3.getText());
            Thread.sleep(1000);

            WebElement loca5 = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(
                    By.xpath("//a[@id='nav-cart']"))));
            actions.moveToElement(loca5);
            actions.perform();
            logger.info( Constants.LOCATOR_5 + loca5.toString());
            Thread.sleep(1000);

            WebElement moveToCategories = driver.findElement(By.xpath("//h2[normalize-space()='Shop adidas categories']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", moveToCategories);
            Thread.sleep(500);

            WebElement loca6 = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(
                    By.xpath("(//div[contains(@class,'s-overflow-hidden aok-relative s-visual-card-navigation-product-image-container ')])[2]"))));
            actions.moveToElement(loca6);
            actions.perform();
            loca6.click();
            logger.info( Constants.LOCATOR_6 + loca6.toString());
            Thread.sleep(1000);

            WebElement loca7 = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(
                    By.xpath("//button[@id='a-autoid-3-announce']"))));
            actions.moveToElement(loca7);
            actions.perform();
            logger.info( Constants.LOCATOR_7 + loca7.toString());
            Thread.sleep(1000);

            driver.navigate().back();
            Thread.sleep(1000);

            WebElement loca10 = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(
                    By.xpath(" (//div[@role='listitem']//h2[normalize-space()='"+paramSearch+"'])[1]"))));
            logger.info( Constants.LOCATOR_10 + loca10.toString() + loca10.getText());
            Thread.sleep(1000);

            WebElement loca8 = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(
                    By.xpath("(//a[contains(@class,'s-line-clamp-4')])[3]"))));
            logger.info( Constants.LOCATOR_8 + loca8.toString() + loca8.getText());
            Thread.sleep(1000);

            WebElement loca9 = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(
                    By.xpath("(//div[contains(@class,'a-size-base a-color-secondary')]//following::span[@aria-label])[2]"))));
            logger.info( Constants.LOCATOR_9 + loca9.toString() + loca9.getText());
            Thread.sleep(1000);

            WebElement loca11 = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(
                    By.id("loom-desktop-top-slot_us-slds-sp-2-t1-a2-heading"))));
            logger.info( Constants.LOCATOR_11 + loca11.toString() + loca11.getText());
            Thread.sleep(1000);

            WebElement moveToGender = driver.findElement(By.xpath("//span[normalize-space()='Gender']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", moveToGender);
            Thread.sleep(500);

            WebElement loca12 = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(
                    By.xpath("(//div[@id='gender']//i[@class='a-icon a-icon-checkbox'])[1]"))));
            logger.info( Constants.LOCATOR_12 + loca12.toString());
            Thread.sleep(1000);

            WebElement moveToTop = driver.findElement(By.tagName("header"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", moveToTop);
            Thread.sleep(500);

            WebElement loca13 = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(
                    By.xpath("//h2[contains(@class,'a-spacing-small')]//span[1]"))));
            logger.info( Constants.LOCATOR_13 + loca13.toString() + loca13.getText());
            Thread.sleep(1000);

            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", loca11);
            Thread.sleep(500);

            WebElement loca14 = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(
                    By.xpath("//div[@class='sg-col-inner']//a[normalize-space()='Bags']"))));
            logger.info( Constants.LOCATOR_14 + loca14.toString());
            Thread.sleep(1000);

            driver.close();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
