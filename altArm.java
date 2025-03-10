import java.util.Scanner;

public class altArm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter start:");
        int start = sc.nextInt();
        System.out.println("Enter end:");
        int end = sc.nextInt();
         int alt=0;
        for (int num = start; num <= end; num++) {
            int temp = num;
            int count = 0;
            int copy = num; 

            
            while (copy > 0) {
                copy /= 10;
                count++;
            }

            int sum = 0;
            copy = num; 

        
            while (copy > 0) {
                int digit = copy % 10;
                int fact = 1;

            
                for (int j = 1; j <= count; j++) {
                    fact *= digit;
                }

                sum += fact;
                copy /= 10;
            }

            
            if (temp == sum) {
                alt++;
                if(alt%2!=0){
                System.out.println(temp); 
                }
            }
        }

        sc.close();
    }
}

