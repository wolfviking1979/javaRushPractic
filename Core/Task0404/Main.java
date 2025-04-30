package Task0404;

//Используя вложенные циклы while (цикл в цикле) выведи на экран прямоугольник размером
// 5 (высота) на 10 (ширина), заполненный буквой 'Q'.
//
//Пример вывода:
//QQQQQQQQQQ
//QQQQQQQQQQ
//QQQQQQQQQQ
//QQQQQQQQQQ
//QQQQQQQQQQ
//
//Требования:
//        •	Программа должна выводить текст на экран.
//        •	Программа должна выводить прямоугольник высотой 5 и шириной 10, заполненный буквами 'Q'.
//        •	В программе необходимо использовать вложенные циклы while (цикл в цикле).
//        •	Вывод на экран должен происходить в цикле while.

public class Main {
    public static void main(String[] args) {
        int height = 5;

        while (height > 0) {
            int width = 10;
            while (width > 0) {
                System.out.print("Q");
                width--;
            }
            System.out.println();
            height--;
        }
    }
}
