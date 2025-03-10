import java.util.Scanner;
public class Special {
    public static void main(String[] args) {
      try(  Scanner sc=new Scanner(System.in)){
        int sum=0;
        int fact=1;
        int num=0;
        for(int i=100;i<=1000;i++){
            int b=i%10;
            sum+=b;
            fact*=b;
            i/=10;
        
        num=sum+fact;
        if(num==i){
            System.out.println(i);
        }
        }
      }
    }
}
