package Task1226;

//Вот что тебе нужно сделать в этой задаче:
//
//Внутри класса Solution создай интерфейс public interface CanFly (летать) с методом void fly().
//Внутри класса Solution создай интерфейс public interface CanClimb (лазить по деревьям) с методом void climb().
//Внутри класса Solution создай интерфейс public interface CanRun (бегать) с методом void run().
//        Подумай логически, какие именно интерфейсы нужно добавить для каждого класса.
//Добавь интерфейсы классам Cat (кот), Dog (собака), Tiger (тигр), Duck (Утка).
//Требования:
//        •	Класс Solution должен содержать интерфейс CanFly с методом void fly().
//        •	Класс Solution должен содержать интерфейс CanClimb с методом void climb().
//        •	Класс Solution должен содержать интерфейс CanRun с методом void run().
//        •	Объект класса Cat должен уметь бегать (поддерживать интерфейс CanRun) и лазить по деревьям (поддерживать интерфейс CanClimb).
//        •	Объект класса Dog должен уметь бегать (поддерживать интерфейс CanRun).
//        •	Класс Tiger должен быть котом.
//•	Объект класса Duck должен уметь бегать (поддерживать интерфейс CanRun) и летать (поддерживать интерфейс CanFly).
public class Main {
    public static void main(String[] args) {

    }

    public class Cat implements CanRun, CanClimb  {
        @Override
        public void climb() {
            System.out.println("Кот лазает по деревьям");
        }

        @Override
        public void run() {
            System.out.println("Кот бегает");
        }
    }

    public class Dog implements CanRun {
        @Override
        public void run() {
            System.out.println("Собака бегает");
        }
    }

    public class Tiger extends Cat {
        @Override
        public void climb() {
            System.out.println("Кот лазает по деревьям");
        }

        @Override
        public void run() {
            System.out.println("Кот бегает");
        }
    }

    public class Duck {
    }

    public interface CanFly {
        void fly();
    }

    public interface CanClimb {
        void climb();
    }

    public interface CanRun {
        void run();
    }
}
