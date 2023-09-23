// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] numbers = {10,10,10,10};
        double harmonikseri = 0;
        for (int i = 0; i < numbers.length; i++) {

         harmonikseri +=( double) 1/(i+1);
        }

        System.out.println(numbers.length/harmonikseri);
    }
}