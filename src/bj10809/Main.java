package bj10809;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String[] strings = sc.next().split("");

        //알파벳 배열 생성
        String[] alphabets = new String[26];
        char currentChar = 'a';
        for(int i = 0; i<alphabets.length; i++) {
            alphabets[i] = String.valueOf(currentChar);
            currentChar++;
        }

        //결과값 배열 생성
        int[] result = new int[alphabets.length];
        Arrays.fill(result, -1);

        for(int i = 0; i<alphabets.length; i++) {
            for(int j = 0; j<strings.length; j++) {
                if(alphabets[i].equals(strings[j]) && result[i] == -1) {
                    result[i] = j;
                }
            }
        }
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
