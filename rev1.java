import java.util.Scanner;

public class rev1{
    public static void main(String[] args){
        System.out.print("please entre the size of array");
        Scanner input = new Scanner(System.in);
        int size=input.nextInt();
        int[] arr1=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("element no."+(i+1)+" ");
            arr1[i]= input.nextInt();
        }

        for(int i=0;i<size;i++){
            System.out.println("your element is "+arr1[i]);
        }

    }
}