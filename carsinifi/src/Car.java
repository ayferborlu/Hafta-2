class Car {
    // Arabaya ait nitelikler.nitelikleri değişkenlerle belirleriz ve değişkenleri her zmaan üste koyarız.
    String type;
    String model;
    String color;
    int speed;
    int speedLimit = 180;

    // arabanın hızını artırmak istiyoruz. increaseSpeed : hız arttırma increment: arttıtrılacak değer ne kadar arttırılacak.
    void increaseSpeed(int increment) {
        if ((speed + increment) < speedLimit) {
            speed += increment;
        }
    }

    // decreasespeed= hız arttırma

    void decreaseSpeed( int decrease) {
        if( speed >0){
            speed-=decrease;
        }
    }

    // arabanızın hızını ekrana bastır:
    void printSpeed(){
        System.out.print(model + " Hızınız: " + speed);
    }

}
