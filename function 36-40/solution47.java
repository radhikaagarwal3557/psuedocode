public class solution47 {
 public static int f(int a) {
  return a + 1;
 }
 public static int g(int a) {
  return f(a) * 2; // f(3)=4 → 4*2=8
 }
 public static void main(String[] args) {
  System.out.println(g(3));
 }
}
// Output: 8
