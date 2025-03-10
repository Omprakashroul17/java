import java.util.Scanner;
public class atRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter starting number:");
        int start=sc.nextInt();
        System.out.println("enter ending:");
        int end=sc.nextInt();
        int count=0;
        for(int num=start;num<=end;num++){
            int original=num;
            int sq=num*num;
            int copy=num;
            boolean isAuto=true;
            while(copy>0){
                if(copy%10!=sq%10){
                    isAuto=false;
                    break;
                }
                copy/=10;
                sq/=10;
            }
                if(isAuto){
                    count++;
                    if(count%2!=0){
                        System.out.println(original);
                    }
                    }
                }
            }
        }
    


