// 5
// 1
// 32
// 456
// 10987
// 1112131415
import java.util.Scanner;
public class P11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=sc.nextInt();
        int count=1;
        for(int i=1;i<=n;i++){
            
            if(i%2!=0){
            for(int j=1;j<=i;j++){
               System.out.print(count);
               count++;
              }
            }
            else{
                int temp=count+i-1;
                for(int j=1;j<=i;j++){
                    System.out.print(temp);
                    temp--;
                    count++;
                    
                }
            }
             System.out.println();   
            }
            sc.close();
        }
    }

