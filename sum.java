import java.util.Scanner;

public class sum {
    public static void main(String[] args){
        System.out.println("Program to entre two numbers");
        Scanner input = new Scanner(System.in);
        System.out.println("please entre two numbers");
        int a= input.nextInt();
        int b= input.nextInt();
        int sum=a+b;
        System.out.println("your answer is "+sum);

    }
}
