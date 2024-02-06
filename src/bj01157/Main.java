package bj01157;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //입력 받기
        String[] str = sc.next().toUpperCase().split("");
        char currentChar = 'A';
        //알파벳 대문자 배열 만들기
        String[] alphabets = new String[26];
        for (int i = 0; i< 26; i++) {
            alphabets[i] =String.valueOf(currentChar);
            currentChar++;
        }

        //각 알파벳의 개수 저장
        long[] counts = new long[26];
        for(var ref = new Object() {
            int i = 0;
        }; ref.i <counts.length; ref.i++) {
            counts[ref.i] = Arrays.stream(str).filter(s -> s.equals(alphabets[ref.i])).count();
        }

        //가장 많이 사용된 알파벳을 출력
        long max = 0;
        int maxIndex = 0;
        for(int i = 0; i<counts.length; i++) {
            if(counts[i]>max) {
                max = counts[i];
                maxIndex = i;
            }
//            else {
//                counts[i] -= 1; // A가 먼저 나오면서 예제입력 3번에서 오류 발생
//            }
        }
        //사용된 알파벳의 수가 같을 때 ?출력
        //같은 개수의값이 2개이상인가 확인 로직
        int maxNumberCount = 0;
        for (long count : counts) {
            if (count == max) {
                maxNumberCount++;
            }
        }
        //출력
        if(maxNumberCount>1) {
            System.out.println("?");
        } else {
            System.out.println(alphabets[maxIndex]);
        }

    }
}
