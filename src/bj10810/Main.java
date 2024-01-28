package bj10810;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //바구니의 개수를 N, 공의 종류의 개수는 N과 같음, 공을 넣으려는 행위의 수가 M
        // 한번 공넣을 때마다 들어갈 바구니의 범위를 지정, 번호가 모두 같은 공을 넣는다.
        // 바구니에 공이 있는 경우에는 들어있는 공을 빼고, 새로 공을 넣어야한다.
        // 공을 넣는 바구니는 연속되어야 한다.
        // 공을 어떻게 넣을지가 주어졌을 때, M번의 공을 넣은 이후에 각 바구니에 어떤 공이 들어 있는지 구하는 프로그램

        // 첫째 줄에 N과 M이 주어진다.
        String firstInput = sc.nextLine();
        String[] firstSetting = firstInput.split(" ");
        int n = Integer.parseInt(firstSetting[0]);
        int m = Integer.parseInt(firstSetting[1]);

        //n을 이용해 새로운 배열 생성
        int[] numbers = new int[n];

        //입력을 m번 받음
        for(int i = 0; i < m; i++) {
            String input = sc.nextLine();
            //받은 입력 첫번째부터 입력 두번째 인덱스 까지 세번째 번호의 공을 넣음
            String[] strings = input.split(" ");
            int start = Integer.parseInt(strings[0])-1;
            int end = Integer.parseInt(strings[1]);
            int ballNum = Integer.parseInt(strings[2]);
            for (;start < end; start++) {
                numbers[start] = ballNum;
            }
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
