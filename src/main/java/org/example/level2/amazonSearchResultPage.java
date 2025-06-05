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

    private By loca1 = By.xpath("(//div[contains(@data-cy,'image-container')])[3]");
    private By loca2 = By.xpath("(//div[@data-cy='price-recipe']//following::div[@class='a-section aok-inline-block'])[5]");
    private By loca3 = By.xpath("(//span[@class='a-price'])[5]");
    private By loca4 = By.xpath("//input[@id='twotabsearchtextbox']");
    private By loca5 = By.xpath("//a[@id='nav-cart']");
    private By loca6 = By.xpath("(//div[contains(@class,'s-overflow-hidden aok-relative s-visual-card-navigation-product-image-container ')])[2]");
    private By loca7 = By.xpath("//button[@value='6']");
    private By loca8 = By.xpath("(//a[contains(@class,'s-line-clamp-4')])[3]");
    private By loca9 = By.xpath("(//div[contains(@class,'a-size-base a-color-secondary')]//following::span[@aria-label])[2]");
    private By loca10 = By.xpath(" (//div[@role='listitem']//h2[normalize-space()='"+paramSearch+"'])[1]");
    private By loca11 = By.id("loom-desktop-top-slot_us-slds-sp-2-t1-a2-heading");
    private By loca12 = By.xpath("(//div[@id='gender']//i[@class='a-icon a-icon-checkbox'])[1]");
    private By loca13 = By.xpath("//h2[contains(@class,'a-spacing-small')]//span[1]");
    private By loca14 = By.xpath("//div[@class='sg-col-inner']//a[normalize-space()='Bags']");
    private By Languages = By.xpath("//button[@aria-label='Expand to Change Language or Country']");
    private By LangEN = By.xpath("//div[@id='nav-flyout-icp']//span[contains(@dir,'ltr')][normalize-space()='English'] ");

    public void Prac3(){

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions actions = new Actions(driver);

        try {
            Thread.sleep(1000);
            driver.get(Constants.LINK_PRAC_3);
            logger.info("✅ " + Constants.LOGIN_SUCCESS);

            //Xác định logo
            WebElement elementLogo = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(
                    By.xpath("//a[@id='nav-logo-sprites']"))));

            // Tìm kiếm từ khóa adidas
            WebElement searchField = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(loca4)));
            searchField.sendKeys(paramSearch);
            searchField.submit();
            logger.info( Constants.LOCATOR_4 + loca4.toString());
            Thread.sleep(2000);

            // Chọn tiếng Anh
            WebElement languages = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Languages)));
            actions.moveToElement(languages);
            actions.perform();
            Thread.sleep(1000);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(LangEN))).click();
            Thread.sleep(2000);

            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(loca1)));
            logger.info( Constants.LOCATOR_1 + loca1.toString());
            Thread.sleep(1000);

            WebElement priceList = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(loca2)));
            logger.info( Constants.LOCATOR_2 + loca2.toString() + priceList.getText());
            Thread.sleep(1000);

            WebElement priceDiscount = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(loca3)));
            //(//div[@data-cy='price-recipe']//following::span[@class='a-price'])[5]
            logger.info(Constants.LOCATOR_3 + loca3.toString() + priceDiscount.getText());
            Thread.sleep(1000);

            WebElement cart = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(loca5)));
            actions.moveToElement(cart);
            actions.perform();
            logger.info( Constants.LOCATOR_5 + loca5.toString());
            Thread.sleep(1000);

            WebElement moveToCategories = driver.findElement(By.xpath("//h2[normalize-space()='Shop adidas categories']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", moveToCategories);
            Thread.sleep(500);

            WebElement categoriesItem = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(loca6)));
            actions.moveToElement(categoriesItem);
            actions.perform();
            categoriesItem.click();
            logger.info( Constants.LOCATOR_6 + loca6.toString());
            Thread.sleep(1000);

            WebElement getSize = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(loca7)));
            actions.moveToElement(getSize);
            actions.perform();
            logger.info( Constants.LOCATOR_7 + loca7.toString());
            Thread.sleep(1000);

            driver.navigate().back();
            Thread.sleep(1000);

            WebElement branchSearch = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(loca10)));
            logger.info( Constants.LOCATOR_10 + loca10.toString() + branchSearch.getText());
            Thread.sleep(1000);

            WebElement productName = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(loca8)));
            logger.info( Constants.LOCATOR_8 + loca8.toString() + productName.getText());
            Thread.sleep(1000);

            WebElement delivery = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(loca9)));
            logger.info( Constants.LOCATOR_9 + loca9.toString() + delivery.getText());
            Thread.sleep(1000);

            WebElement topColecTitle = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(loca11)));
            logger.info( Constants.LOCATOR_11 + loca11.toString() + topColecTitle.getText());
            Thread.sleep(1000);

            WebElement moveToGender = driver.findElement(By.xpath("//span[normalize-space()='Gender']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", moveToGender);
            Thread.sleep(500);

            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(loca12)));
            logger.info( Constants.LOCATOR_12 + loca12.toString());
            Thread.sleep(1000);

            WebElement moveToTop = driver.findElement(By.tagName("header"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", moveToTop);
            Thread.sleep(500);

            WebElement dataResultSearch = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(loca13)));
            logger.info( Constants.LOCATOR_13 + loca13.toString() + dataResultSearch.getText());
            Thread.sleep(1000);

            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(loca14)));
            logger.info( Constants.LOCATOR_14 + loca14.toString());
            Thread.sleep(1000);

            driver.close();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            driver.quit();
        }
    }
}
