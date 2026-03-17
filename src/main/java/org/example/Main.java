package org.example;

import java.util.Stack;

public class Main {

    public static boolean checkForPalindrome(String input) {
        if (input == null) return false;

        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        Stack<Character> stack = new Stack<>();
        for (char c : cleanedInput.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversedInput = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedInput.append(stack.pop());
        }

        return cleanedInput.equals(reversedInput.toString());
    }

    public static String convertDecimalToBinary(int decimal) {
        if (decimal == 0) return "0";

        Stack<Integer> remainders = new Stack<>();

        while (decimal > 0) {
            remainders.push(decimal % 2);
            decimal = decimal / 2;
        }

        StringBuilder binaryString = new StringBuilder();
        while (!remainders.isEmpty()) {
            binaryString.append(remainders.pop());
        }

        return binaryString.toString();
    }

    public static void main(String[] args) {

        System.out.println("--- CHALLENGE I: Palindrome Testleri ---");
        System.out.println("I did, did I? => " + checkForPalindrome("I did, did I?"));
        System.out.println("Racecar => " + checkForPalindrome("Racecar"));
        System.out.println("hello => " + checkForPalindrome("hello"));
        System.out.println("Was it a car or a cat I saw ? => " + checkForPalindrome("Was it a car or a cat I saw ?"));


        System.out.println("\n--- CHALLENGE II: WorkintechList Testleri ---");
        WorkintechList<String> list = new WorkintechList<>();
        list.add("Zebra");
        list.add("Apple");
        list.add("Monkey");
        list.add("Apple");

        System.out.println("Ekleme sonrası liste: " + list);
        list.sort();
        System.out.println("sort() sonrası liste: " + list);
        list.remove("Monkey");
        System.out.println("Eleman silindikten sonra otomatik sıralı liste: " + list);


        System.out.println("\n--- CHALLENGE III: Decimal To Binary Testleri ---");
        System.out.println("5 in Binary: " + convertDecimalToBinary(5));
        System.out.println("6 in Binary: " + convertDecimalToBinary(6));
        System.out.println("13 in Binary: " + convertDecimalToBinary(13));
    }
}