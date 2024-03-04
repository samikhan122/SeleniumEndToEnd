package Inheritance;

public class Max extends Hospital{

    public void dischargePatient(){
        System.out.println("Max Hospital Discharging Patient");
    }
    public void pedeatricCare(){
        System.out.println("Pediatric Care in Max Hospital");
    }
    public boolean performSurgery(){
        System.out.println("Max Performing Surgery");
        return true;
    }

}
