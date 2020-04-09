package me.kokeria.chatcalc.util;

public class ChatHelper {

    public static String getWord(String input, int cursor) {

        return input.substring(getStartOfWord(input, cursor), getEndOfWord(input, cursor));

    }

    public static int getStartOfWord(String input, int cursor) {
        if (cursor == 0) return 0;
        if (input.charAt(cursor - 1) == ' ') return cursor;
        for (int i = cursor - 1; i > 0; i--) {
            if (input.charAt(i - 1) == ' ') return i;
        }
        return 0;
    }

    public static int getEndOfWord(String input, int cursor) {
        if (cursor == input.length() - 1) return cursor;
        for (int i = cursor; i < input.length(); i++) {
            if (input.charAt(i) == ' ') return i;
        }
        return input.length();
    }

}