package AbstractionInNature;

public class LoginPage extends Page {
public LoginPage(){
    System.out.println("Login Page Constructor");
}
    public LoginPage(int i){
        System.out.println("Login Page Constructor " + i);
    }
//once created the object of the child class
// also while entending the parent then parent and child class will inherit that in the caller class

    @Override
    public void title() {
        System.out.println("LoginPage- Title");
    }

    @Override
    public void url() {
        System.out.println("LoginPage URL");
    }

    public void doLogin(String us, String pass) {
        System.out.println("Login With: " + us + " " + pass);

    }

}
