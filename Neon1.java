
import java.util.Scanner;
public class Neon1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter start:");
        int start=sc.nextInt();
        System.out.println("enter end:");
        int end=sc.nextInt();
        
        for(int i=start;i<=end;i++){
            int sq=i*i;
            int sum=0;
            while(sq>0){
                int b=sq%10;
                sum+=b;
                sq/=10;
            }
            if(sum==i){
                System.out.println(i);
            }
        }
    }
}
