import java.util.Scanner;
public class Neon{
    public static void main(String[] args) {
     try(  Scanner sc=new Scanner(System.in)){
        System.out.println("enter a number:");
        int n=sc.nextInt();
        int a=n*n;
        int sum=0;
        while(a>0){
            int b=a%10;
            sum+=b;
            a/=10;
        }
        if(sum==n){
            System.out.println("the number is neon number");
        }
        else{
            System.out.println("the number is not a neon number");
        }
        }
    }
}
