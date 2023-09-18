
public class Main {
    static boolean isPalindrom( int sayi) {
        // kullanıcıdan bir sayı alıcaz. girdiği sayı ile tersi aynı mı bakmamız için
        int temp = sayi, terssayi = 0, sonsayi;
        while (temp != 0) {
            System.out.println("Sayı == " + temp);

            sonsayi = temp % 10;
            System.out.println("Son basamak== " + sonsayi);

            terssayi = (terssayi * 10) + sonsayi;
            System.out.println(("Yeni sayı== " + terssayi));
            temp /= 10;
        }
        if(sayi==terssayi)
            return true;
        else
            return false;

    }



    public static void main(String[] args) {

        System.out.println(isPalindrom(145));

    }
}