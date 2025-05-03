package Arrays.Task0508;

//В этой задаче тебе нужно:
//
//Считать 6 строк и заполнить ими массив strings.
//Удалить повторяющиеся строки из массива strings, заменив их
//на null (null должны быть не строками "null").
//Примеры.
//
//Массив после чтения строк:
//        {"Hello", "Hello", "World", "Java", "Tasks", "World"}
//Массив после удаления повторяющихся строк:
//        {null, null, null, "Java", "Tasks", null}
//
//Требования:
//        •	В методе main(String[]) считай с клавиатуры 6 строк и заполнить ими массив strings.
//        •	В методе main(String[]) удали(заменить строку на null) элементы из массива
//strings с одинаковыми строками.

import java.util.Scanner;

public class Main {
    public static String[] strings = new String[5];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            strings[i] = scanner.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {
            String currentString = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if (currentString == null) {
                    break;
                }
                if (currentString.equals(strings[j])) {
                    strings[j] = null;
                    strings[i] = null;
                }
            }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
