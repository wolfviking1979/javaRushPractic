package Arrays.Task0501;

//В методе main проинициализируй переменные intArray
//и doubleArray массивами соответствующих типов, размер которых равен 10.
//
//Требования:
//        •	В методе main(String[]) проинициализируй переменную
//intArray согласно условию.
//        •	В методе main(String[]) проинициализируй переменную
//doubleArray согласно условию.

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        double[] numbers2 = new double[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            numbers2[i] = numbers[i];
        }

        for (int i = 0; i < numbers2.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers2[i] + " ");
        }

    }
}
