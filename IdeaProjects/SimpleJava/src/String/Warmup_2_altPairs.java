package String;

public class Warmup_2_altPairs {
    public static void main(String[] args) {
        Warmup_2_altPairs at = new Warmup_2_altPairs();
        System.out.println(at.altPair("kitten"));
    }

    public String altPair(String str) {
        String temp = "";
        for(int i =0;i<str.length();i+=4){
            temp+=str.charAt(i);
            if(i+1 <str.length()){
                temp +=str.charAt(i+1);
            }
        }
        return temp;
    }
}
/**
 Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".


 altPairs("kitten") → "kien"
 altPairs("Chocolate") → "Chole"
 altPairs("CodingHorror") → "Congrr"
 */