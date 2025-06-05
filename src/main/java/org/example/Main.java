package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.level1.airbnbHomePage;
import org.example.level1.hrmAdminPage;
import org.example.level2.amazonSearchResultPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        hrmAdminPage hrmAdminPage = new hrmAdminPage();
        hrmAdminPage.Prac1();

        airbnbHomePage homePage = new airbnbHomePage();
        homePage.Prac2();

        amazonSearchResultPage amazonPage = new amazonSearchResultPage();
        amazonPage.Prac3();
    }
}