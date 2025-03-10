import java.util.Scanner;
class Pallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter start:");
        int start=sc.nextInt();
        System.out.println("enter end:");
        int end=sc.nextInt();
        for(int i=start;i<=end;i++){
         int a=i;
        int rev=0;
        int temp=a;
        while(a>0){
            int b=a%10;
            rev=rev*10+b;
            a/=10;
        }
        if(rev==temp){
            System.out.println(i);
        }
        sc.close();
    }
}
}
