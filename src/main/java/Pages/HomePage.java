package Pages;

public class HomePage {
    public HomePage() {
    }

    public HomePage openMenu() {
        System.out.println("Open Menu");
        return this;
    }

    public HomePage selectShop() {
        System.out.println("Select shop");
        return this;
    }

    public ShopMainPage enterShop() {
        System.out.println("Enter shop");
        return new ShopMainPage();
    }
}
