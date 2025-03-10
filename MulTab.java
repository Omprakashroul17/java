import java.util.Scanner;
class MulTab{
    public static void main(String[] args) {
      try(  Scanner sc=new Scanner(System.in)){
        System.out.println("enter a number");
        int a=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(a+"*"+i+"="+(a*i));
        }
    }
}
}