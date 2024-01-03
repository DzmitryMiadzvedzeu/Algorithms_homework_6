package com.telran.algorithms.hw;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    public static void main(String[] args) {
        String text = "Привет, дружище! Как дела?";

        Map<Character, Integer> frequencies = new HashMap<>();

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                frequencies.put(c, frequencies.getOrDefault(c, 0) + 1);
            }
        }
        System.out.println(frequencies);
    }
}
