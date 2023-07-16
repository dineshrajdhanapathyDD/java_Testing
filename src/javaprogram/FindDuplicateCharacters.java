package javaprogram;


import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacters {
    public static void findDuplicateCharacters(String str) {
        // Create a HashMap to store character counts
        Map<Character, Integer> charCounts = new HashMap<>();

        // Convert the string to lowercase (optional)
        str = str.toLowerCase();

        // Iterate over each character in the string
        for (char ch : str.toCharArray()) {
            // If the character is already in the HashMap, increment its count
            if (charCounts.containsKey(ch)) {
                charCounts.put(ch, charCounts.get(ch) + 1);
            } else {
                charCounts.put(ch, 1);
            }
        }

        // Print the duplicate characters
        System.out.println("Duplicate characters:");
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        String inputString = "Hello World";
        findDuplicateCharacters(inputString);
    }
}
