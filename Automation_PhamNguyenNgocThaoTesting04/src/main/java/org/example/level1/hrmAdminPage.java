package org.example.level1;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class hrmAdminPage {
    static Logger logger = LogManager.getLogger("Cấp độ 1 - Bài tập 1");
    public void Prac1() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            Thread.sleep(2000);
            driver.get(Constants.LINK_PRAC_1);
            logger.info("Đã truy cập vào website: " + Constants.LINK_PRAC_1);
            Thread.sleep(5000);

            driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
            driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
            driver.findElement(By.cssSelector("button[type='submit']")).click();
            logger.info(Constants.LOGIN_SUCCESS);
            Thread.sleep(5000);

            WebElement tabAdmin = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Admin"))));
            tabAdmin.click();
            logger.info(Constants.LOCATOR_1 + tabAdmin.toString());
            Thread.sleep(1000);

            WebElement tabPIM = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("PIM"))));
            tabPIM.click();
            logger.info(Constants.LOCATOR_2 + tabPIM.toString());
            Thread.sleep(1000);

            WebElement tabLeave = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Leave"))));
            tabLeave.click();
            logger.info(Constants.LOCATOR_3 + tabLeave.toString());
            Thread.sleep(1000);

            WebElement tabAdmin1 = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Admin"))));
            tabAdmin1.click();
            Thread.sleep(1000);

            WebElement username = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='oxd-table-filter']//input[@class='oxd-input oxd-input--active']"))));
            username.sendKeys("Thaopnn");
            logger.info(Constants.LOCATOR_4 + username.toString());
            Thread.sleep(1000);

            WebElement selectUserRole = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//div[@class='oxd-grid-item oxd-grid-item--gutters'])[2]//div[@class='oxd-select-wrapper']"))));
            selectUserRole.click();
            logger.info(Constants.LOCATOR_5 + selectUserRole.toString());
            Thread.sleep(1000);

            WebElement listUserRoleIndex1 = driver.findElement(By.xpath("//div[@role='option'][normalize-space()='Admin']"));
            listUserRoleIndex1.click();
            logger.info(Constants.LOCATOR_6 + listUserRoleIndex1.toString());
            Thread.sleep(1000);

            selectUserRole.click();
            Thread.sleep(1000);
            WebElement listUserRoleIndex2 = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@role='option'][normalize-space()='ESS']"))));
            listUserRoleIndex2.click();
            logger.info(Constants.LOCATOR_7 + listUserRoleIndex2.toString());
            Thread.sleep(1000);

            WebElement employeeName = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"))));
            employeeName.sendKeys("Ngọc Thảo");
            logger.info(Constants.LOCATOR_8 + employeeName.toString());
            Thread.sleep(1000);

            WebElement btnReset = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[normalize-space()='Reset']"))));
            btnReset.click();
            logger.info(Constants.LOCATOR_9 + btnReset.toString());
            Thread.sleep(1000);

            WebElement btnSearch = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[normalize-space()='Search']"))));
            btnSearch.click();
            logger.info(Constants.LOCATOR_10 + btnSearch.toString());
            Thread.sleep(1000);

            WebElement lstUserManagement = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//li[@class='oxd-topbar-body-nav-tab --parent --visited']"))));
            lstUserManagement.click();
            logger.info(Constants.LOCATOR_11 + lstUserManagement.toString());
            Thread.sleep(1000);

            WebElement usernameData = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@role='cell'][2]"))));
            usernameData.click();
            logger.info(Constants.LOCATOR_12 + usernameData.toString());
            Thread.sleep(1000);

            WebElement emplData = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@role='cell'][3]"))));
            emplData.click();
            logger.info(Constants.LOCATOR_13 + emplData.toString());
            Thread.sleep(1000);

            WebElement btnDel = driver.findElement(By.xpath("(//i[@class='oxd-icon bi-trash'])[2]"));
            btnDel.click();
            logger.info(Constants.LOCATOR_14 + btnDel.toString());
            Thread.sleep(1000);
            driver.findElement(By.xpath("//button[normalize-space()='No, Cancel']")).click();
            Thread.sleep(1000);

            WebElement btnEdit = driver.findElement(By.xpath("(//i[@class='oxd-icon bi-pencil-fill'])[2]"));
            btnEdit.click();
            logger.info(Constants.LOCATOR_15 + btnEdit.toString());
            Thread.sleep(1000);
            driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();
            Thread.sleep(1000);

            WebElement userRoleHeader = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@role='columnheader'][3]"))));
            userRoleHeader.getText();
            logger.info(Constants.LOCATOR_16 + userRoleHeader.toString());
            Thread.sleep(1000);

            WebElement employeeNameHeader = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@role='columnheader'][4]"))));
            employeeNameHeader.getText();
            logger.info(Constants.LOCATOR_17 + employeeNameHeader.toString());
            Thread.sleep(1000);

            WebElement strUserManagement = driver.findElement(By.xpath("//h6[normalize-space()='User Management']"));
            strUserManagement.getText();
            logger.info(Constants.LOCATOR_18 + strUserManagement.toString());
            Thread.sleep(1000);

            WebElement btnTabbar = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@role='none']"))));
            btnTabbar.click();
            logger.info(Constants.LOCATOR_19 + btnTabbar.toString());
            Thread.sleep(1000);

            WebElement btnHide = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='oxd-table-filter-header']//button[@type='button']"))));
            btnHide.click();
            logger.info(Constants.LOCATOR_20 + btnHide.toString());
            Thread.sleep(1000);

            WebElement btnAdd = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[normalize-space()='Add']"))));
            btnAdd.click();
            logger.info(Constants.LOCATOR_21 + btnAdd.toString());
            Thread.sleep(1000);

            driver.close();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
