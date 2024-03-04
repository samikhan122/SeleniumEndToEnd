package Inheritance;

public class Fortis  extends  Hospital {
    @Override
    public void admissionProcess() {
        System.out.println("Fortis Admission Process");

    }

    public void emergencyServices() {
        System.out.println("Fortis Emergency Services");
    }

    public boolean performSurgery() {
        System.out.println("Fortis Performing Surgery");
        return true;
    }
}
