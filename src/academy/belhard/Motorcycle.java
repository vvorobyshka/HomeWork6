package academy.belhard;

public class Motorcycle extends Vehicle{
    public Motorcycle(int wheelCount) {
        super(wheelCount);
    }
    private int maxSpeed;

    public Motorcycle(int wheelCount, int maxSpeed) {
        super(wheelCount);
        this.maxSpeed = maxSpeed;
    }

    @Override
    protected void printInfo() {
        System.out.println("Транспортное средство: Мотоцикл");
        System.out.println("Количество колес " + wheelCount);
        System.out.println("Максимальная скорость " + maxSpeed);
    }
}
