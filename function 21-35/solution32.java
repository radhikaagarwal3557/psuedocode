public class solution32 {
    static int x = 10;

    public static void change() {
        x = x + 5;
    }

    public static void main(String[] args) {
        change();
        System.out.println(x);
    }
}
