package AbstractionInNature;

public abstract class Page {

    public Page() {
        this(20);
        //constructor will be called when we create the object
        // so the child is not mandatory have the constructor class so jvm will create the obejct in child class by dafault
        System.out.println("Page Constructor");

    }

    public Page(int i){
        System.out.println("Page Constructor with one parameter " + i);
    }


    public abstract void title();

    public abstract void url();

    public void pageLoadingTime() {
        System.out.println("Page loading timeOut");

    }

    public void displayLogo() {
        System.out.println("Page -- display logo loading time - 20 sec");
    }

    public static void displayLogo1() {
        System.out.println("Page -- display logo");
    }

    public static void displayLogo2() { // use child/parent class name with the method name to call this.
        System.out.println("Page -- display logo");
    }

    public final void footers() { // to no create the common copy so they will create a final copy so this (cant be changed)
        System.out.println("Page -- footers");
    }


}
