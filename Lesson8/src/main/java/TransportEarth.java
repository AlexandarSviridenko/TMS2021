
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransportEarth extends Transport {
    private int numberOfWheels;
    private int needFuel;

    public TransportEarth(int power, int maxSpeed, int weight, String brand, int numberOfWheels, int needFuel) {
        super(power, maxSpeed, weight, brand);
        this.numberOfWheels = numberOfWheels;
        this.needFuel = needFuel;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getNeedFuel() {
        return needFuel;
    }

    public void setNeedFuel(int needFuel) {
        this.needFuel = needFuel;
    }
}

