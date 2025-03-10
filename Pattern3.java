
import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int n=sc.nextInt();
        int count=1;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
            for(int j=1;j<=n;j++){
                System.out.print(count);
                count++;
            }
            }
            else{
                int temp = count + n - 1;
                for (int j = 1; j <= n; j++) {
                    System.out.print(temp);
                    temp--;
                    count++;
            }
        }
        System.out.println();
        }
        sc.close();
    }
}
