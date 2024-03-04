public class EscapeKeyWord {
    public static void main(String[] args) {
        int a = 11, b = 22, c;
        c = a + b + a++ + b++ + ++a + ++b;

        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);


        float f1 = 1.1f;
        float f2 = f1++;
        System.out.println("f2 is " + f2);
        System.out.println(f1);

        char c1 = 'a';
        System.out.println((long) ++c1);

        int a2 = 40, b6 =10;
        System.out.println(a2++); //40 11

    }
}
