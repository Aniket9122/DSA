package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Stream;

public class CountingDuplicates {
  // public static int duplicateCount(String text) {
  // Map<Character,Integer> map = new HashMap<>();

  // for(Character c : text.toCharArray()){
  // c = Character.toLowerCase(c);
  // if(map.containsKey(c)){
  // map.put(c,map.get(c) + 1);
  // }
  // else{
  // map.put(c,1);
  // }
  // }

  // int count = 0;
  // for(Integer i : map.values()){
  // if(i > 1){
  // count++;
  // }
  // }
  // return count;
  // }

  public static int duplicateCount(String text) {
    Map<Character, Integer> map = new HashMap<>();

    for (Character c : text.toCharArray()) {
      c = Character.toLowerCase(c);
      if (map.containsKey(c)) {
        map.put(c, map.get(c) + 1);
      } else {
        map.put(c, 1);
      }
    }

    return (int) map.values().stream().filter(v -> v > 1).count();
  }

  public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    for (int i : nums) {
      if (set.contains(i)) {
        return true;
      } else {
        set.add(i);
      }
    }
    return false;
  }

  public void sampleTests() {
    doTest("", 0);
    doTest("abcde", 0);
    doTest("abcdeaa", 1);
    doTest("abcdeaB", 2);
    doTest("Indivisibilities", 2);
    doTest("abcdefghijklmnopqrstuvwxyz", 0);
    doTest("abcdefghijklmnopqrstuvwxyzaaAb", 2);
    doTest("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz", 26);
    doTest("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ", 26);
  }

  private static void doTest(String input, int expected) {
    String message = String.format("for input \"%s\"\n", input);
    int actual = CountingDuplicates.duplicateCount(input);
    System.out.println(message + "expected : " + expected + " actual : " + actual);
  }

  public static void main(String[] args) {
    CountingDuplicates countingDuplicates = new CountingDuplicates();
    countingDuplicates.sampleTests();
  }

}
