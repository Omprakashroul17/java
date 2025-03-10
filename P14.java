// *********
// **** ****
// ***   ***
// **     **
// *       *
// **     **
// ***   ***
// **** ****
// *********
import java.util.Scanner;
public class P14{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=sc.nextInt();
        int space=1;
        int star=n/2;
        for(int i=1;i<=n;i++){
            if(i==1||i==n){
            for(int j=1;j<=n;j++){
            System.out.print("*");
        }
        System.out.println();
        continue;
    } 
    for(int j=1;j<=star;j++)   {
        System.out.print("*");
    }
    for(int j=1;j<=space;j++){
        System.out.print(" ");
    }
    for(int j=1;j<=star;j++)   {
        System.out.print("*");
    }
    System.out.println();
    if(i<=n/2){
      space+=2;
      star--;
    }
    else{
        space-=2;
        star++;
    }
}
sc.close();
}
}




