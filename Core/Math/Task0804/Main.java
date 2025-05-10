package Math.Task0804;

//В этой задаче тебе предстоит реализовать метод generateNumber(),
//который будет возвращать случайное число от 0 до 99.
//В методе generateNumber() используй метод Math.random().
//
//Требования:
//        •	В классе Solution должен быть публичный статический метод generateNumber()
//с типом возвращаемого значения int.
//        •	Реализуй метод generateNumber() согласно условию.

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(generateNumber());
    }

    public static int generateNumber() {
        int random = new Random().nextInt(100);

        return  random;
    }
}
