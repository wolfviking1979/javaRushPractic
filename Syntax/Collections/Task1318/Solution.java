package Collections.Task1318;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.FEBRUARY));
    }

    public static Month getNextMonth(Month month) {
        if (month == Month.DECEMBER) {
            return Month.JANUARY;
        }

        return Month.values()[month.ordinal() + 1];
    }
}
