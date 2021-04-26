package academy.belhard;

public class Car extends Vehicle implements Costable{
    public Car(int wheelCount) {
        super(wheelCount);
    }

    private int doorsCount;
    private int cost = 30000;

    public Car(int wheelCount, int doorsCount) {
        super(wheelCount);
        this.doorsCount = doorsCount;
    }

    @Override
    protected void printInfo() {
        System.out.println("Транспортное средство: Машина");
        System.out.println("Количество колес: " + wheelCount);
        System.out.println("Количество дверей: " + doorsCount);
        System.out.println("Цена: " + getCost());
    }

    @Override
    public int getCost() {
        return cost;
    }
}
