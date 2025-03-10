import java.util.Scanner;
public class Test4 {
    public static void main(String[] args) {
    try(Scanner sc=new Scanner(System.in)) {
    System.out.println("enter a:");
    double a=sc.nextDouble();
    System.out.println("enter b:");
    double b=sc.nextDouble();
    System.out.println("enter c:");
    double c=sc.nextDouble();
    double result=b*b-4*a*c;
    if(result>0.0){
        double r1=-b+Math.pow(result, 0.5)/(2.0*a);
        double r2=-b-Math.pow(result, 0.5)/(2.0*a);
        System.out.println("the roots are:"+r1+"and"+r2);
    }
    else if(result==0.0){
       double r1=-b/(2.0*a);
       System.out.println("the root is:"+r1);
    }
    else{
        System.out.println("the equation has no real roots");
    }
    }     
    }
    
}
