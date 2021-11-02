import java.util.Scanner;

public class PassengerEarth extends TransportEarth {
    private String bodyType;
    private int numberPassengers;
    private int time;
    private int way;
    private double fuel;
    private double powerKV;

    public PassengerEarth(int power, int maxSpeed, int weight, String brand, int numberOfWheels, int needFuel, String bodyType, int numberPassengers, int time) {
        super(power, maxSpeed, weight, brand, numberOfWheels, needFuel);
        this.bodyType = bodyType;
        this.numberPassengers = numberPassengers;
        this.time = time;
        this.way = way;
        this.fuel = fuel;
        this.powerKV = power * 0.74;
        ;
    }

    public void passengerEarthInfo() {
        System.out.println(getPower() + getMaxSpeed() + getWeight() + getBrand() + getNumberOfWheels() + getNeedFuel() + bodyType + numberPassengers + time);
    }


    public void drive() {
        way = getMaxSpeed() * time;
        fuel = (way / 100) * getNeedFuel();
        System.out.println(time + way + fuel);


    }
}
