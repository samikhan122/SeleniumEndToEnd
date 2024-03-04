public class TestHospital {
    public static void main(String[] args) {
        FortisHospital fh = new FortisHospital();
        fh.physioServices();
        fh.returnMethod();
        fh.cardioServices();
        fh.gynecServices();
        fh.dentalServices();
        fh.FortisPathologyServnices();
        fh.oncologyServices();
        fh.pediaServices();
        fh.radiologyServices();
        fh.emergencyServices();

        System.out.println("=============================================");
        //type of object is us medical and the reference is the US
        UsMedical us = new FortisHospital(); //object is the fortis hospital which the object is getting creating from
        us.oncologyServices();
        us.physioServices();
        us.pediaServices();
        us.emergencyServices();
        us.covidVaccination();


        UsMedical.billing();
        FortisHospital.billing();
        us.covidVaccination();
        UKMedical uk1 = (UKMedical) us; // one interface to another calling while first top casting is required

    }
}
