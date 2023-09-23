import java.lang.reflect.Array;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args) {
        int liste[] = {1, 2, 2, 2, 2, 3, 4, 5, 5, 5, 6, 6, 8, 8};

        int count = 0;

        Arrays.sort(liste); // Dizideki elemanları küçükten büyüğe sırala

        for (int i = 0; i < liste.length; i++) {
            count = 0;
            for (int j = 0; j < liste.length; j++) {
                if (liste[i] == liste[j]) {
                    count++;

                }
            }

            if (i == 0 && liste[i + 1] != liste[i]) {
                System.out.println(String.format("%d sayısı %d kere tekrar edildi.", liste[i], count));
            }

            if (i != 0 && liste[i - 1] != liste[i]) {
                System.out.println(String.format("%d sayısı %d kere tekrar edildi.", liste[i], count));
            }

        }
    }
}