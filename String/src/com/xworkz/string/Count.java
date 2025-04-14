package com.xworkz.string;

public class Count {
        public static void wordCount(String sentence) {
            String[] words = sentence.trim().split("\\s+");
            System.out.println("Word Count: " + words.length);
        }
        public static void main(String[] args) {
            String input = "Hello Ruchitha Gowda ";
            wordCount(input);
        }
    }