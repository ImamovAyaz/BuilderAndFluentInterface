package org.example;

import Pages.Credentials;
import Pages.LoginPage;
import Pages.SearchEntity;
import org.testng.annotations.Test;

public class Main {

    private String name = "EntityName";
    Credentials creds = new Credentials();
    SearchEntity entity = new SearchEntity(name);
    LoginPage loginPage = new LoginPage();

    // 1 A 2 A 3 A
    @Test
    public void Test() {
        assert (loginPage.login(creds)
                .openMenu()
                .selectShop()
                .enterShop()
                .search(entity)
                .isEntityFound());
    }
}