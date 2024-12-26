import java.util.Scanner;

public class swap {
    public static void main(String[] args){
        System.out.println("Please enter two no. to swap");
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=a;
        a=b;
        b=c;
        System.out.println("Your number is :");
        System.out.println("now value of a is :" +a);
        System.out.println("now value of b is :" +b);
    }
}
