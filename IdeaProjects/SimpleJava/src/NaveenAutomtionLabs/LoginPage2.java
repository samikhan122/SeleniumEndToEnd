package NaveenAutomtionLabs;

public class LoginPage2 {
    private String username;

    private String password;

    public LoginPage2(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


    public void setUsername(String username) {
        this.username = username;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public void doLogin(String username) {
        if (!isValidUsername(username)) {
            System.out.println("User enters username " + username);
            System.out.println("User enters password " + password);
            System.out.println("User is logged in");

        }
    }

    private boolean isValidUsername(String username) {
        System.out.println("Checking if the username is valid or not...");
        if (username.length() > 3) {
            System.out.println("Username is valid");
            return true;
        } else {
            return false;
        }
    }


}
