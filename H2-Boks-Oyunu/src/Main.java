// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Boksor b1 = new Boksor("Ali", 10, 120, 100);
        Boksor b2 = new Boksor("Veli", 20, 85, 100);


        Hakem hakem = new Hakem(" Yalçın ");

        Musabaka musabaka = new Musabaka(b1, b2, 100, 110, hakem);
        musabaka.run();
    }
}