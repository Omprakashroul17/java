
import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of row:");
        int n=sc.nextInt();
        char c='a';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                 if(i!=j){
                    System.out.print(j);
                 }
                 else{
                    System.out.print(c);
                    c++;
                 }
            }
            System.out.println();
    }
    sc.close();
}
}
