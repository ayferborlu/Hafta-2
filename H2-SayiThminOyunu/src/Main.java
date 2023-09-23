import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
      //  int number =(int)( Math.random() * 100);

        Scanner input=new Scanner(System.in);

        int right = 0;
       int selected ;
       int[] wrong = new int[5];
       boolean isWin=false;
       System.out.println(number);


        while(right<5) {
            System.out.print("Lütfen tahmininizi girin: ");
            selected = input.nextInt();

            if(selected<0 || selected>99){
                System.out.println("Lütfen 0-100 arasında bir sayı girin");
                continue;
            }
            if(selected==number){
                System.out.print("Doğru tahmin! Tahmin ettiğiniz sayı:" +number);
                isWin=true;
                break;
            }else{


                System.out.println("Hatalı bir sayı girdiniz");
                if(selected>number){
                    System.out.println(selected + "sayısı gizli sayıdan büyüktür. ");
                }else{
                    System.out.println(selected + "sayısı gizli sayıdan küçüktür. ");
                }
                wrong[right++]= selected;

                System.out.println("Kalan hakkı: " +(5-right));
            }
        }
        if( !isWin){
            System.out.println("KAYBETTİNİZ.");
            System.out.println("Tahminleriniz: "+ Arrays.toString(wrong));
        }
    }
}