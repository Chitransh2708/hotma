import java.util.Scanner;

public class ifelse {
    public static void main(String[] args){
        System.out.println("Please entre two no. to compare");
        Scanner input = new Scanner(System.in);
        int a=56,b=10;
        if( a > b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
        for(int i=1;i<5;i++) {
            System.out.println(i * i);
        }

    }
}
