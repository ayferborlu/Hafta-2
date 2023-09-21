public class Boksor {
    String isim;
    int hasar;
    int can;
    int agirlik;

    Boksor(String isim, int hasar, int can, int agirlik) {
        this.isim = isim;
        this.hasar = hasar;
        this.can = can;
        this.agirlik = agirlik;
    }

    void vurma(Boksor rakip, Musabaka m) {
        System.out.println(this.isim + " => " + rakip.isim + " e  " + this.hasar + " hasarlık vurdu ");
        rakip.can -= hasar;
        if (rakip.can <= 0) {
            rakip.can = 0;
            m.kaybeden = rakip;
            m.kazanan = this;

        }
        if (rakip.can < 10) {
            System.out.println(m.hakem.ad + "Hakem canı 10 dan az kalana müdehale eder");


        }
    }

}
