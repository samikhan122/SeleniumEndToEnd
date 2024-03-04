package SuperKeyWord;

public class Child extends StartParent {
    //super(); // should be the first parameter and this is to call the parent constructor.


    public Child() {
        super(10);
        System.out.println("Child -- default constructor");
    }

    public Child(int i) {
        System.out.println("Child - constructor " + i);
    }

    public int speed = 50;

    @Override
    public void calculateTimeout() {
        super.calculateTimeout();
        System.out.println(this.speed);
        System.out.println(super.speed);
        System.out.println("Child calculateTimeout 20 seconds");
        pagePanel();

    }

    public final void logo() {
        //super.logo();
        //System.out.println("Child  logo");
        StartParent.methodInStatic();
        methodInStatic();
    }
    public static void methodInStatic(){
        System.out.println("Child static method");
    }

    public void Employee(){
        System.out.println("Child - Employee");
    }
}
