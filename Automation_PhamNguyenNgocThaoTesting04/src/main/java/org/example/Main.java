package org.example;

import org.example.level1.airbnbHomePage;
import org.example.level1.hrmAdminPage;
import org.example.level2.amazonSearchResultPage;

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