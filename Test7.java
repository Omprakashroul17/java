import java.util.Scanner;
public class Test7 {
    public static void main(String[] args) {
      try(  Scanner sc=new Scanner(System.in)){
        System.out.println("enter a character");
        char c=sc.next().charAt(0);
        switch (c) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u': 
            case 'U':   
                System.out.println("vowel");break;
        
            default:
                System.out.println("not a vowel");
                break;
        }
      }
    }
}
