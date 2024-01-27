package bj10807;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        String[] values = new String[length];
        sc.nextLine();
        String[] numbers = sc.nextLine().split(" ");
        int i = 0;
        for (String number : numbers) {
            values[i] = number;
            i++;
        }

        int findNum = sc.nextInt();
        int totalNum = 0;
        for (String value : values) {
            if(Integer.parseInt(value) == findNum) {
                totalNum++;
            }
        }
        System.out.println(totalNum);

    }
}
