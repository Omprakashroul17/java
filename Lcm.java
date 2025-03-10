import java.util.Scanner;
class Lcm {
    public static void main(String[] args) {
       try( Scanner sc=new Scanner(System.in)){
        System.out.println("enter num1:");
        int a=sc.nextInt();
        System.out.println("enter num2:");
        int b=sc.nextInt();
        int c=a>b?b:a;
        //find the hcf of both number
        int hcf=1;
        for(int i=c;i>=1;i--){
            if(a%i==0 && b%i==0){
                hcf=i;
                break;
            }
        }
        //there is a method lcm*hcf=num1*num2
        int lcm=(a*b)/hcf;
        System.out.println("the lcm of two numbers are:"+lcm);
       }
    }
}
