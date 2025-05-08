package Prim.Task0702;

//Создай по одной переменной каждого примитивного целочисленного типа в классе Solution.
//Этим переменным присвой максимально возможное для них значение.
//Никаких методов создавать не нужно.
//
//        Требования:
//        •	В классе Solution должны быть созданы переменные всех примитивных целочисленных типов.
//•	Всем целочисленным переменным должно быть присвоено максимально возможное для них значение.
//•	В классе Solution не должно быть создано никаких методов.

public class Main {
    static byte bt = Byte.MAX_VALUE;
    static short s = Short.MAX_VALUE;
    static int i = Integer.MAX_VALUE;
    static long l = Long.MAX_VALUE;

    public static void main(String[] args) {
        System.out.println(bt);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
    }
}
