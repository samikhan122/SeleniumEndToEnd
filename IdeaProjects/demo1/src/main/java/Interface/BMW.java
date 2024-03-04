package Interface;

public class BMW implements Car{
    @Override
    public void start() {
        System.out.println("BMW is started");
    }

    @Override
    public void stop() {
        System.out.println("BMW is Stopped");
    }

    @Override
    public void refuel() {
        System.out.println("BMW needs refuel");
    }


    public void driveSaftey(){
        System.out.println("Drive saftey");
    }
}
