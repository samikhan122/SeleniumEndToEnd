package Array1;

public class CommonEnd {
    public static void main(String[] args) {

    }


    public boolean commonEnd(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] >= 1 && b[j] >= 1 && a[0] == b[0] || a[a.length - 1] == b[b.length - 1])
                    return true;
            }
        }
        return false;
    }
}

