public class cigarParty {
    public static void main(String[] args) {
        cigarParty cs = new cigarParty();

    }

    int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("x")) {
                count++;
            }

        }
        return count;
    }

}