package bj03003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] chess = {1,1,2,2,2,8};
        String[] s = sc.nextLine().split(" ");

        for(int i = 0; i<s.length; i++) {
            int number = chess[i] - Integer.parseInt(s[i]);
            System.out.print(number + " ");
        }
    }
}
