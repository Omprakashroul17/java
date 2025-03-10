import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int original = n;
        int count=0;
        while(n>0){
           n/=10;
           count++;
        }
        System.out.println(count);
        n=original;
        int sum=0;
        while(n>0){
          int b=n%10;
          int fact=1;
          for(int i=1;i<=count;i++){
            fact*=b;
          }
          sum+=fact;
          n/=10;
        }  
        if(sum==original){
            System.out.println("the number is armstrong");
        }
        else{
            System.out.println("the number is not a armstrong");
        }
        sc.close();
      }
}
