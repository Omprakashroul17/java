// WAP to check the number is even or odd using bitwise operator
import java.util.Scanner;
class A
{
    public static void main(String[] args) {
       try (Scanner sc= new Scanner(System.in)){
        System.out.println("enter a number:");
        int a=sc.nextInt();
        if((a&1)==0)
        {
          System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
}
}