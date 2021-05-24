package javaElementary.homework;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String, String> eurovisionHashMap = new HashMap<>();
        String key_1 = "place 1";
        String key_2 = "place 2";
        String key_3 = "place 3";
        String country1 = "Switzerland";
        String country2 = "Italy";
        String country3 = "France";
        String country4 = "Iceland";

        eurovisionHashMap.put(key_1, country2);
        eurovisionHashMap.put(key_2, country3);
        eurovisionHashMap.put(key_3, country1);
        System.out.println(eurovisionHashMap);

        eurovisionHashMap.remove(key_1, country2);
        System.out.println(eurovisionHashMap);

        eurovisionHashMap.replace(key_2, country3, country4);
        System.out.println(eurovisionHashMap);
    }
}
