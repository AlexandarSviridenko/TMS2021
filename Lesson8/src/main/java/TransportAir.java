public class TransportAir extends Transport {
    private int wingLength;
    private int minRunWay;

    public TransportAir(int power, int maxSpeed, int weight, String brand, int wingLength, int minRunWay) {
        super(power, maxSpeed, weight, brand);
        this.wingLength = wingLength;
        this.minRunWay = minRunWay;
    }
}

