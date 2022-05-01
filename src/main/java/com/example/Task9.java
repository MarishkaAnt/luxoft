package com.example;

import java.util.*;

/**
 * @author MARIIA
 * Assume "?" is like a backspace in string.
 * This means that string "j?dew?u?v" actually is "dev"
 * Your task is to process a string with "?" symbols.
 * In the input: s - string
 * At the output: string
 * Example:
 * 1."jn?y??bd" -->  "bd"
 * 2."jkn????h??" -->  ""
 * 3."" -->  ""
 */

public class Task9 {
    public static String applyBackspaces(String s) {
        String result = s;
        if (s == null || s.isBlank()) {
            result = "";
        }

        if (result.contains("?")) {
            ArrayList<String> letters = new ArrayList<>(Arrays.stream(s.split("")).toList());
            for (int i = 0, lettersSize = letters.size(); i < lettersSize; i++) {
                String l = letters.get(i);
                if (l.equals("?")) {
                    letters.remove(i);
                    letters.remove(i - 1);
                    lettersSize -= 2;
                    i = 0;
                }
            }
            result = String.join("", letters);
        }
        return result;
    }

}
