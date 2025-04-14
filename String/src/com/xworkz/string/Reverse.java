package com.xworkz.string;

public class Reverse {
        public static void reverseSentence(String sentence) {
            StringBuilder reversed = new StringBuilder(sentence);
            reversed.reverse();
            System.out.println("Reversed Sentence: " + reversed);
        }
        public static void main(String[] args) {
            String sentence = "Hi Ruchitha Gowda";
            reverseSentence(sentence);
        }
    }