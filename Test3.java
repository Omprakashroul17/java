import java.util.Scanner;
public class Test3 {
    public static void main(String[] args) {
    try(Scanner sc=new Scanner(System.in)){
      System.out.println("enter two numbers"); 
      int a=sc.nextInt();
      int b=sc.nextInt();
      if(a>b){
        System.out.println("a is greater");
      }
      else if(b>a){
        System.out.println("b is greater");
      }
      else{
        System.out.println("both are same");
      }
    }
}
}