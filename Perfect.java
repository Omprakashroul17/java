
import java.util.Scanner;
public class Perfect {
    public static void main(String[] args) {
       try(Scanner sc=new Scanner(System.in)){
        System.out.println("enter starting point");
        int n=sc.nextInt();
        System.out.println("enter ending point");
        int m=sc.nextInt();
        int count=0;
        for(int i=n;i<=m;i++){
            int sum=0;
        for(int j=1;j<=i/2;j++){
            if(i%j==0){
                sum +=j;
            }
        }
        if(sum==i){
            count++;
            if(count%2!=0)
            System.out.println(i);
        }
    }
        
    }
}
}
