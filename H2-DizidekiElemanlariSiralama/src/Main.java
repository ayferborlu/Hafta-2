import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);
  System.out.print("Dizinin boyutu ne kadar olsun: ");
  int diziUzunluk=scanner.nextInt();

  int[] sayilar = new int[diziUzunluk];

  for( int i =0; i<diziUzunluk  ;i++){

      System.out.print("Dizinin "+ (i)+ ". index değerini girin: ");
      sayilar[i] = scanner.nextInt();



      }
  }
    }
