public class solution37 {
 public static int square(int x) {
  return x * x;
 }
 public static void main(String[] args) {
  int res = square(square(2)); // square(4) => 16
  System.out.println(res);
 }
}
// Output: 16
