package Math.Task0809;

//В классе Solution реализуй метод printNumbers(), который выводит числа
//    от 1 до 10 включительно с паузой между выводом каждого числа — 1,3
//миллисекунды. В этом тебе поможет метод sleep(long, int) класса Thread,
//который должен сработать 9 раз.
//
//        Требования:
//        •	Реализуй метод printNumbers() согласно условию.

public class Main {
    public static void main(String[] args) throws InterruptedException {
        printNumbers();
    }

    public static void printNumbers() throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            Thread.sleep(1000, 300_000);
        }
    }
}
