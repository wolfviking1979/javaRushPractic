package Prim.Task0703;

//Создай по одной переменной каждого примитивного целочисленного типа в классе Solution.
//Этим переменным присвой минимально возможное для них значение.
//Никаких методов создавать не нужно.
//
//        Требования:
//        •	В классе Solution должны быть созданы переменные всех примитивных целочисленного типов.
//•	Всем целочисленным переменным должно быть присвоено минимально возможное для них значение.
//•	В классе Solution не должно быть создано никаких методов.

public class Main {
    private static byte bt = Byte.MIN_VALUE;
    private static short sh = Short.MIN_VALUE;
    private static int in = Integer.MIN_VALUE;
    private static long lng = Long.MIN_VALUE;


    public static void main(String[] args) {
        System.out.println(bt);
        System.out.println(sh);
        System.out.println(in);
        System.out.println(lng);
    }
}
