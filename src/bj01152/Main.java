package bj01152;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String s = sc.nextLine();
        String[] strings = s.split(" ");
        ArrayList<String> arrayList = new ArrayList<>();
        for (String string : strings) {
            if(!string.isEmpty()) {
                arrayList.add(string);
            }
        }
        System.out.println(arrayList.size());
    }
}
