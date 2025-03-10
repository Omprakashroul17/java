import java.util.Scanner;
class DectoBin{
    public static void main(String[] args) {
       try( Scanner sc=new Scanner(System.in)){
        System.out.println("enter a number");
        int n=sc.nextInt();
        int i=1;
        int bin=0;
        while(n>0){
            int bit=n%2;
            bin +=(bit*i);
            n=n/2;
            i*=10;
        }
        System.out.println(bin);
       }
    }
}
