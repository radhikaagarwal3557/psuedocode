public class solution46 {
 public static int f(int x) {
  return x % 2 == 0 ? x : f(x - 1); // 7→6 (even)
 }
 public static void main(String[] args) {
  System.out.println(f(7));
 }
}
// Output: 6
