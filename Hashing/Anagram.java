package Hashing;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    // public static boolean isAnagram(String s, String t){
    // Map<Character, Integer> map = new HashMap<>();

    // for(Character c : s.toCharArray()){
    // if(map.containsKey(c)){
    // map.put(c, map.get(c)+1);
    // }
    // else{
    // map.put(c, 1);
    // }
    // }

    // for(Character c : t.toCharArray()){
    // if(map.containsKey(c)){
    // if(map.get(c) == 0 ){
    // return false;
    // }
    // else{
    // map.put(c, map.get(c) - 1);
    // }
    // }
    // else{
    // return false;
    // }
    // }

    // for(Integer i : map.values()){
    // if(i > 0){
    // return false;
    // }
    // }

    // return true;
    // }

    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        for (Character c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (Character c : t.toCharArray()) {
            if (map.containsKey(c)) {
                if (map.get(c) != 0) {
                    map.put(c, map.get(c) - 1);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        return !map.values().stream().anyMatch(v -> v > 0);
        // anyMatch will return true if the condition is met
    }

    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuvwxyz";
        String t = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(isAnagram(s, t));
    }
}