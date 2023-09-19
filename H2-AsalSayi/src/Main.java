import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Lütfen bir sayı girin: ");
        var input = new Scanner(System.in).nextInt();

        boolean asalmi = isAsal(input, input-1);
        System.out.println("asal mı: "+ asalmi);

    }
    static boolean isAsal(int kontrolEdilecekSayi, int bolen){

        if (bolen == 1) {
            return true;
        }else{
            if(kontrolEdilecekSayi % bolen == 0){
                return false;
            }else{
                return isAsal(kontrolEdilecekSayi, bolen-1);
            }
        }

    }
}
