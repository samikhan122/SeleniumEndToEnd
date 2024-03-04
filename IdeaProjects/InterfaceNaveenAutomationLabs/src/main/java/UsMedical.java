public interface UsMedical extends WHO {

   int min_fee = 100;

    public void physioServices();

    public void oncologyServices();

    public void pediaServices();


    public void emergencyServices();


    public static void billing() {
        System.out.println("Billing with USMedical");
    }

    default void medicalInsurance() {
        System.out.println("UsMedical medicalInsurance");
    }

}
