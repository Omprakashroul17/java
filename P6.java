//12345
//54321
//12345
//54321
//12345
import java.util.Scanner;
public class P6{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2!=0){
             for(int j=1;j<=n;j++){
                System.out.print(j);
             }
            }
             else{
                for(int j=n;j>=1;j--){
                  System.out.print(j);
                }
             }
             System.out.println();
            }
            sc.close();
        }
    }

