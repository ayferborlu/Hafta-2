public class Student {
    /*Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()*/

    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarege;
    boolean isPass;

    Student(String name, String stuNo,String classes, Course c1,Course c2,Course c3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.avarege=0.0;
        this.isPass=false;

    }

        // not girilmesi için:
    void addBulkExamNote(int sinavNotu1, int sozlunote1, int sinavNotu2, int sozlunote2, int sinavNotu, int sozlunote3) {
        if (sinavNotu1 >= 0 && sinavNotu1 <= 100) {
            c1.sinavNotu = sinavNotu1;
            this.c1.ortalamaNot = ((double) c1.sozluAgirlik / 100) * sozlunote1 + (c1.sinavNotu * ((double) (100 - c1.sozluAgirlik) / 100));
        }
        if (sinavNotu2 >= 0 && sinavNotu2 <= 100) {
            c2.sinavNotu = sinavNotu2;
            this.c2.ortalamaNot = ((double) c2.sozluAgirlik / 100) *sozlunote2 + (c2.sinavNotu * ((double) (100 - c2.sozluAgirlik) / 100));

        }
        if (sinavNotu >= 0 && sinavNotu <= 100) {
            c3.sinavNotu = sinavNotu;
            this.c3.ortalamaNot = ((double) c3.sozluAgirlik / 100) *sozlunote3 + (c3.sinavNotu * ((double) (100 - c3.sozluAgirlik) / 100));
        }

    }
    void isPass(){
        this.avarege=(this.c1.ortalamaNot + this.c2.ortalamaNot + this.c3.ortalamaNot) / 3.0;
        if(this.avarege>55){
            System.out.println("Sınıfı geçtiniz");

        }else{
            System.out.println("Kaldınız");
        }
        printNote();

    }

    void printNote(){     // burda c1 c2 c3 notunu bastırmak istedik
        System.out.println(c1.name + " Notu : " + c1.sinavNotu);
        System.out.println(c2.name + " Notu : " + c2.sinavNotu);
        System.out.println(c3.name + " Notu : " + c3.sinavNotu);
        System.out.println("Ortalamanız: "+ this.avarege);
    }

}