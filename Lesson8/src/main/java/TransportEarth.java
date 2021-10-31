public class TransportEarth extends Transport {
    private int numberOfWheels;
    private int needFuel;

    public TransportEarth(int power, int maxSpeed, int weight, String brand, int numberOfWheels, int needFuel) {
        super(power, maxSpeed, weight, brand);
        this.numberOfWheels = numberOfWheels;
        this.needFuel = needFuel;
    }
}

