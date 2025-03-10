
import java.util.Scanner;
public class Strong {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("enter a number:");
            int n=sc.nextInt();
            int temp=n;
            int sum=0;
            while(n>0){
                int b=n%10;
                int fact=1;
                for(int i=b;i>=1;i--){
                fact*=i;
                }
                n/=10;
                sum+=fact;
            }
            if(sum==temp){
                System.out.println("it is a strong number");
            }
            else{
                System.out.println("it is not a strong number");
            }
        }
    }
}
