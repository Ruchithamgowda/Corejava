package com.xworkz.string;

public class Target {
        public static void isWordPresent(String sentence, String target) {
            String[] words = sentence.split("\\s+");
            boolean found = false;
            for (String word : words) {
                if (word.equals(target)) {
                    found = true;
                    break;
                }
            }
            System.out.println("Word \"" + target + "\" present: " + found);
        }

        public static void main(String[] args) {
            String input = "hello Ruchitha Gowda";
            String targetWord = "Gowda";
            isWordPresent(input, targetWord);
        }
    }