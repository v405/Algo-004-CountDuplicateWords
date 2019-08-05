package hbcu.stay.ready.algor;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public String countUniqueWords(String input) {
        String[] strArray = input.split(" ");
        Map<String, Integer> mapA = new HashMap();
        for (String str : strArray) {
            if (mapA.containsKey(str)) {
                int counter = mapA.get(str);
                mapA.put(str, ++counter);
            } else {
                mapA.put(str, 1);
            }

        }

        for (String str : mapA.keySet()){
            int duplicateC = mapA.get(str);
        }

        return "The 3 unique words are:\n" +
                "(Seen " + mapA.get(0)+" \n" +
                " "+"(Seen " + mapA.get(1)+" \n" +
                " "+"(Seen " + mapA.get(2)+" \n";


    }
}