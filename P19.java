import java.util.Scanner;
public class P19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=sc.nextInt();
        int star=0;
        int space=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            if(i<=n/2) {
            star++;
            space--;
            }
            else{
                star--;
                space++;
            }
            System.out.println();
        }
        sc.close();
    }
}

