import java.io.*;
import java.util.*;

class UserMainCode {
    public int getCodeThroughStrings(String input1) {
        // Step 1: Split sentence into words
        String[] words = input1.split(" ");
        int totalLength = 0;

        // Step 2: Add the length of each word
        for (String word : words) {
            totalLength += word.length();
        }

        // Step 3: Reduce to a single digit
        while (totalLength >= 10) {
            int sum = 0;
            while (totalLength > 0) {
                sum += totalLength % 10;
                totalLength /= 10;
            }
            totalLength = sum;
        }

        // Step 4: Return single digit PIN
        return totalLength;
    }

    // For quick testing
    public static void main(String[] args) {
        UserMainCode obj = new UserMainCode();
        System.out.println(obj.getCodeThroughStrings("Wipro Technologies")); // 8
        System.out.println(obj.getCodeThroughStrings("The Good The Bad and The Ugly")); // 5
    }
}