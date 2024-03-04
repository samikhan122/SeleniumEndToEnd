package SuperKeyWord;

public class Car2 extends Car {

    public Car2(){
        //super();
        System.out.println("Car 2 default constrctor");
    }
    public void carMake(){
        super.carMake();
        super.carModel();
        System.out.println("Lexus");
    }
    public void carModel(){
        System.out.println("Gs");
    }
    public void edition(){
        System.out.println("350");
    }
}
