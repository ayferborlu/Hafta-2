import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int[] list = {56, 34, 1, 8, 101, -2, -33};


        int min = list[0];
        int max = list[0];

        System.out.print("Lütfen bir sayı girin: ");
        int  input= new Scanner(System.in).nextInt();

       Arrays.sort(list);


        int enYakinKucukSayi=-99999999 , enYakinBuyukSayi=-99999999;
        if (input > list[list.length-1]){
            enYakinKucukSayi = list[list.length-1];
        }
        if(input < list[0]){
            enYakinBuyukSayi = list[0];
        }

        for (int i=0;i<list.length;i++) {
            if(input<list[i]){
                enYakinBuyukSayi= list[i];
                if( i>=1) {
                    enYakinKucukSayi = list[i - 1];
                }
                break;
            }
        }

        System.out.println("En yakın küçük sayı " + enYakinKucukSayi);
        System.out.println("En yakın büyük sayı  " + enYakinBuyukSayi);

    }
}