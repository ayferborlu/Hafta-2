import java.util.Scanner;
public class Main {

    static   int usalma(int alt,int us) {
        int sonuc = 1;

        for (int i = 1; i <= us; i++) {

            sonuc *= alt;
        }
        return sonuc;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1.sayıyı girin: " );
        int alt=input.nextInt();
        System.out.print("2.sayıyı girin: " );
        int us=input.nextInt();

        int sonuc = usalma( alt,us);
        System.out.println(alt + "^" + us + "=" + sonuc);






    }
}
