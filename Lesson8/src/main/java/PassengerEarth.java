public class PassengerEarth extends TransportEarth {
    private String bodyType;
    private int numberPassengers;

    public PassengerEarth(int power, int maxSpeed, int weight, String brand, int numberOfWheels, int needFuel, String bodyType, int numberPassengers) {
        super(power, maxSpeed, weight, brand, numberOfWheels, needFuel);
        this.bodyType = bodyType;
        this.numberPassengers = numberPassengers;
    }
}
