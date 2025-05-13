package Collections.Task1210;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static int[] numbers = new int[10];
    public static List <Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        init();
        print();
        System.out.println();
        reverse();
        print();
    }

    public static void init() {
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
    }

    public static void reverse() {
        int n = list.size() - 1;
        for (int i = 0; i < list.size() / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(n - i));
            list.set(n - i, temp);
        }
    }

    private static void print() {
        for (int number : list) {
            System.out.print(number);
        }
    }
}
