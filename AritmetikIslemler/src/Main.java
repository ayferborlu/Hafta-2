import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b,c;

        System.out.print("Lütfen 1. sayıyı girin : ");
        a = input.nextInt();
        System.out.print("Lütfen 2. sayıyı girin: ");
        b= input.nextInt();
        System.out.print("Lütfen 3. sayıyu girin: ");
        c = input.nextInt();

        int result= a+b*c-b;

        System.out.println("Formül : a+b*c-b");

        System.out.println(result);


    }
}