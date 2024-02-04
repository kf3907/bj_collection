package bj02908;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //BufferedReader도 사용이 가능하지만 throw IOException을 넘겨야 하기 때문에 사용하지 않았다.
        Scanner sc = new Scanner(System.in);
        String[] string = sc.nextLine().split(" ");
        String c = "";
        for(int i = 2; i>=0; i--) {
            c += String.valueOf(string[0].charAt(i));
        }
        int a = Integer.parseInt(c);
        c="";
        for(int i = 2; i>=0; i--) {
            c += String.valueOf(string[1].charAt(i));
        }
        int b = Integer.parseInt(c);

        System.out.println(Math.max(a, b));
    }
}
