import java.util.Scanner;
public class P18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=sc.nextInt();
        int star=1;
        int space=n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=star;j++){
                if(j==1||j==star){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            if(i<=n/2){
            star+=2;
            space--;
            }
            else{
                star-=2;
                space++;
            }
            System.out.println();
        }
        sc.close();
    }
}
