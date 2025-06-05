package org.example.level1;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Constants;
import org.example.Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class hrmAdminPage {
    static Logger logger = LogManager.getLogger("Cấp độ 1 - Bài tập 1");
    private By tabAdmin = By.linkText("Admin");
    private By tabPIM = By.linkText("PIM");
    private By tabLeave = By.linkText("Leave");
    private By usernameField = By.xpath("//div[@class='oxd-table-filter']//input[@class='oxd-input oxd-input--active']");
    private By userRoleSelect = By.xpath("(//div[@class='oxd-grid-item oxd-grid-item--gutters'])[2]//div[@class='oxd-select-wrapper']");
    private By getUserRoleIndex1 = By.xpath("//div[@role='option'][normalize-space()='Admin']");
    private By getUserRoleIndex2 = By.xpath("//div[@role='option'][normalize-space()='ESS']");
    private By empNameField = By.xpath("//input[@placeholder='Type for hints...']");
    private By btnReset = By.xpath("//button[normalize-space()='Reset']");
    private By btnSearch =  By.xpath("//button[normalize-space()='Search']");
    private By lstUserManagement = By.xpath("//li[@class='oxd-topbar-body-nav-tab --parent --visited']");
    private By usernameData = By.xpath("//div[@role='cell'][2]");
    private By  emplData = By.xpath("//div[@role='cell'][3]");
    private By btnDel = By.xpath("(//i[@class='oxd-icon bi-trash'])[2]");
    private By btnEdit = By.xpath("(//i[@class='oxd-icon bi-pencil-fill'])[2]");
    private By userRoleHeader = By.xpath("//div[@role='columnheader'][3]");
    private By employeeNameHeader = By.xpath("//div[@role='columnheader'][4]");
    private By strUserManagement = By.xpath("//h6[normalize-space()='User Management']");
    private By btnTabbar = By.xpath("//button[@role='none']");
    private By btnHide = By.xpath("//div[@class='oxd-table-filter-header']//button[@type='button']");
    private By btnAdd = By.xpath("//button[normalize-space()='Add']");
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

            LoginPage loginPage = new LoginPage(driver);
            loginPage.login(Constants.USERNAME, Constants.PASSWORD);
            Thread.sleep(5000);

            // Kiểm tra login thành công
            if (driver.getCurrentUrl().contains("dashboard")) {
                logger.info("✅ " + Constants.LOGIN_SUCCESS);
            } else {
                System.out.println("❌ Login thất bại!");
            }

            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(tabAdmin))).click();
            logger.info(Constants.LOCATOR_1 + tabAdmin.toString());
            Thread.sleep(1000);

            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(tabPIM))).click();
            logger.info(Constants.LOCATOR_2 + tabPIM.toString());
            Thread.sleep(1000);

            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(tabLeave))).click();
            logger.info(Constants.LOCATOR_3 + tabLeave.toString());
            Thread.sleep(1000);

            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(tabAdmin))).click();
            Thread.sleep(1000);

            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(usernameField))).sendKeys("thaopnn");
            logger.info(Constants.LOCATOR_4 + usernameField.toString());
            Thread.sleep(1000);

            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(userRoleSelect))).click();
            logger.info(Constants.LOCATOR_5 + userRoleSelect.toString());
            Thread.sleep(1000);

            driver.findElement(getUserRoleIndex1).click();
            logger.info(Constants.LOCATOR_6 + getUserRoleIndex1.toString());
            Thread.sleep(1000);

            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(userRoleSelect))).click();
            Thread.sleep(1000);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(getUserRoleIndex2))).click();
            logger.info(Constants.LOCATOR_7 + getUserRoleIndex2.toString());
            Thread.sleep(1000);

            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(empNameField))).sendKeys("Thảo");
            logger.info(Constants.LOCATOR_8 + empNameField.toString());
            Thread.sleep(1000);

            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(btnReset))).click();
            logger.info(Constants.LOCATOR_9 + btnReset.toString());
            Thread.sleep(1000);

            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(btnSearch))).click();
            logger.info(Constants.LOCATOR_10 + btnSearch.toString());
            Thread.sleep(1000);

            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(lstUserManagement))).click();
            logger.info(Constants.LOCATOR_11 + lstUserManagement.toString());
            Thread.sleep(1000);

            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(usernameData))).click();
            logger.info(Constants.LOCATOR_12 + usernameData.toString());
            Thread.sleep(1000);

            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(emplData))).click();
            logger.info(Constants.LOCATOR_13 + emplData.toString());
            Thread.sleep(1000);

            driver.findElement(btnDel).click();
            logger.info(Constants.LOCATOR_14 + btnDel.toString());
            Thread.sleep(1000);
            driver.findElement(By.xpath("//button[normalize-space()='No, Cancel']")).click();
            Thread.sleep(1000);

            driver.findElement(btnEdit).click();
            logger.info(Constants.LOCATOR_15 + btnEdit.toString());
            Thread.sleep(1000);
            driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();
            Thread.sleep(1000);

            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(userRoleHeader))).getText();
            logger.info(Constants.LOCATOR_16 + userRoleHeader.toString());
            Thread.sleep(1000);

            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(employeeNameHeader))).getText();
            logger.info(Constants.LOCATOR_17 + employeeNameHeader.toString());
            Thread.sleep(1000);

            driver.findElement(strUserManagement).getText();
            logger.info(Constants.LOCATOR_18 + strUserManagement.toString());
            Thread.sleep(1000);

            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(btnTabbar))).click();
            logger.info(Constants.LOCATOR_19 + btnTabbar.toString());
            Thread.sleep(1000);

            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(btnHide))).click();
            logger.info(Constants.LOCATOR_20 + btnHide.toString());
            Thread.sleep(1000);

            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(btnAdd))).click();
            logger.info(Constants.LOCATOR_21 + btnAdd.toString());
            Thread.sleep(1000);

           // driver.close();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
