public class СivilAir extends TransportAir {
    private int numberPassengers;
    private boolean vip;
    private double powerKV;
    private int capacity;

    public СivilAir(int power, int maxSpeed, int weight, String brand, int wingLength, int minRunWay, int numberPassengers, boolean vip, int capacity) {
        super(power, maxSpeed, weight, brand, wingLength, minRunWay);
        this.numberPassengers = numberPassengers;
        this.vip = vip;
        this.powerKV = power * 0.74;
        this.capacity = capacity;
    }

    public void civilAirInfo() {
        System.out.println(getPower() + getMaxSpeed() + getWeight() + getBrand() + getWingLength() + getMinRunWay() + numberPassengers + vip);
    }

    public void capacity() {
        if (capacity <= numberPassengers) {
            System.out.println("Все пассажиры заняли все свои места");
        } else {
            System.out.println("Слишком много пассажиров, нужен самолет по больше");
        }
    }
}
