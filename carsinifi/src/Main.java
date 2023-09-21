public class Main {
    public static void main(String[] args) {
        Car audi =new Car(); // audi burda nesne.
        audi.model="Audi";
        audi.speed=10;
        audi.increaseSpeed(20);
        audi.decreaseSpeed(10);// metotla işlem yaptık
        System.out.println(audi.model+ " hızı  " + audi.speed);




        Car bmw = new Car();
        bmw.model="BMW";
        bmw.speed=20;
        bmw.increaseSpeed(20);
        bmw.increaseSpeed(200); // 180 sınırı dediğimiz için  bunu almadı
        System.out.println(bmw.model + " hızı  "+bmw.speed);

        Car mercedes = new Car();
        mercedes.model="Mercedes";
        mercedes.speed=30;
        System.out.println(mercedes.model+ " hızı "+mercedes.speed);




    }
}
