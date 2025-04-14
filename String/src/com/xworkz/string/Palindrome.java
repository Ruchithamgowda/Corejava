package com.xworkz.string;

public class Palindrome {
        public static void isPalindrome(String str) {
            String cleaned = str.replaceAll("\\s+", "").toLowerCase();
            int i = 0, j = cleaned.length() - 1;
            boolean palindrome = true;

            while (i < j) {
                if (cleaned.charAt(i) != cleaned.charAt(j)) {
                    palindrome = false;
                    break;
                }
                i++;
                j--;
            }

            System.out.println("Is Palindrome: " + palindrome);
        }

        public static void main(String[] args) {
            String input = "Ruchitha";
            isPalindrome(input);
        }
    }