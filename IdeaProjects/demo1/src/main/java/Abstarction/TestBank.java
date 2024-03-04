package Abstarction;

public class TestBank {
    public static void main(String[] args) {
        Chase cs = new Chase();
        cs.credit();
        cs.debt();
        cs.loan();

        Bank b = new Chase();
        b.credit();
        b.loan();
        b.debt();


    }
}
