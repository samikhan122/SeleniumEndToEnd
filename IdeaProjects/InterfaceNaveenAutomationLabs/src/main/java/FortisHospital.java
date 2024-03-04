public class FortisHospital implements UsMedical, UKMedical , IndianMedical{

    @Override

    //UsMedical
    public void physioServices() {
        System.out.println("FHS----- physioServices");
    }

    @Override
    public void oncologyServices() {
        System.out.println("FHS----- oncologyServices");
    }

    @Override
    public void pediaServices() {
        System.out.println("FHS----- pediaServices");
    }

    @Override
    public void emergencyServices() {
        System.out.println("FHS----- emergencyServices");
    }

    @Override
        public void cardioServices() {
            System.out.println("FHS----- cardioServices");
        }

        @Override
        public void dentalServices() {
            System.out.println("FHS----- dentalServices");
        }


    @Override
    public void gynecServices() {
        System.out.println("FHS----- gynecServices");
    }

    @Override
    public void radiologyServices() {
        System.out.println("FHS----- radiologyServices");
    }

    public void returnMethod(){
        System.out.println("Fortis Own Method");
    }
    public void FortisPathologyServnices(){
        System.out.println("Fortis Pathology Servnices");
    }

    public static void billing(){
        System.out.println("Fortis Billing");
    }


    @Override
    public void covidVaccination() {
        System.out.println("Fortis covidVaccination");
    }
}
