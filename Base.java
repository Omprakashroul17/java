import java.util.Scanner;
class Base {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
        System.out.println("print b");
        int b= sc.nextInt();
        System.out.println("print p");
        int p= sc.nextInt();
        int res=1;
        for(int i=0;i<=p;i++){
           res *=b ;
        }
        System.out.println(res);
     }
   }
  }

