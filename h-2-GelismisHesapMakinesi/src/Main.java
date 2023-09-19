import java.util.Scanner;

public class Main {

    static int sum(int a,int b){
        int result = a + b;
        System.out.println("=====Toplam====== "+ result);
        return result;
    }

    static int cikarma(int a, int b){
        int result = a - b ;
        System.out.println("====Çıkarma====" + result);
        return result;
    }
    static int carpma(int a, int b){
        int result = a * b;
        System.out.println("====Çarpma Sonucu==== "+ result);
        return result;
    }
    static int bolme(int a, int b){
        int result = a / b;
        System.out.println("====Bölme Sonucu=== " + result);
        return result;
    }
    static int uslusayi(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++){
            result *= a;
    }
        return result;
    }
    static  int mod(int a, int b){
        int result= a % b;
        System.out.println("====Mod====" + result);
        return result;
    }
    static  void dalncvre( int a,int b) {
        System.out.println("Çevresi: " + (2 * (a + b)));
        System.out.println("Alanı: " + (a * b));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;


        String menu=  "1- toplama işlemi\n"
                + "2- çıkarma işlemi\n"
                + "3- çarpma işlemi\n"
                + "4- bölme işlemi\n"
                + "5- üslü sayı toplama\n"
                + "6- mod alma\n"
                + "7- dikdörtgen alan ve çevre hesabı\n"
                + " 0- çıkış yap";

        while(true){
            System.out.println(menu);
            System.out.print("Bir işlem seçiniz: ");
            select = input.nextInt();

            if(select==0){
                break;
            }

            System.out.print("İlk sayı: ");
            int a=input.nextInt();
            System.out.print("İkinci sayı: ");
            int b=input.nextInt();


            switch (select){
                case 1:
                  sum(a,b);
                    break;
                case 2:
                    cikarma(a,b);
                    break;
                case 3:
                    carpma(a,b);
                    break;
                case 4:
                    bolme(a,b);
                    break;
                case 5:
                    System.out.println("====Üslü Sayı=====" +uslusayi(a,b));
                    break;
                case 6:
                    mod(a,b);
                    break;
                case 7:
                   dalncvre(a,b);
                   break;



            }
        }

    }
}