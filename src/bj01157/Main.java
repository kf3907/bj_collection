package bj01157;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] counts = new int[26];
        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
                counts[s.charAt(i) - 97]++; // s가 소문자일 경우
            } else {
                counts[s.charAt(i) - 65]++; // s가 대문자일 경우
            }
        }

        int max = -1;//counts 걊의 기본값이 0이기 때문에 -1로 초기화
        char ch = '?';
        for (int i = 0; i < 26; i++) {
            if (counts[i] > max) {
                max = counts[i];
                ch = (char) (i + 65);
            }
            else if (counts[i] == max) {
                ch = '?'; // 같은 개수의 count가 있다면 ?로 변환
            }
        }
        System.out.print(ch);
    }

}