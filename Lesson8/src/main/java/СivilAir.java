public class СivilAir extends TransportAir {
    private int numberPassengers;
    private boolean vip;

    public СivilAir(int power, int maxSpeed, int weight, String brand, int wingLength, int minRunWay, int numberPassengers, boolean vip) {
        super(power, maxSpeed, weight, brand, wingLength, minRunWay);
        this.numberPassengers = numberPassengers;
        this.vip = vip;
    }
}
