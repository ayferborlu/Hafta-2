import java.lang.reflect.Array;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static boolean isFind(int[] arr, int value){
        for( int i : arr) {
            if ( i==value){
                return true;
            }

        }
        return false;

    }
    public static void main(String[] args) {
        int list[] = {3, 7, 8, 9, 2, 8, 4, 3, 1, 6};
        int[] dublicate = new int[list.length];
        int starIndex = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if(!isFind(dublicate , list[i])){
                        dublicate[starIndex++] = list[i];
                    }
                    break;

                }
            }
        }
        for(int value : dublicate){
            if(value %2==0){
                System.out.println(value);
            }
        }

    }
}