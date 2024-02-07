package bj01316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int numbers = Integer.parseInt(bufferedReader.readLine());

        String[] s = new String[numbers];

        int groupCount = 0;

        for(int i = 0; i < numbers; i++) {
            s[i] = bufferedReader.readLine();;
        }

        
    }
}
