package hbcu.stay.ready.algor;
import java.util.HashMap;
import java.util.Iterator;
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

        Integer numberOfUniqueWords = numOfOccurences(mapA);

        String emptyString = "";
        emptyString += "The " + numberOfUniqueWords + " unique words are:\n";

        Iterator<Map.Entry<String, Integer>> itr = mapA.entrySet().iterator();

        while(itr.hasNext())
        {
            Map.Entry<String, Integer> mapinput = itr.next();
            if (!itr.hasNext()){
                emptyString += mapinput.getKey() + " (seen " + mapinput.getValue() + ")";
            }
            else{
                emptyString += mapinput.getKey() + " (seen " + mapinput.getValue() + ")";
                emptyString += "\n";
            }
        }

        return emptyString;
    }

    private Integer numOfOccurences(Map<String, Integer> map){
        Integer count = 0;
        for(Map.Entry<String, Integer> input: map.entrySet()){
            count ++;
        }
        return count;
    }
}