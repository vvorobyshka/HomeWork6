package academy.belhard;

public class Main {

    public static void main(String[] args) {
        Vehicle carBig = new Car(4,5);
        Car carSmall = new Car(4,3);
        Motorcycle motorcycleBig = new Motorcycle(3,300);
        Motorcycle motorcycleSmall = new Motorcycle(2,200);

        carBig.printInfo();
        carSmall.printInfo();
        motorcycleBig.printInfo();
        motorcycleSmall.printInfo();
    }
}
