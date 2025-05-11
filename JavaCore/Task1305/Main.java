package Task1305;

//Исправь 4 ошибки в программе, чтобы она компилировалась.
//
//        Требования:
//        •	У переменных, объявленных в интерфейсе, может быть только самый широкий
//уровень доступа (public).
//        •	Унаследоваться (extends) можно только от класса: для реализации интерфейсов
//используется ключевое слово implements.
//        •	Класс Hobby должен быть объявлен с модификатором доступа static.
//        •	Для доступа к переменной HOBBY не нужно создавать объект Dream.
//        •	Объявления интерфейсов не изменя

public class Main {
    public static void main(String[] args) {

        System.out.println(Dream.HOBBY.toString());
        System.out.println(new Hobby().toString());

    }

    interface Desire {
    }

    interface Dream {
        static Hobby HOBBY = new Hobby();
    }

    static class Hobby implements Dream, Desire {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }
}
