package javaPractice;

import java.util.HashMap;
import java.util.Map;

public class coundOfWords {
    public static void main(String[] args) {
        String str="One word more than everything";
        // this function is used to get the exact word length of the sentence using the split to remove the white spaces and length to get the count
        int count=str.split("\\s").length;// ("\\s") is used to find the space character
        System.out.println(count);

        String letter= "One word more than everything";
        letter=letter.replaceAll("\\s","").toLowerCase();

        HashMap<Character,Integer> count2=new HashMap<>();
        for (Character c:letter.toCharArray()){
            count2.put(c,count2.getOrDefault(c,0)+1);

        }
        for (Map.Entry<Character, Integer> entry : count2.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        String sentence = "Hello World";
        int count3 = sentence.replaceAll("\\s", "").length(); // Remove spaces and count letters

        System.out.println("Total letter count: " + count3);
    }

}

