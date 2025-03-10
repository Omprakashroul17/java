/* for n = 6
 * 1
 * 7    2
 * 12   8   3
 * 16   13  9   4
 * 19   17  14  10  5
 * 21   20  18  15  11  6
 */

 import java.util.Scanner;

 public class P20 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("n: ");
         int n = sc.nextInt();
         int k = 1, temp;
 
         for (int i = 1; i <= n; i ++) {
             temp = k;
             for (int j = i; j >= 1; j --) {
                 System.out.print(temp + " ");
                 temp -= (n - j + 1);
             }
             k += (n - i + 1);
             System.out.println();
         }
     }
 }
 
