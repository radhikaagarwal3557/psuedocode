public class solution48 {
 public static int decide(int a) {
  if (a > 5) return 10;
  return 5;
 }
 public static void main(String[] args) {
  System.out.println(decide(3) + decide(6)); // 5 + 10 = 15
 }
}
// Output: 15
