package Arrays.Task0507;

//В этой задаче тебе нужно:
//
//Ввести с клавиатуры число N.
//Считать N целых чисел и заполнить ими массив array.
//Найти максимальное число среди элементов массива.
//Требования:
//        •	В методе main(String[])
//считай с клавиатуры число N, потом проинициализируй массив array
//размером N элементов, и заполни числами с клавиатуры.
//        •	В методе main(String[])
//выведи в консоль максимальное число среди элементов массива.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int[] numbers = new int[sc.nextInt()];
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the " + (i + 1) + "th number: ");
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }
        System.out.println("Max number in array: " + maxNumber);
    }
}
