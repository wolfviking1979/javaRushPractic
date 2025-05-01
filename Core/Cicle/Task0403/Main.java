package Cicle.Task0403;


import java.util.Scanner;

//Напишем программу, в которой нужно вводить с клавиатуры целые числа и считать их сумму,
// пока пользователь не введет слово "ENTER".
//Вывести на экран полученную сумму и завершить программу.
//
//Требования:
//        •	Программа должна считывать данные c клавиатуры.
//        •	Необходимо посчитать сумму введенных целых чисел
//        и вывести её на экран, если пользователь ввел стоп слово.
//•	В программе необходимо использовать цикл while.
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = 0;
        while (true) {
            System.out.println("Введите целое число: ");
            String input = console.nextLine();
            if (input.equals("enter")) {
                break;
            }
            n+= Integer.parseInt(input);
        }

        System.out.println("Сумма введенных чисел: " + n);
    }
}
