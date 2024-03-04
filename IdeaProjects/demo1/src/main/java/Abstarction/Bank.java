package Abstarction;

public abstract class Bank {

    public abstract void loan();
    //abstraction- to hide the implementation. and display only what's needed.
    //cannot create the object of the abstract class

    public void credit() {
        System.out.println("Bank credit");


    }

    public void debt() {
        System.out.println("Bank -- debt");

    }


}
