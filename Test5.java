import java.util.Scanner;
public class Test5 {
    public static void main(String[] args) {
        try( Scanner sc=new Scanner(System.in)){
           System.out.println("enter the year");
            int year=sc.nextInt();
            if(year%400==0||(year%4==0&&year%100!=0))
            {
                System.out.println("the year is leap year");
            }
            else{
                System.out.println("it is not a leap year");
            }
        }
    }
}
