package NaveenAutomtionLabs;

public class LoginPageTest {
    public static void main(String[] args) {
        LoginPage lg = new LoginPage("samikhan123", "loruBasheer123");
        lg.doLogin();

        LoginPage lg2 = new LoginPage();
        lg2.doLogin();
    }
}
