public class solution29 {
    public static void outer() {
        int x = 2;
        class Inner {
            void inner() {
                System.out.println(x);
            }
        }
        Inner i = new Inner();
        i.inner();
    }

    public static void main(String[] args) {
        outer();
    }
}
