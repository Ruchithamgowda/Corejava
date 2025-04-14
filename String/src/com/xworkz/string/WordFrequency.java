package com.xworkz.string;

public class WordFrequency {
        public static void wordFrequency(String sentence) {
            String[] words = sentence.trim().toLowerCase().split("\\s+");
            System.out.println("Word Frequency:");
            for (int i = 0; i < words.length; i++) {
                int count = 1;
                if (!words[i].equals("")) {
                    for (int j = i + 1; j < words.length; j++) {
                        if (words[i].equals(words[j])) {
                            count++;
                            words[j] = "";  // Mark as counted
                        }
                    }
                    System.out.println(words[i] + " -> " + count);
                }
            }
        }
        public static void main(String[] args) {
            String input = "hello world hello x-works";
            wordFrequency(input);
        }
    }