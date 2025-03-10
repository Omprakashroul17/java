import java.util.Scanner;
class Cnt {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
        System.out.println("print a number");
        int n= sc.nextInt();
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println("the numbers present are:"+count);
        }
    }
}