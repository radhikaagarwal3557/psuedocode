public class LogicalMCQAnswers {
    public static void main(String[] args) {
        // Question 11
        int x = 5, y = 3;
        int z = x + y * x - 2;
        System.out.println("Q11: " + z); // 18

        // Question 12
        x = 11; y = 4;
        int result = (x - y + 121) % x;
        System.out.println("Q12: " + result); // 7

        // Question 13
        x = 10; y = 4;
        z = x * (x - y) % y / x;
        System.out.println("Q13: " + z); // 0

        // Question 14
        int a = 2, b = 5;
        int c = (a + b) * (b - a);
        System.out.println("Q14: " + c); // 21

        // Question 15
        x = 8; y = 3;
        z = x % y * 2;
        System.out.println("Q15: " + z); // 4

        // Question 16
        a = 4; b = 9;
        if (a < 5 || b > 10) {
            System.out.println("Q16: Yes");
        } else {
            System.out.println("Q16: No");
        }

        // Question 17
        x = 7; y = 2;
        if (x > y && y < 3) {
            System.out.println("Q17: Inside");
        } else {
            System.out.println("Q17: Outside");
        }

        // Question 18
        x = 5; y = 10;
        if (x > 0 || y < 5) {
            System.out.println("Q18: Case1");
        } else {
            System.out.println("Q18: Case2");
        }

        // Question 19
        x = 0;
        if (!(x != 0)) {
            System.out.println("Q19: Zero");
        } else {
            System.out.println("Q19: Non-zero");
        }

        // Question 20
        a = 5; b = 2;
        if ((a > 3 && b < 3) || (a - b > 1)) {
            System.out.println("Q20: True");
        } else {
            System.out.println("Q20: False");
        }

        // Question 21
        a = 5; b = 3;
        c = (a & b) << 1;
        System.out.println("Q21: " + c); // 2

        // Question 22
        a = 5; b = 3;
        c = a ^ (b & a);
        System.out.println("Q22: " + c); // 4

        // Question 23
        a = 2;
        b = a << 2 | 1;
        System.out.println("Q23: " + b); // 9

        // Question 24
        a = 16;
        b = a >> (2 + 1);
        System.out.println("Q24: " + b); // 2

        // Question 25
        a = 4; b = 6;
        c = (a | b) >> 1;
        System.out.println("Q25: " + c); // 3
    }
}
