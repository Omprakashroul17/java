import java.util.Scanner;
class Divisors{
    public static void main(String[] args) {
       try( Scanner sc=new Scanner(System.in)){
        System.out.println("enter a number");
        int n=sc.nextInt();
        int i;
        for(i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
       }
    }
}