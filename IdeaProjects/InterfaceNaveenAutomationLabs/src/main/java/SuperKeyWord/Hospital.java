package SuperKeyWord;

public class Hospital implements Medical {

    int min_Fee = 10;
    public void treatment(){
        int minFee = Medical.min_Fee;
        System.out.println(minFee);
    }


    public static void testing(){
        //testing();
        System.out.println("Hospital Testing");
    }


}
