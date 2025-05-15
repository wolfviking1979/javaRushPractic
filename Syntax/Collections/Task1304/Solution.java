package Collections.Task1304;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Arrays;

public class Solution {
    public static void printList(ArrayList<String> words) {
//        for (Iterator<String> iterator = words.iterator(); iterator.hasNext(); ) {
//            String word = iterator.next();
//            System.out.println(word);
//        }

        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void printHashSet(HashSet<String> words) {
//        Iterator<String> iterator = words.iterator();
//        while (iterator.hasNext()) {
//            String word = iterator.next();
//            System.out.println(word);
//        }
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        String[] wordsArray = "Думаю, это будет новой фичей. Только не говорите никому, что она возникла случайно.".split(" ");
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(wordsArray));
        HashSet<String> wordsHashSet = new HashSet<>(wordsList);
        printList(wordsList);
        System.out.println("__________________________________");
        printHashSet(wordsHashSet);
    }
}
