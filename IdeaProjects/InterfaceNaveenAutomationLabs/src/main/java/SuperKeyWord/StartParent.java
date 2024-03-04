package SuperKeyWord;

public class StartParent  extends GrandFather{
    public StartParent() {
        System.out.println("StartParent -- default constructor");
    }

    public StartParent(int i) {
        System.out.println("StartParent - constructor " + i);
    }

   // public int speed = 10;

    public void calculateTimeout() {
        System.out.println("calculateTimeout 0 sec");
    }

    public void logo() {
        System.out.println("parent  logo");
    }
    public static void methodInStatic(){
        System.out.println("Start Parent static method");
    }


    public void Employee(){
        Employee();
        System.out.println("StartParent - Employee");
    }
}
