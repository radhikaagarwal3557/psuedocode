public class solution31 {
    public static int increment(int x) {
        x = x + 1;
        return x;
    }

    public static void main(String[] args) {
        int a = increment(2);
        int b = increment(a);
        System.out.println(b);
    }
}
