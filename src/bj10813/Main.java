package bj10813;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //바구니 N개, 바구니 안에는 바구니 번호와 같은 번호의 공이 1개씩 들어있다.
        //공이 N개
        //공을 M번 바꾼다.
        //1번당 바구니 2개를 고르기
        //두 바구니의 공을 교환

        Scanner sc = new Scanner(System.in);

        //첫번째 입력
        String[] inputs = sc.nextLine().split(" ");
        //int로 전환
        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);
        //새로운 배열 생성
        int[] basket = new int[n];

        //배열에 값 추가
        for (int i = 0; i < n; i++) {
            basket[i] = i+1;
        }


        //배열의 값 교환
        for(int k = 0; k < m; k++) {
            String[] ij = sc.nextLine().split(" ");
            int i = Integer.parseInt(ij[0])-1;
            int j = Integer.parseInt(ij[1])-1;

            int temp = basket[i];
            basket[i] = basket[j];
            basket[j] = temp;
        }

        for (int ball : basket) {
            System.out.print(ball + " ");
        }
    }
}
