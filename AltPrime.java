import java.util.Scanner;
class AltPrime {
  public static void main(String[] args) {
    try(Scanner sc=new Scanner(System.in)){
        System.out.println("enter starting number:");
        int start=sc.nextInt();
        System.out.println("enter ending number:");
        int end=sc.nextInt();
        int count=0;
        for(int i=start;i<=end;i++){
          if(i==1)continue;
        boolean isPrime=true;
        for(int j=2;j<=i/2;j++){
            if(i%j==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            count++;
            if(count%2!=0)
            System.out.println(i+"");
        }
        }
    }
  }  
}