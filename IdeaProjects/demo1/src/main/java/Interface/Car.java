package Interface;

public interface Car {

    //always define only abstract method
    // no method body
    // only method declaration
    //achieve 100% abstraction
    //only final and static var

    int wheel = 4;

    public void start();

    public void stop();

    public void refuel();

    static void stop23(){
        System.out.println("Hello there");
    }
}
