import java.io.*;
import java.util.*;

class UserMainCode {
    public int findStringCode(String input1) {
        // Split sentence into words
        String[] words = input1.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            word = word.toUpperCase(); // Case-insensitive
            int sum = 0;
            int left = 0;
            int right = word.length() - 1;

            while (left <= right) {
                int leftVal = word.charAt(left) - 'A' + 1;   // A=1, B=2 ...
                int rightVal = word.charAt(right) - 'A' + 1;

                if (left == right) {
                    // Middle character (when word length is odd)
                    sum += leftVal;
                } else {
                    sum += Math.abs(leftVal - rightVal); // Absolute difference
                }
                left++;
                right--;
            }
            result.append(sum); // Append sum for this word
        }

        return Integer.parseInt(result.toString());
    }
    
    // For testing
    public static void main(String[] args) throws Exception {
        UserMainCode obj = new UserMainCode();
        System.out.println(obj.findStringCode("World Wide Web")); // 402326
        System.out.println(obj.findStringCode("Hello World"));    // 2640
    }
}