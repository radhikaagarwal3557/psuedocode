public class Q35 {
    public static void f(int a, int b) {
        a = a + b; // 8
        b = a - b; // 3
        a = a - b; // 5
        System.out.println("Swapped inside: " + a + " " + b);
    }

    public static void main(String[] args) {
        int x = 3, y = 5;
        f(x, y);
        System.out.println("Original outside: " + x + " " + y);
    }
}
