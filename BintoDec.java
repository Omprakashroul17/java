import java.util.Scanner;
class BintoDec{
    public static void main(String[] args) {
       try( Scanner sc=new Scanner(System.in)){
        System.out.println("enter a binary number");
        int n=sc.nextInt();
        int i=1;
        int dec=0;
        while(n>0){
            int bit=n%10;
            dec +=bit*i;
            n=n/10;
            i*=2;
        }
        System.out.println(dec);
       }
    }
}