package Task1301;

//В этой задаче тебе нужно:
//
//Подумать, какой из двух интерфейсов нужно реализовать в классе BeerLover.
//Добавить к классу BeerLover этот интерфейс и реализовать все его методы.
//        Подумать, как связаны переменная READY_TO_GO_HOME и метод isReadyToGoHome.
//Вернуть значение переменной READY_TO_GO_HOME в методе isReadyToGoHome.
//        Требования:
//        •	Класс BeerLover должен реализовывать(implements) интерфейс Alcoholic.
//        •	Класс BeerLover не должен реализовывать интерфейс Drinker напрямую
//        (только опосредованно - через Alcoholic)
//•	В классе BeerLover должны быть реализованы все методы интерфейса Alcoholic.
//        •	В классе BeerLover должны быть реализованы все методы интерфейса Drinker.
//        •	Метод isReadyToGoHome должен возвращать значение переменной READY_TO_GO_HOME.

public class Main {
    public static void main(String[] args) throws Exception {
    }

    public interface Drinker {
        void askForMore(String message);

        void sayThankYou();

        boolean isReadyToGoHome();
    }

    public interface Alcoholic extends Drinker {
        boolean READY_TO_GO_HOME = false;

        void sleepOnTheFloor();
    }

    public static class BeerLover implements Alcoholic {
        @Override
        public void sleepOnTheFloor() {

        }

        @Override
        public void askForMore(String message) {

        }

        @Override
        public void sayThankYou() {

        }

        @Override
        public boolean isReadyToGoHome() {
            return READY_TO_GO_HOME;
        }
    }
}
