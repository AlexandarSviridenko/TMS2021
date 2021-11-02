public class TransportAir extends Transport {
    private int wingLength;
    private int minRunWay;

    public TransportAir(int power, int maxSpeed, int weight, String brand, int wingLength, int minRunWay) {
        super(power, maxSpeed, weight, brand);
        this.wingLength = wingLength;
        this.minRunWay = minRunWay;
    }

    public int getWingLength() {
        return wingLength;
    }

    public void setWingLength(int wingLength) {
        this.wingLength = wingLength;
    }

    public int getMinRunWay() {
        return minRunWay;
    }

    public void setMinRunWay(int minRunWay) {
        this.minRunWay = minRunWay;
    }
}

