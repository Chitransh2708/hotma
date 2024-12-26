import java.util.Scanner;

import static java.lang.System.*;

public class Main {
        public static void main(String[] args ){
        System.out.println("Program of add of two no.");
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter two value to add");
        int a = input.nextInt();
        int b= input.nextInt();
        System.out.println("your ans is ");
        System.out.println( b + a );
    }
}