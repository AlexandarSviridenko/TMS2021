
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class CargoEarth extends TransportEarth {
    private int liftingCapacity;
    private double powerKV;
    private int capacity;

    public CargoEarth(int power, int maxSpeed, int weight, String brand, int numberOfWheels, int needFuel, int liftingCapacity, int capacity) {
        super(power, maxSpeed, weight, brand, numberOfWheels, needFuel);
        this.liftingCapacity = liftingCapacity;
        powerKV = power * 0.74;
        this.capacity = capacity;
    }

    public void cargoEarthInfo() {
        System.out.println(getPower() + "л.с.," + getMaxSpeed() + "км/ч," + getWeight() + "кг," + getBrand() + getNumberOfWheels() + getNeedFuel() + "л/100км," + liftingCapacity + powerKV + " Кв");
    }

    public void capacity() {     // вместимость груза
        if (capacity <= liftingCapacity) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик по больше");
        }
    }
}


