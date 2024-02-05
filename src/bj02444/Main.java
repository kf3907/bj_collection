package bj02444;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = (2 * sc.nextInt()) - 1;
        int halfN = n/2;
        int number = 1;
        while(number <= n && halfN >= 0) {

            //중간 정렬하기 = n/2만큼 공백 반복 0이 될때까지 줄어듬
            for (int i = halfN; i > 0; i--) {
                System.out.print(" ");
            }

            //별 한개부터 2개씩 늘어나 n개까지 늘어남
            for (int j = 0; j < number; j++) {
                System.out.print("*");
            }
            System.out.println();
            number += 2;
            halfN--;
        }
        number -= 2;
        ++halfN;
        while(number > 0 && halfN < n/2) {
            number -= 2;
            ++halfN;
            for (int i = halfN; i > 0; i--) {
                System.out.print(" ");
            }

            for (int j = 0; j < number; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
