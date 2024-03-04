package String;

public class Warmup_1_everyNth {
    public static void main(String[] args) {
        Warmup_1_everyNth w1 = new Warmup_1_everyNth();
        System.out.println(w1.everyNth("Welcome",2));



    }
    public String everyNth(String str, int n) {
        String temp = str.substring(0,1);
        for(int i =n; i<str.length();i+=n){
            temp+=str.charAt(i);
        }
        return temp;
    }

}
