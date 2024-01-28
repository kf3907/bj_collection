package bj10810;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//풀이 2
public class SecondMainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(str.nextToken());
        int[] A = new int[N];

        int M = Integer.parseInt(str.nextToken());
        int i, j, k;
        for (int I = 0; I < M; I++) {
            str = new StringTokenizer(br.readLine(), " ");
            i = Integer.parseInt(str.nextToken());
            j = Integer.parseInt(str.nextToken());
            k = Integer.parseInt(str.nextToken());

            for (int z = i - 1; z < j; z++) {
                A[z]=k;
            }
        }
        for (int I = 0; I < N; I++) {

            System.out.print(A[I] + " ");
        }

    }
}