package Collections.Task1309;

import java.util.HashMap;

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("A+", 1.0);
        grades.put("A-", 1.0);
        grades.put("B+", 1.0);
        grades.put("B-", 1.0);
    }
}
