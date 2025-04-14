package com.xworkz.string;

public class ReplaceSpace {
        public static void replaceSpace(String sentence) {
            String replaced = sentence.replace(" ", "%");
            System.out.println("Replaced Sentence: " + replaced);
        }
        public static void main(String[] args) {
            String input = "hello Ruchitha Gowda";
            replaceSpace(input);
        }
    }