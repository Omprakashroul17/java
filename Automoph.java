import java.util.Scanner;
public class Automoph {
    public static void main(String[] args) {
       try( Scanner sc=new Scanner(System.in)){
        System.out.println("enter a number:");
        int n=sc.nextInt();
        int sq=n*n;
        boolean flag=true;
        while(n>0){
            if(n%10!=sq%10){
                flag=false;
                break;
            }
            n/=10;
            sq/=10;
        }
        if(flag){
            System.out.println("it is a automorphic");
        }
        else{
            System.out.println("it is not a automorphic");
        }
       }
    }
}
