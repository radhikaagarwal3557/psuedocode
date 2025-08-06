public class solution36 {
 public static int add(int a, int b) {
  return a + b;
 }
 public static void main(String[] args) {
  int x = add(add(2, 3), 4); // add(5, 4) => 9
  System.out.println(x);
 }
}
// Output: 9
