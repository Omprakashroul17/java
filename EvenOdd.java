import java.util.Scanner;
class EvenOdd {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
        System.out.println("print a number");
        int n= sc.nextInt();
        int oddSum=0;
        int evenSum=0;
        while(n>0){
            int a=n%10;
            
            if(a%2==0){
                evenSum +=a;
            }
            else{
                oddSum +=a;
            }
        n = n/10;
        }
    System.out.println("even sum ="+evenSum);
    System.out.println("odd sum="+oddSum);
        }
    }
}
