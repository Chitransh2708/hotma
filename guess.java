import java.util.Scanner;

public class guess {
    public static void main(String[] args){
    comPare();
    table();
    }
    public static void comPare(){
        System.out.println("Please entre three no. to compare");
        Scanner input = new Scanner(System.in);
        int a=input.nextInt(), b=input.nextInt(), c=input.nextInt();
        if((a>b)&&(a>c))
        {
            System.out.println("Greatest no. is ");
            System.out.println(a);
        }
        else if(b>c)
        {   System.out.println("Your greatest integer is");
            System.out.println(b);
        }
        else{
            System.out.println("Your greatest integer is");
            System.out.println(c);
        }
    }
    public static void table(){
        Scanner input = new Scanner(System.in);
        System.out.print("entre the no. for table");
        int n=input.nextInt() ,i=1;
        while(i<=10){
            System.out.println(n*i);
            i++;
        }
    }
}
