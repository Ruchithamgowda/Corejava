package com.xworkz.string;

public class CharFrequency {
        public static void characterFrequency(String sentence) {
            char[] chars = sentence.replace(" ", "").toCharArray();

            System.out.println("Character Frequency:");
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == 0) continue;

                char currentChar = chars[i];
                int count = 1;

                for (int j = i + 1; j < chars.length; j++) {
                    if (currentChar == chars[j]) {
                        count++;
                        chars[j] = 0;
                    }
                }
                System.out.println(currentChar + " -> " + count);
            }
        }

        public static void main(String[] args) {
            String input = "Ruchitha Gowda";
            characterFrequency(input);
        }
}
