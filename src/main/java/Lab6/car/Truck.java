package Lab6.car;

public class Truck extends Car {

    private int wheelsCount;
    private double maxWeight;

    public Truck(int weight, String model, char color, float speed, int wheelsCount, double maxWeight) {
        super(weight, model, color, speed);
        this.wheelsCount = wheelsCount;
        this.maxWeight = maxWeight;
    }

    public void newWheels(int newCount) {
        this.wheelsCount = newCount;
        System.out.println(this.wheelsCount);
    }
}
