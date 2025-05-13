package Collections.BubleSort;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(56, 45, 89, 1, 45, 13, 4, 69, 11, -89));
    public static int[] numbers2 = {56, 45, 89, 1, 45, 13, 4, 69, 11, -89};

    public static void main(String[] args) {
        print();
        sort();
        System.out.println("\nОтсортированные числа в натуральном порядке:");
        print();
        System.out.println();
        System.out.println("---------------------------------------------");
        print2();
        sort2();
        System.out.println("\nОтсортированные числа в натуральном порядке:");
        print2();
    }

    public static void sort() {
        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = 0; j < numbers.size() - i - 1; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }
            }
        }
    }

    public static void sort2() {
        for (int i = 0; i < numbers2.length - 1; i++) {
            for (int j = 0; j < numbers2.length - i - 1; j++) {
                if (numbers2[j] > numbers2[j + 1]) {
                    int temp = numbers2[j];
                    numbers2[j] = numbers2[j + 1];
                    numbers2[j + 1] = temp;
                }
            }
        }
    }

    public static void print() {
        for (int number : numbers) {
            System.out.print(number + "\t");
        }
    }

    public static void print2() {
        for (int number : numbers2) {
            System.out.print(number + "\t");
        }
    }
}
