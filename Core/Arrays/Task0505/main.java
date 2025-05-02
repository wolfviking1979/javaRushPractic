package Arrays.Task0505;
//Тебе нужно написать программу, которая:
//
//Считывает с консоли целое число N.
//Если считанное число N больше 0, то программа дальше
//считывает целые числа, количество которых равно N.
//Вывести в консоль считанные числа, если N нечетное — в порядке
//        ввода, иначе — в обратном порядке.
//Каждое число выводить с новой строки. Число N выводить не нужно.
//        Требования:
//Программа должна считывать число N и за ним еще N чисел.
//В классе должен быть метод public static void main(String[]).
//Нельзя добавлять новые методы в класс Solution.
//Программа должна выводить введенные N чисел в обратном порядке, если N чётное.
//Программа должна выводить введенные N чисел в том же порядке, если N нечётное.

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = scanner.nextInt();
        }

        if (n % 2 == 0) {
            for (int i = data.length - 1; i >= 0; i--) {
                System.out.println(data[i]);
            }
        } else {
            for (int i = 0; i < data.length; i++) {
                System.out.println(data[i]);
            }
        }
    }
}
