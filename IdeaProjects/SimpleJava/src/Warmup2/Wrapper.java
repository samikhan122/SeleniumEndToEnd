package Warmup2;

public class Wrapper {
    public static void main(String[] args) {
        String num = "20";
        System.out.println(num);

        System.out.println(Integer.parseInt(num));


        String s1 = "15.15";

        String s2 = "20.52";

        System.out.println(Double.parseDouble(s1));

        double f = Double.parseDouble(s1);
        double g = Double.parseDouble(s2);

        System.out.println(g+f);


        double s = 58.58;

        String y = String.valueOf(s);
        System.out.println(y);

    }
}
