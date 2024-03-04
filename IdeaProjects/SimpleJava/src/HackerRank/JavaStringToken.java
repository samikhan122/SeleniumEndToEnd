package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaStringToken {
    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in),64 * 1024);
        //.	, 64 * 1024): This part sets the buffer size for the BufferedReader to 64 * 1024 bytes (64 KB).
        // Using a larger buffer size can improve the efficiency of reading data from the input stream,
        // especially when dealing with large volumes of data.
        System.out.println("Enter a sequence of sentence");

        final String s = read.readLine();
        final String[] res = s.split("[^A-Za-z]+");

        final StringBuilder sb = new StringBuilder();

        int count = 0;
        for (int i = 0; i < res.length; i++) {
            count++;
            sb.append(res[i]).append('\n');
        }
        System.out.println(count);
        System.out.println(sb);
        read.close();
    }

}

