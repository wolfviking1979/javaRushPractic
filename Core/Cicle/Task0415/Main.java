package Cicle.Task0415;


//Ввести с клавиатуры положительное целое число radius.
//Это будет радиус окружности.
//Вывести на экран площадь круга, рассчитанную по формуле: S = pi * radius * radius.
//Результатом должно стать целое число (тип int). Для этого нужно привести к типу
//int результат умножения (отбросить дробную часть, округлив вниз до целого числа).
//В качестве значения pi используй 3.14.
//
//Пример ввода:
//        5
//
//Пример вывода:
//        78
//
//Требования:
//        •	Программа должна считывать целое число c клавиатуры.
//•	Программа должна выводить число на экран.
//        •	Программа должна выводить на экран площадь круга радиусом
//        radius, приведенную к целому числу.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14;
        int squareS;
        int radius;
        int result = 0;
        System.out.println("Enter the radius of the square: ");
        radius = sc.nextInt();
        squareS = (int)(PI * radius * radius);
        System.out.println("Square: " + squareS);
    }
}
