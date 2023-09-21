import java.util.Random;

public class Musabaka {
    Boksor b1;
    Boksor b2;
    int minagirlik;
    int maxagirlik;
    Boksor kaybeden;
    Boksor kazanan;
    Hakem hakem;

    Musabaka(Boksor b1, Boksor b2, int minagirlik, int maxagirlik, Hakem hakem) {
        this.b1 = b1;
        this.b2 = b2;
        this.minagirlik = minagirlik;
        this.maxagirlik = maxagirlik;
        this.kazanan = new Boksor("", 0, 0, 0);
        this.kaybeden = new Boksor("", 0, 0, 0);
        this.hakem = hakem;
    }

    void run() {
        Random r = new Random();
        if (kontol()) {
            while (this.b1.can > 0 && this.b2.can > 0) {
                var vuracakBoksorNumarasi = r.nextInt(1, 3);
                if (vuracakBoksorNumarasi == 1) {
                    b1.vurma(b2, this);
                } else {
                    b2.vurma(b1, this);
                }
            }
            System.out.println(kaybeden.isim + " Kaybetti. " + kazanan.isim + "kalan canı:" + kazanan.can);

        } else {
            System.out.println("Sporcuların ağırlıkları uymuyor");
        }
    }

    boolean kontol() {
        return (this.b1.agirlik >= minagirlik && this.b1.agirlik <= maxagirlik) && (this.b2.agirlik >= minagirlik && this.b2.agirlik <= maxagirlik);
    }
}
