package Arrays.Task0506;


//Чтобы выполнить эту задачу, тебе нужно:
//
//Ввести с клавиатуры число N.
//Считать N целых чисел и заполнить ими массив.
//Найти минимальное число среди элементов массива и вывести в консоль.
//Требования:
//        •	В методе main(String[]) считай с клавиатуры число N,
//потом проинициализируй массив array размером N элементов и заполни
//числами с клавиатуры.
//        •	В методе main(String[]) выведи в консоль минимальное
//число среди элементов массива.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int[] numbers = new int[sc.nextInt()];
        int minNumber = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the " + (i + 1) + "th number: ");
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
        }
        System.out.println("Min number in array: " + minNumber);
    }
}
