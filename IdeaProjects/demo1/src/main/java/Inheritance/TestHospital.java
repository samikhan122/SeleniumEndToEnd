package Inheritance;

public class TestHospital {
    public static void main(String[] args) {

        System.out.println("Hospital Inhertance starts");
      Hospital hp = new Hospital();
        hp.admissionProcess();//individual
        hp.dischargePatient();//individual
        hp.dischargePatient();//individual

        System.out.println("Fortis Inhertance starts");
       Fortis fs = new Fortis();
        fs.admissionProcess();//inherited
        fs.dischargePatient();//inherited
        fs.emergencyServices();//individual
        fs.performSurgery();//inherited

        System.out.println("Max Inhertance starts");
     Max max = new Max();
        max.admissionProcess();//inherited
        max.dischargePatient();//inherited
        max.pedeatricCare();//individual
        max.performSurgery();//inherited

        System.out.println("Apollo Hospital Starts");
       Apollo apollo = new Apollo();
        apollo.performSurgery();//inherited
        apollo.admissionProcess();//inherited
        apollo.specializedCare();//individual
        apollo.dischargePatient();//inherited


        //Top Casting
        Hospital[] hospitals = {fs, max,apollo};
        for (Hospital hospital : hospitals) {
            System.out.println(hospital.performSurgery());


        }
    }
}
