package Task0406;
import java.util.Scanner;


//Вводим данные с клавиатуры и сразу их выводим на экран, пока не будет введено слово "enough".
//Слово "enough" выводить не нужно.
//Для этого необходимо использовать бесконечный цикл (while(true)).
//
//Подсказка: чтобы завершить бесконечный цикл, используй оператор break.
//
//Требования:
//        •	Программа должна считывать данные c клавиатуры.
//        •	В программе необходимо использовать цикл while.
//        •	Для завершения бесконечного цикла необходимо использовать оператор break.
//        •	Программа должна выводить в консоли все введенные данные с новой строки,
//        пока не будет введено слово "enough".

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter word: ");
            String input = scanner.nextLine();
            if (input.equals("enough")) {
                System.out.println("You have enough words!");
                break;
            } else {
                System.out.println(input);
            }
        }
    }
}
