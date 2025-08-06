public class solution40 {
 public static int f(int x) {
  return x + 1;
 }
 public static void main(String[] args) {
  int a = f(f(f(1))); // f(f(2)) = f(3) = 4
  System.out.println(a);
 }
}
// Output: 4
