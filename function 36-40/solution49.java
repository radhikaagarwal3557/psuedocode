public class solution49 {
 public static int funA(int n) {
  if (n <= 0) return 0;
  return n + funB(n - 1);
 }
 public static int funB(int n) {
  if (n <= 0) return 0;
  return n + funA(n / 2);
 }
 public static void main(String[] args) {
  System.out.println(funA(4));
 }
}
/*
funA(4) → 4 + funB(3)
funB(3) → 3 + funA(1)
funA(1) → 1 + funB(0)
funB(0) → 0
=> Total: 4 + 3 + 1 = 8
*/
// Output: 8
