package NaveenAutomtionLabs;

public class LoginPage {
    String userName;
    String password;

    public LoginPage(String userName, String password) {
        this.userName = userName;
        this.password = password;

    }
    public LoginPage(){
        String username = "admin";
        String password = "admin123";

    }

    public void doLogin() {
        System.out.println("Enter UserName : " + userName);
        System.out.println("Enter Password : " + password);
        System.out.println("Clicked on login button");
        System.out.println("user is logged in");
    }
}
