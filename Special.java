import java.util.Scanner;

public class SpecialNumberRange {
    public static boolean isSpecialNumber(int num) {
        int sum = 0, product = 1, original = num;

        while (num > 0) {
            int digit = num % 10;      
            sum += digit;              
            product *= digit;          
            num /= 10;                 
        }
        return (sum + product == original);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in)
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();
        System.out.println("Special numbers in the range (" + start + " to " + end + "):");
        boolean found = false;

        for (int i = start; i <= end; i++) {
            if (isSpecialNumber(i)) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No special numbers found in the given range.");
        }

        scanner.close();
    }
}
