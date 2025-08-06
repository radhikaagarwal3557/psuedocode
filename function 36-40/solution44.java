public class solution44 {
 public static int call(int x) {
  return x + 2;
 }
 public static void main(String[] args) {
  int result = call(call(call(0))); // call(2) = 4, call(4) = 6
  System.out.println(result);
 }
}
// Output: 6
