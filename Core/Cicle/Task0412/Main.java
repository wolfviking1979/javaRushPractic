package Cicle.Task0412;

import java.util.Scanner;

//В методе main с клавиатуры считывается 3 целых числа: start,
//end (start <= end), multiple.
//        Допиши программу, чтобы на экран выводилась сумма чисел от
//start (включительно) до end (не включительно), кратных multiple.
//Для этого используй цикл for.
//Подсказка: чтобы перейти к следующей итерации цикла, используй оператор continue.
//
//Требования:
//        •	Программа должна вывести в консоль сумму чисел
//от start (включительно) до end (не включительно), кратных multiple.
//        •	В программе необходимо использовать цикл for.
//        •	В цикле for необходимо использовать оператор continue.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();

        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % multiple == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
