//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     *
import java.util.Scanner;
public class P13 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n:");
    int n=sc.nextInt();
    int space=n-1;
    int star=1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=space;j++){
            System.out.print(" ");
        }
    
    for(int j=1;j<=star;j++){
        System.out.print("*");
    }
    System.out.println();
    if(i<=n/2){
    space--;
    star+=2;
    }
    else{
        space++;
        star-=2;
    }
  }
    sc.close();
   } 
   
}

