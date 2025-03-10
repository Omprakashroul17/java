import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of steps: ");
            int step = sc.nextInt();

            if (step <= 0) {
                System.out.println("Please enter a positive integer.");
                return;
            }

            int a = 0, b = 1, c;
            System.out.print("Fibonacci Series: " + a); 

            for (int i = 1; i < step; i++) {
                System.out.println(b);
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println();
        }
    }
}



