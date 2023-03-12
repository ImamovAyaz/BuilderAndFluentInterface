package Pages;

public class LoginPage {
    public LoginPage() {
    }

    public HomePage login(Credentials creds) {
        System.out.println("Authorization");
        return new HomePage();
    }
}
