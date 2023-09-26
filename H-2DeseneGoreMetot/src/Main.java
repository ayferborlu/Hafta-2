import java.util.Scanner;

public class Main {

    static int sayiAzalt(int sayi, int a) {
        System.out.print(sayi+" ");
        if (sayi > 0) {
            sayi -= 5;

            return sayiAzalt(sayi,a);

        } else {
            sayiArttır(sayi, a);
        }
        return 0;
    }

    static int sayiArttır(int sayi, int a) {
        if (sayi < a) {
            sayi +=5;

            System.out.print(sayi+" ");

            return sayiArttır(sayi,a);
        }
        else {
            return sayi;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("A sayısı : ");

        int a = input.nextInt();

        System.out.print("Çıktısı : ");
        sayiAzalt(a,a);



    }
}