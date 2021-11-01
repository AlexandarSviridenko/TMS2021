public class CargoEarth extends TransportEarth {
    private int liftingCapacity;

    public CargoEarth(int power, int maxSpeed, int weight, String brand, int numberOfWheels, int needFuel, int liftingCapacity) {
        super(power, maxSpeed, weight, brand, numberOfWheels, needFuel);
        this.liftingCapacity = liftingCapacity;
    }
}

