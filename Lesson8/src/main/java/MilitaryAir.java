import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MilitaryAir extends TransportAir {
    private boolean ejectionSystem;
    private int numberMissiles;
    private double powerKV;

    public MilitaryAir(int power, int maxSpeed, int weight, String brand, int wingLength, int minRunWay, boolean ejectionSystem, int numberMissiles) {
        super(power, maxSpeed, weight, brand, wingLength, minRunWay);
        this.ejectionSystem = ejectionSystem;
        this.numberMissiles = numberMissiles;
        this.powerKV = power * 0.74;
    }

    public void militaryAirInfo() {
        System.out.println(getPower() + getMaxSpeed() + getWeight() + getBrand() + getWingLength() + getMinRunWay() + ejectionSystem + numberMissiles);
    }

    public void shot() {
        if (numberMissiles > 0) {
            System.out.println("Ракета пошла");
        } else {
            System.out.println("Ракеты закончились");
        }
    }

    public void catapult() {
        if (ejectionSystem = false) {
            System.out.println("У Вас нету такой системы");
        } else {
            System.out.println("Катапультирование прошло успешно");
        }
    }
}
