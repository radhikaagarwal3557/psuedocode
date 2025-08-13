import java.io.*;
import java.util.*;

class UserMainCode {
    public String addNumberStrings(String input1, String input2) {
        // Start from the end of both strings
        int i = input1.length() - 1;
        int j = input2.length() - 1;
        int carry = 0;
        
        StringBuilder result = new StringBuilder();
        
        // Loop until both strings are processed or carry is left
        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? input1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? input2.charAt(j) - '0' : 0;
            
            int sum = digit1 + digit2 + carry;
            result.append(sum % 10);  // Last digit of sum
            carry = sum / 10;         // Carry for next position
            
            i--;
            j--;
        }
        
        // Reverse the result since we built it backwards
        return result.reverse().toString();
    }
    
    // Testing
    public static void main(String[] args) {
        UserMainCode obj = new UserMainCode();
        System.out.println(obj.addNumberStrings("1234", "56")); // 1290
        System.out.println(obj.addNumberStrings("56", "1234")); // 1290
        System.out.println(obj.addNumberStrings("123456732128989543219", "987612673489652"));
        // Expected: 123457719741663032871
    }
}