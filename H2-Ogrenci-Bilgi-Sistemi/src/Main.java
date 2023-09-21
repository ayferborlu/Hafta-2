// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Teacher t1= new Teacher("Mahmut Hoca",  "9058795136", "TRH");
        Teacher t2 = new Teacher("Graham Bell","89964","FZK");
        Teacher t3= new Teacher("Külyutmaz","99884","BIO");

        Course tarih= new Course("Tarih","101","TRH",20);
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik","102","FZK",20);
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji","101","BIO",20);
        biyo.addTeacher(t3);

        Student s1 = new Student("İnek Şaban","123","4",tarih,fizik,biyo);
        s1.addBulkExamNote(100,80,10, 100,20,90);

        s1.isPass();
    }
}