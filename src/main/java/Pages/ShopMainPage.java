package Pages;

public class ShopMainPage {
    public ShopMainPage() {
    }

    public ShopMainPage search(SearchEntity entity) {
        System.out.println("Search in ShopMainPage");
        return this;
    }

    public boolean isEntityFound() {
        return true;
    }
}
